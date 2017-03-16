package Velophoro_TestCases;

import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import org.genpact.dummy.util.utilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


import Velophoro_Pages.FunctionalityoftheSubmittab;

import common.Utilities;
import jxl.read.biff.BiffException;




public class TestCases_FunctionalityoftheSubmittab extends Utilities{
	
	
	
	@BeforeClass()
	public void setup() throws IOException, InterruptedException, BiffException
	
	{
		Utilities.portalName="velporo";
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Utilities.startApplication();
	
	}

	
	
	
	@Test(priority=1)
	 public static void CreatePatientForm() throws InterruptedException, IOException, BiffException 
	 
	 
	 {
		int row = 1;
		FunctionalityoftheSubmittab.CreatePatientForm(row);
		 
		 
	 }
	
	@Test(priority=2)
	public static void CreateInsuranceForm() throws InterruptedException, IOException , BiffException 
	 
	 
	 {
		
		utilities.waitPageLoad();
		int row=1;
		FunctionalityoftheSubmittab.CreateInsuranceForm(row);
		 
		 
	 }
	
	
	@Test(priority=3)
	 public static void CreateClinicalForm() throws InterruptedException, IOException, BiffException 
	 
	 
	 {
		
		int row=1;
		FunctionalityoftheSubmittab.CreateClinicalForm(row);
		 
		 
	 }
	
	
	@AfterClass()
	public void tearDown()
	
	{
		//driver.quit();

       
	}
	 

}
