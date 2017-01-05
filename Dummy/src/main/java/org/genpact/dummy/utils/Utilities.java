package org.genpact.dummy.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Utilities 
{
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
//				if(dataFile.delete())
//				{
//					actFile.renameTo(dataFile);
//				}
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
			
//	public static String getProperty(String propertyName) throws IOException
//	{
//		
//		Properties prop = new Properties();
//		FileInputStream fs;
//		switch (portalName) 
//		{
//		case "nordicare":
//			fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config_nodicare.properties");
//			prop.load(fs);
//			break;
//		case "fedia":
//			fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config_fedia.properties");
//			prop.load(fs);
//			break;
//		case "cimplicity":
//			fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config_cimplicity.properties");
//			prop.load(fs);
//			break;
//		case "snf":
//			fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config_snf.properties");
//			prop.load(fs);
//			break;
    

    
//		default:
//			break;
//		}
//		
//		 return (String) prop.get(propertyName);
//	}
	
	public static String timeStamp() throws Exception 
	{
		String timeStamp,tempStr,tempStr1;
		Date todaysDate = new Date();	       
	    DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
	    timeStamp = df.format(todaysDate);
	    tempStr = timeStamp.replace(" ", "_");
	    tempStr1 = tempStr.replace(":", "");
	    timeStamp = tempStr1.replace("-", "_");
	    return timeStamp;
	}


}
