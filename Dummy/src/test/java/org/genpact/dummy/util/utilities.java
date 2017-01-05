package org.genpact.dummy.util;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

import jxl.read.biff.BiffException;
import org.genpact.dummy.utils.Utilities;

public class utilities 
{
	static WebDriver driver;
	
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
		getElement(locatorType, LocatorValue).clear();
		getElement(locatorType, LocatorValue).sendKeys(value);
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
		//	Reporter.log("The web element does not return multiple values or does not exists");
			return null;
		}
	}

	public static WebDriver startApplication() throws IOException, BiffException 
	
	{
		String browser = Utilities.readFromExcel(0, 1);
				
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
	

}
