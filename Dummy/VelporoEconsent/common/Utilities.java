package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class Utilities
{
		protected static WebDriver driver;
		public static String TC_Key;
		public static String portalName;
		static Workbook wbook;
	    static WritableWorkbook wwbCopy;
	    static String ExecutedTestCasesSheet;
	    static WritableSheet shSheet;
	    public static int totalNoOfRows;
	    public static File dataFile = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xls");
	    	    

		public static void writeToExcel(int col,int row,String status) throws IOException, RowsExceededException, WriteException
		{
				try
				{
					Workbook workbook = Workbook.getWorkbook(dataFile);
					File actFile = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xls");
					File backUpFile = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\backup\\testData"+timeStamp()+".xls");
					WritableWorkbook workcopy = Workbook.createWorkbook(actFile, workbook);
					WritableSheet sheet2 = workcopy.getSheet(Utilities.portalName);
					Label lab = new Label(col, row,status);
					sheet2.addCell(lab);
					 WritableCell c = sheet2.getWritableCell(col,row);
					 WritableCellFormat newFormat = new WritableCellFormat();
					 if(status.equalsIgnoreCase("pass"))
					 {
						 newFormat.setBackground(Colour.GREEN);
						 c.setCellFormat(newFormat);
					 }
					 else
					 {
						 newFormat.setBackground(Colour.RED);
						 c.setCellFormat(newFormat); 
					 }
					workcopy.write();
					workcopy.close();
					Files.copy(dataFile.toPath(), backUpFile.toPath());
//					if(dataFile.delete())
//					{
//						actFile.renameTo(dataFile);
//					}
				}
				catch(Exception e)
				{
					
				}
			 
		}

	    
	    public static String readFromExcel(int col,int row) throws BiffException, IOException
	    {
	    	String portalName = Utilities.portalName;
	    	FileInputStream fs = new FileInputStream(dataFile);
	    	Workbook wb = Workbook.getWorkbook(fs);
	    	Sheet sh = null;
	    	String data;

	    	switch (portalName) 
	    	{
		    	case "nordicare":
		    		sh = wb.getSheet("nordicare");
					break;
				case "fedia":
					sh = wb.getSheet("fidia");
					break;
				case "cimplicity":
					sh = wb.getSheet("cimplicity");
					break;
				case "snf":
					sh = wb.getSheet("snf");
					break;
				
				case "econsent":
					sh = wb.getSheet("econsent");
					break;	
					
				case "velporo":
					sh = wb.getSheet("velporo");
					break;
				default:
					break;
			}	    	
	    	
	    	totalNoOfRows = sh.getRows();
	    	data = sh.getCell(col, row).getContents().trim();
	    	return data; 	    	
	    	
	    }
	    
	   
		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Harsh Dimri																         *
		 * Date			:	09-07-2016																	 	 *
		 * Description	:	This function is being used to get the property values from property file        *
		 * Version		: 	V0.2                                                                             *
		 * Updated By   : 	Suresh Damodaran																                 *
		 * Comments     :     						                                                         *
		 *****************************************************************************************************/
				
//		public static String getProperty(String propertyName) throws IOException
//		{
//			
//			Properties prop = new Properties();
//			FileInputStream fs;
//			switch (portalName) 
//			{
//			case "nordicare":
//				fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config_nodicare.properties");
//				prop.load(fs);
//				break;
//			case "fedia":
//				fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config_fedia.properties");
//				prop.load(fs);
//				break;
//			case "cimplicity":
//				fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config_cimplicity.properties");
//				prop.load(fs);
//				break;
//			case "snf":
//				fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config_snf.properties");
//				prop.load(fs);
//				break;
//			default:
//				break;
//			}
//			
//			 return (String) prop.get(propertyName);
//		}
		
		
		

		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Harsh Dimri																         *
		 * Date			:	09-07-2016																	 	 *
		 * Description	:	This function is being used to open the browser with the URL					 *
		 * Version		: 	V0.1.1                                                                             *
		 * Updated By   : 	Suresh Damodaran																 *
		 * Comments     :   Updated the start chrome browser functionality  by disabling extensions          
		 * @throws BiffException *
		 *****************************************************************************************************/

		public static WebDriver startApplication() throws IOException, BiffException 
		
		{
			String browser = readFromExcel(0, 1);
					
			if(browser.equals("firefox"))
			
			{
				driver = new FirefoxDriver();
			}
			if(browser.equals("ie"))
			
			{
				System.setProperty("webdriver.ie.driver",(System.getProperty("user.dir")+ "\\src\\test\\resources\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();
			}	
			
			if(browser.equals("chrome"))
				
			{
				System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir")+ "\\src\\test\\resources\\chromedriver.exe"));
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-extensions");
				driver = new ChromeDriver(options);
			}	
			
		if(browser.equals("safari"))
			
		{
			driver = new SafariDriver();
		}
			driver.get(Utilities.readFromExcel(1, 1));
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			return driver;
		
		}
			
		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Harsh Dimri																         *
		 * Date			:	09-06-2016																	 	 *
		 * Description	:	This function is used to create random number                                    *
		 * Updated By   : 						                                                             *
		 * Version		: 	V0.1																			 *
		 * 																									 *
		 *****************************************************************************************************/
		public static String getRandomNumber() throws InterruptedException{
			String updatedNumberrandom;
			Random rand = new Random();
			int num1, num2, num3;
		    num1 = rand.nextInt (900) + 100;
		    num2 = rand.nextInt (643) + 100;
		    num3 = rand.nextInt (9000) + 1000;
		    
		    updatedNumberrandom =  String.valueOf(num1+"-"+num2+"-"+num3);
		  	return updatedNumberrandom;
		    
		}
		
		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Suresh Damodaran																 *
		 * Date			:	09-06-2016																	 	 *
		 * Description	:	This function is used to create random number of the provided size               *
		 * Updated By   : 	Suresh Damodaran						                                         *
		 * Version		: 	V0.1																			 *
		 * 																									 *
		 *****************************************************************************************************/

		public static String createNDigitRandomNumber(int number)
        {
                 return String.valueOf(number < 1 ? 0 : new Random().nextInt((9 * (int) Math.pow(10, number - 1)) - 1)+ (int) Math.pow(10, number - 1));
        }


		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Suresh Damodaran																 *
		 * Date			:	09-06-2016																	 	 *
		 * Description	:	This function is being used to wait until Page loads	                         *
		 * Updated By   : 	Suresh Damodaran						                                         *
		 * Version		: 	V0.1																			 *
		 * 																									 *
		 *****************************************************************************************************/
		public static void waitPageLoad()
		{
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			(new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
			      public Boolean apply(WebDriver d) {
			        return (((org.openqa.selenium.JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
			      }
			    });
			System.out.println("Waited for Page load");
		}
		
		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Suresh Damodaran													             *
		 * Date			:	09-06-2016																		 *
		 * Description	:	This function is being used to take screen shot of the Page						 *
		 * Updated By   : 	Suresh Damodaran                                                                 *
		 * Version		: 	V0.1																			 *
		 * 																									 *
		 *****************************************************************************************************/
		public static void captureScreenshot(String MethodName,String sStatus){
			String sScreenShotPath = System.getProperty("user.dir") + "\\src\\test\\resources\\screenshots";
			System.out.println(sScreenShotPath);
			try
			{
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				if (sStatus.equalsIgnoreCase("PASS"))
				{
					String path = sScreenShotPath+ "\\" + Utilities.TC_Key + "\\"  +"Pass_"+MethodName + timeStamp() + ".png"; 
					FileUtils.copyFile(scrFile, new File(path));
				}
				else if(sStatus.equalsIgnoreCase("FAIL"))
				{
					String path = sScreenShotPath+ "\\" + Utilities.TC_Key + "\\" +"Fail_"+MethodName+timeStamp() + ".png"; 
					FileUtils.copyFile(scrFile, new File(path));
					Reporter.log("<a href=" + path + " target='_blank' >" +
							path + "</a>");
				}
			
				Reporter.log("Screen Shot Taken Pasted");				
			}
			catch (Exception e)
			{
				Reporter.log("Error Occured while pasting screen shot");
			}
		}
		
		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Suresh Damodaran																 *
		 * Date			:	09-06-2016																		 *
		 * Description	:	This function is being used to get the current time stamp                        *
		 * Updated By   : 	Suresh Damodaran                                        						 *
		 * Version		: 	V0.1																			 *
		 * 																									 *
		 *****************************************************************************************************/
		
		public static String timeStamp() throws Exception {
			String timeStamp,tempStr,tempStr1;
			Date todaysDate = new Date();	       
		    DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		    timeStamp = df.format(todaysDate);
		    tempStr = timeStamp.replace(" ", "_");
		    tempStr1 = tempStr.replace(":", "");
		    timeStamp = tempStr1.replace("-", "_");
		    return timeStamp;
		}
		
		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Suresh Damodaran																 *
		 * Date			:	09-06-2016																		 *
		 * Description	:	This function is being used to perform some browser level actions.			 	 *
		 * Version		: 	V0.1																			 *
		 * 																									 *
		 *****************************************************************************************************/
		
		public static boolean browserFunctions(String browserFunction) {
			
			JavascriptExecutor jse;
			if (browserFunction.equalsIgnoreCase("REFRESH")) {
				try {
					driver.navigate().refresh();
					return true;
				}
				
				catch(Exception e) {
					e.printStackTrace();
					return false;
				}
			}
			
			else if (browserFunction.equalsIgnoreCase("GOBACK")) {
				try {
					driver.navigate().back();
					return true;
				}
				
				catch(Exception e) {
					e.printStackTrace();
					return false;
				}
			}
			
			else if (browserFunction.equalsIgnoreCase("GOFORWARD")) {
				try {
					driver.navigate().forward();
					return true;
				}
				
				catch(Exception e) {
					e.printStackTrace();
					return false;
				}
			}
			
			else if (browserFunction.equalsIgnoreCase("SCROLLDOWN")) {
				try {
					jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(0,300)", "");
					return true;
				}
				
				catch(Exception e) {
					e.printStackTrace();
					return false;
				}
			}
			
			else if (browserFunction.equalsIgnoreCase("SCROLLUP")) {
				try {
					jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(0,-300)", "");
					return true;
				}
				
				catch(Exception e) {
					e.printStackTrace();
					return false;
				}
			}
			
			else if (browserFunction.equalsIgnoreCase("SCROLLRIGHT")) {
				try {
					jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(300, 0)", "");
					return true;
				}
				
				catch(Exception e) {
					e.printStackTrace();
					return false;
				}
			}
			
			else if (browserFunction.equalsIgnoreCase("SCROLLLEFT")) {
				try {
					jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(-300, 0)", "");
					return true;
				}
				
				catch(Exception e) {
					e.printStackTrace();
					return false;
				}
			}
			
			else {
				Reporter.log("Could not find the suitable function");
				return false;
			}
			
		}
	
		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Suresh Damodaran																 *
		 * Date			:	09-07-2016																		 *
		 * Description	:	This function is being used to perform to text comparsion	                     *
		 * Updated By   : 	Suresh Damodaran                                            		 	         *
		 * Version		: 	V0.1																			 *
		 * 																									 *
		 *****************************************************************************************************/

		public static void verifyAndValidateText(String sExpected, String sActual, String msg) throws SQLException, ClassNotFoundException 
		{
			System.out.println("Inside Verify and Validate Function");
			try{
					if(sExpected.trim().equalsIgnoreCase(sActual.trim())||sActual.trim().contains(sExpected.trim()))
					{
						Reporter.log("The validation is success for the method "+Utilities.TC_Key);
					}
					else
					{
						Reporter.log("The validation is a failure for the method "+Utilities.TC_Key+" while testing the "+msg+" functionality");
						captureScreenshot(msg,"fail");
						Assert.assertEquals(sActual, sExpected,"The validation is a failure for the method "+Utilities.TC_Key+" while testing the "+msg+" functionality");
					}
				
					System.out.println("End of Verify and Validate function");
			
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Suresh Damodaran																 *
		 * Date			:	09-08-2016																	 	 *
		 * Description	:	This function is used to check whether the locator exists or not                 *
		 * Updated By   : 	Suresh Damodaran						                                         *
		 * Version		: 	V0.1																			 *
		 * 																									 *
		 *****************************************************************************************************/	
		
		public static boolean elementExists(String LocatorType,String LocatorValue){
			int elementSize = 0;
			try{
				
			if (LocatorType.equalsIgnoreCase("xpath")){
				elementSize = driver.findElements(By.xpath(LocatorValue)).size();
			}else if (LocatorType.equalsIgnoreCase("id")){
				elementSize = driver.findElements(By.id(LocatorValue)).size();
			}else if (LocatorType.equalsIgnoreCase("name")){
				elementSize = driver.findElements(By.name(LocatorValue)).size();
			}else if (LocatorType.equalsIgnoreCase("linktext")){
				elementSize = driver.findElements(By.linkText(LocatorValue)).size();
			}else if (LocatorType.equalsIgnoreCase("partiallinktext")){
				elementSize = driver.findElements(By.partialLinkText(LocatorValue)).size();
			}else if (LocatorType.equalsIgnoreCase("css")){
				elementSize = driver.findElements(By.cssSelector(LocatorValue)).size();
			}
			if (elementSize!=0){
				WebElement element = getElement(LocatorType,LocatorValue);
				if (element.isDisplayed()){
					return true;
				}else {
					return false;
				}
				
			}else{	
				return false;
			}
			}catch(Exception e){
				return false;
			}
		}

		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Suresh Damodaran																 *
		 * Date			:	09-08-2016																	 	 *
		 * Description	:	This function is used to receive the web element                *
		 * Updated By   : 	Suresh Damodaran						                                         *
		 * Version		: 	V0.1																			 *
		 * 																									 *
		 *****************************************************************************************************/
		
		public static WebElement getElement(String LocatorType,String LocatorValue)
		{
			WebElement element = null;
			try{
			if (LocatorType.equalsIgnoreCase("xpath")){
				element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorValue)));
			}else if (LocatorType.equalsIgnoreCase("id")){
				element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfElementLocated(By.id(LocatorValue)));
			}else if (LocatorType.equalsIgnoreCase("name")){
				element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfElementLocated(By.name(LocatorValue)));
			}else if (LocatorType.equalsIgnoreCase("linktext")){
				element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfElementLocated(By.linkText(LocatorValue)));
			}else if (LocatorType.equalsIgnoreCase("partiallinktext")){
				element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(LocatorValue)));
			}else if (LocatorType.equalsIgnoreCase("css")){
				element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(LocatorValue)));
			}
			return element;
			}catch(Exception e)
			{
				
				return null;
			}
		}
		
		
		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Suresh Damodaran																 *
		 * Date			:	09-08-2016																	 	 *
		 * Description	:	This function is used to clear and enter a text                                  *
		 * Updated By   : 	Suresh Damodaran						                                         *
		 * Version		: 	V0.1																			 *
		 * 																									 *
		 *****************************************************************************************************/
		public static void clearAndEnterValues(String locatorType,String LocatorValue,String value)
		{
			Utilities.getElement(locatorType, LocatorValue).clear();
			Utilities.getElement(locatorType, LocatorValue).sendKeys(value);
		}
		
		/*****************************************************************************************************
		 *																									 *
		 * Author		:	Suresh Damodaran																 *
		 * Date			:	09-20-2016																		 *
		 * Description	:	This function is being used to get the elements from application                 *
		 * Updated By 	:   Suresh Damodaran                                                    			 * 
		 * Version		: 	V0.1																			 *
		 * 																									 *
		 *****************************************************************************************************/

		public static List<WebElement> getElements(String LocatorType,String LocatorValue)
		{
			List<WebElement> element = null;
			try
			{
					if (LocatorType.equalsIgnoreCase("xpath"))
					{
						element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LocatorValue)));
					}
					else if (LocatorType.equalsIgnoreCase("id"))
					{
						element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(LocatorValue)));
					}
					else if (LocatorType.equalsIgnoreCase("name"))
					{
						element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(LocatorValue)));
					}
					else if (LocatorType.equalsIgnoreCase("linktext"))
					{
						element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText(LocatorValue)));
					}
					else if (LocatorType.equalsIgnoreCase("partiallinktext"))
					{
						element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText(LocatorValue)));
					}
					else if (LocatorType.equalsIgnoreCase("css"))
					{
						element = new WebDriverWait(driver,180).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(LocatorValue)));
					}
					return element;
			}
			catch(Exception e)
			{
				Reporter.log("The web element does not return multiple values or does not exists");
				return null;
			}
		}
}



