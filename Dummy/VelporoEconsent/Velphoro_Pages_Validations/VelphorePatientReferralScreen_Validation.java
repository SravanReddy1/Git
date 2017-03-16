package Velphoro_Pages_Validations;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import common.Utilities;

public class VelphorePatientReferralScreen_Validation extends Utilities

{

	
	static String VLoginMessLOC="//div[@class='col-xs-9']/h2";
	static String VAccessLOC = "//div[@class='col-xs-9']/h2";
	static String Vlogo="velphoroHomePage";
	static String VStartLOC = "//a[text()='Click here to start a benefit investigation']";
	static String VfooterLogo="//div[@class='col-xs-3']/img";
	static String PrivacyLOC = "//small[text()='PRIVACY POLICY']";
	static String TermofLOC = "//small[text()='TERMS OF USE']";
	static String SecurityInfoLOC = "//a[@id='lnkSafetyInfo']/strong/small";
	static String PrescribingInfoLOC="//small[text()='PRESCRIBING INFORMATION']";
	
	static String SecurityInfolink="//a[text()='www.fda.gov/medwatch.']";
	
	static String PrescribingInfolink="//a[contains(text(),'PRESCRIBING INFORMATION.')]";
	
	static String PatientHeader= "//div[@id='content']/div/legend";
	static String Patienttab="//a[text()='Patient']";
	
	static String Patientfname="//input[@name='ctl00$mainContent$txtPatientFirstName']";
	static String PatientMName="//input[@name='ctl00$mainContent$txtPatientMiddleInitial']";
	
	static String PatientLName="//input[@name='ctl00$mainContent$txtPatientLastName']";
	static String PlblGender="//label[@id='GenderLabel']";
	
	static String PDOB="//input[@name='ctl00$mainContent$txtPatientDateOfBirth']";
	
	static String Presidentfield="//label[@id='Label1']";
	
	static String pradioyes="//input[@id='ctl00_mainContent_rblIsPatientUSResident_0']";
	
	static String pradiono="//input[@id='ctl00_mainContent_rblIsPatientUSResident_1']";
	
	static String pssn="//input[@name='ctl00$mainContent$txtPatientSSN']";
	
	static String paddr1="//input[@id='ctl00_mainContent_txtPatientAddressLine1']";
	
	static String paddr2="//input[@id='ctl00_mainContent_txtPatientAddressLine2']";
	
	static String pcountry="//input[@id='ctl00_mainContent_txtCounty']";
	
	static String pcity="//input[@id='ctl00_mainContent_txtPatientAddressCity']";
	
	static String pstate="//select[@id='ctl00_mainContent_ddlPatientAddressState']";
	
	static String pzip ="//input[@id='ctl00_mainContent_txtPatientAddressZipCode']";
	
	static String Pphone="//input[@id='ctl00_mainContent_txtPatientPhoneNumber']";
	
	static String Insurancetab="//a[text()='Insurance']";
	static String Clinicaltab="//a[text()='Clinical']";
	static String Submittab=   "//a[text()='Submit']";
	
	static String lblinsurance="//label[@id='HasInsuranceLabel']";
	
	static String btnNextFromPatientTab="//input[@id='btnNextFromPatientTab']";
	static String radioyes="//input[@id='ctl00_mainContent_rblDoesPatientHaveInsurance_0']";
	
	static String radioNo="//input[@id='ctl00_mainContent_rblDoesPatientHaveInsurance_1']";
	
	static String radioUnknown="//input[@id='ctl00_mainContent_rblDoesPatientHaveInsurance_2']";
	
	static String backbtn="//input[@id='btnBackFromInsuranceTab']";
	
	static String nextbtn="//input[@id='btnNextFromInsuranceTab']";
	
	static String clinicalradioyes="//input[@id='ctl00_mainContent_rblIsPatientOnDialysis_0']";
	
	static String clinicalradioNo="//input[@id='ctl00_mainContent_rblIsPatientOnDialysis_1']";
	static String txtdatevalue="//input[@name='ctl00$mainContent$txtPhosphorusValueTakenDate']";
	
	static String txtMgvalue="//input[@name='ctl00$mainContent$txtPhosphorusValue']";
	
	static String backclinicalbtn="//input[@id='btnBackFromClinicalTab']";
	
	static String nextclinicalbtn="//input[@id='btnNextFromClinicalTab']";
	
	static String Submittabfield=	"//div[@id='tabSubmit']";
	
	static String imptext="//div[@class='col-xs-offset-1 col-xs-10']/h3";
	
	static String PrimarycField="//select[@id='ctl00_mainContent_ddlPrimaryDiagnosis']";
	
	static String	Cdrugfield="//select[@id='ctl00_mainContent_ddlProduct']";

	static String Cquantityfield="//input[@id='ctl00_mainContent_txtQuantity']";
	
	static String	Cfirsttxtfield="//input[@id='ctl00_mainContent_txtPhysFirstName']";

	static String	Clasttxtfield="//input[@id='ctl00_mainContent_txtPhysLastName']";
	
	static String	CNpifield="//input[@id='ctl00_mainContent_txtPhysNPI']";

	static String	CSlnfield="//input[@id='ctl00_mainContent_txtPhysSLN']";
	
	static String Caddfield1="//input[@id='ctl00_mainContent_txtPhysAddressLine1']";
	static String Ccityfield="//input[@id='ctl00_mainContent_txtPhysAddressCity']";

	static String Cstatefield="//select[@id='ctl00_mainContent_ddlPhysAddressState']";
     

	static String CZipfield="//input[@id='ctl00_mainContent_txtPhysAddressZipCode']";


	static String Cphonefield="//input[@id='ctl00_mainContent_txtPhysPhone']";

	
	static String CFaxfield="//input[@id='ctl00_mainContent_txtPhysFax']";
	
	static String	CfaciltyNamefield="//input[@id='ctl00_mainContent_txtTreatmentFacilityName']";

	static String	cfacilgtyContactfield="//input[@id='ctl00_mainContent_txtTreatmentFacilityContact']";

	static String	cfacilityphonefield="//input[@id='ctl00_mainContent_txtTreatmentFacilityPhone']";

	static String	cfacilityFaxfield="//input[@id='ctl00_mainContent_txtTreatmentFacilityFax']";
	
	public static void  verifyTheMDwebportalLoginProcess() throws IOException
	
			{
				String User = driver.findElement(By.xpath(VLoginMessLOC)).getText();
		
				Assert.assertEquals(User,"Welcome to Access Solutions");	
		
				Reporter.log("Verifying The MD webportal Login Process");
			
			}
	
	public static void   verifyTheMDwebportalApplicationHomePage() throws IOException
	
			{
				String User = driver.findElement(By.xpath(VLoginMessLOC)).getText();

				Assert.assertEquals(User,"Welcome to Access Solutions");	

				Reporter.log("Verifying The MD webportal HomePage");
	
			}
	
	public static void   verifyTheMDwebportalApplicationHomePageFields() throws IOException
	
	{
		
		WebElement logo=driver.findElement(By.className(Vlogo));
		  Assert.assertEquals(true, logo.isDisplayed());
		  Reporter.log("logo is displayed");
		
		String Access = driver.findElement(By.xpath(VAccessLOC)).getText();

		Assert.assertEquals(Access,"Welcome to Access Solutions");	

		Reporter.log("Verifying The MD webportal Login Process");

		String StartApp = driver.findElement(By.xpath(VStartLOC)).getText();

		Assert.assertEquals(StartApp,"Click here to start a benefit investigation");	

		Reporter.log("Verifying Click here to start a benefit investigation");
	}
	
	
	
	
public static void   verifyTheMDwebportalApplicationHomePageHeader() throws IOException, InterruptedException
	{
		
		WebElement logo=driver.findElement(By.className(Vlogo));
		  Assert.assertEquals(true, logo.isDisplayed());
		  Reporter.log("Velphorelogo is displayed");
		  
		  
		  
	}
	
	
	



public static void verifyTheMDwebportalApplicationHomePageFooter() throws IOException, InterruptedException
{
	
	WebElement logo=driver.findElement(By.xpath(VfooterLogo));
	  Assert.assertEquals(true, logo.isDisplayed());
	  Reporter.log("Footerlogo is displayed");
	String Priloc=driver.findElement(By.xpath(PrivacyLOC)).getText();
	Assert.assertEquals(Priloc, "PRIVACY POLICY");
	
	
	String TermLOC=driver.findElement(By.xpath(TermofLOC)).getText();
	Assert.assertEquals(TermLOC, "TERMS OF USE");
	
	String SecurityLOC=driver.findElement(By.xpath(SecurityInfoLOC)).getText();
	Assert.assertEquals(SecurityLOC, "IMPORTANT SAFETY INFORMATION");
	
	
	String PrescribingLOC=driver.findElement(By.xpath(PrescribingInfoLOC)).getText();
	Assert.assertEquals(PrescribingLOC, "PRESCRIBING INFORMATION");
	
	// TODO Auto-generated method stub
	
}



	
	
	public static void  verifyThePrivacyPolicyLinkOnMDwebportalApplication() throws IOException, InterruptedException
	
	{
		driver.findElement(By.xpath(PrivacyLOC)).click();
		
		//http://www.freseniusmedicalcare.us/en/home/
		
		Set<String> h = driver.getWindowHandles();
		
		
		System.out.println("No of handles:"+h.size());
		
		String k[]=new String[h.size()];
		
		int i=0;
	
		for(String s:h)
		
	{
			
			k[i]=s;
			
		System.out.println(k[i]);
		
		i++;
		//Switch to child window
	
	
	}
		
		
      driver.switchTo().window(k[1]);
		
		String childwindow=driver.getCurrentUrl();
		
		System.out.println(childwindow);
		
		Thread.sleep(4000);
		
		driver.close();
		
		driver.switchTo().window(k[0]);
		
		Thread.sleep(4000);
		
		
	
	}
	
	
	public static void   verifytheTermsofuselinkonMDwebportalApplication () throws IOException, InterruptedException
	
	
	 
	{
		
		driver.findElement(By.xpath(TermofLOC)).click();
		Set<String> p=driver.getWindowHandles();
		
		System.out.println("No of handles:"+p.size());
		
		  String[] handle=new String[p.size()] ;
		  
		  int i=0;
				  
	  for(String s:p)	
		  
		  
	  {
		  
		handle[i] =s;
		 
		 System.out.println( handle[i]);
		 
		 i++;
		  
	  }
		
	driver.switchTo().window(handle[1])	;
	
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(4000);
	
	driver.close();
	
	driver.switchTo().window(handle[0])	;	
		
	}
	
	public static void   verifytheImportantSecurityInformationlinkonMDwebportalApplication () throws IOException, InterruptedException
	

	 
	{
		
		driver.findElement(By.xpath(SecurityInfoLOC)).click();
		
		String importanttext= driver.findElement(By.xpath(imptext)).getText();
		
		Assert.assertEquals(importanttext, "IMPORTANT SAFETY INFORMATION");
		
		Reporter.log("IMPORTANT SAFETY INFORMATION Text is displayed");
		
	}
	
	
	public static void   verifythePrescribingInformationlinkonMDwebportalApplication() throws IOException, InterruptedException
	
	
	 
	{
		
		//driver.findElement(By.linkText("PRESCRIBING INFORMATION.")).click();
		driver.findElement(By.xpath(PrescribingInfoLOC)).click();
		Set<String> p=driver.getWindowHandles();
		System.out.println("No of handles:"+p.size());
		
		  String[] handle=new String[p.size()] ;
		  
		  int i=0;
				  
	  for(String s:p)	
		  
		  
	  {
		  
		handle[i] =s;
		 
		 System.out.println( handle[i]);
		 
		 i++;
		  
	  }
		
	driver.switchTo().window(handle[1])	;
	
	System.out.println(driver.getCurrentUrl());
	
	Thread.sleep(4000);
	
	driver.close();
	
	driver.switchTo().window(handle[0])	;	
		
	}
	
	
	
	public static void VerifyFirstlinkinImportantSafetyInformationsectionofMDwebportalApplication()throws IOException, InterruptedException 
	{
		driver.findElement(By.xpath(SecurityInfolink)).click();
		Set<String> p=driver.getWindowHandles();
		
		  String[] handle=new String[p.size()] ;
		  
		  int i=0;
				  
	  for(String s:p)	
		  
		  
	  {
		  
		handle[i] =s;
		 
		 System.out.println( handle[i]);
		 
		 i++;
		  
	  }
		
	driver.switchTo().window(handle[1])	;
	
	System.out.println(driver.getCurrentUrl());
	
	
	
	driver.close();
	
	driver.switchTo().window(handle[0])	;	
		
	Thread.sleep(4000);	
		
	}
	
	
	public static void VerifySecondlinkinImportantSafetyInformationsectionofMDwebportalApplication()throws IOException, InterruptedException 
	{
		driver.findElement(By.xpath(PrescribingInfolink)).click();
		Set<String> p=driver.getWindowHandles();
		
		
		
		  String[] handle=new String[p.size()] ;
		  
		  int i=0;
				  
	  for(String s:p)	
		  
		  
	  {
		  
		handle[i] =s;
		 
		 System.out.println( handle[i]);
		 
		 i++;
		  
	  }
		
	driver.switchTo().window(handle[1])	;
	
	System.out.println(driver.getCurrentUrl());

	Thread.sleep(4000);
	
	driver.close();
	
	driver.switchTo().window(handle[0])	;	
		
		
		
	}
	
	
	public static void  verifythefunctionalityofClickheretostartaBenefitInvestigationlink()throws IOException, InterruptedException 
	{
		driver.findElement(By.xpath(VStartLOC)).click();
		
		//System.out.println(driver.getTitle());
	
	   Thread.sleep(4000);
	String PatientHeading=driver.findElement(By.xpath(PatientHeader)).getText();
	Assert.assertEquals(PatientHeading, "Patient Referral");
	Reporter.log("Verifying Patient Header");
	
	String ptab=driver.findElement(By.xpath(Patienttab)).getText();
	Assert.assertEquals(ptab, "PATIENT");
	Reporter.log("Verifying Patient Tab");
	
	
	
	
	
	String Itab=driver.findElement(By.xpath(Insurancetab)).getText();
	Assert.assertEquals(Itab, "Insurance");
	Reporter.log("Verifying Insurance Tab");
	
	
	String Ctab=driver.findElement(By.xpath(Clinicaltab)).getText();
	
	Assert.assertEquals(Ctab, "Clinical");
	Reporter.log("Verifying Clinical Tab");
	
	String Stab=driver.findElement(By.xpath(Submittab)).getText();
	Assert.assertEquals(Stab, "Submit");
	Reporter.log("Verifying Submit Tab");
	
	
	
		
	}
	
	
	
	
	public static void verifythefieldsofPatienttab() throws IOException, InterruptedException 

	
	{
		
		
		
		Assert.assertTrue(driver.findElement(By.xpath(Patientfname)).isDisplayed());
		Reporter.log("PatientFirstName field is present");
		
		Assert.assertTrue(driver.findElement(By.xpath(PatientMName)).isDisplayed());
		Reporter.log("PatientMiddleName field is present");
		
        Assert.assertTrue(driver.findElement(By.xpath(PatientLName)).isDisplayed());
		Reporter.log("PatientLastName field is present");
		  
		Assert.assertTrue(driver.findElement(By.xpath(PlblGender)).isDisplayed());
		Reporter.log("Gender field is present");
	
		
		
		Assert.assertTrue(driver.findElement(By.xpath(PDOB)).isDisplayed());
		Reporter.log("Date of Birth field is present");
		
		
		
		
		Assert.assertTrue(driver.findElement(By.xpath(Presidentfield)).isDisplayed());
		Reporter.log("Permananent Resident field is present");
		
	
		Assert.assertTrue(driver.findElement(By.xpath(pssn)).isDisplayed());
		Reporter.log("Social Security field is present");
		
		
		
		Assert.assertTrue(driver.findElement(By.xpath(paddr1)).isDisplayed());
		Reporter.log("Address Line1 field is present");
		
		Assert.assertTrue(driver.findElement(By.xpath(paddr2)).isDisplayed());
		
		Reporter.log("Address Line2 field is present");
		
		
		
		Assert.assertTrue(driver.findElement(By.xpath(pcountry)).isDisplayed());
		Reporter.log("Country field is present");
		
		
	
		Assert.assertTrue(driver.findElement(By.xpath(pcity)).isDisplayed());
		Reporter.log("City field is present");
		
		
		
		
		Assert.assertTrue(driver.findElement(By.xpath(pstate)).isDisplayed());
		Reporter.log("State field is present");
		
		//ctl00$mainContent$txtPatientAddressZipCode
		
		
		Assert.assertTrue(driver.findElement(By.xpath(pzip)).isDisplayed());
		Reporter.log("Zip code field is present");
		
		//ctl00$mainContent$txtPatientPhoneNumber
		
	
		
		Assert.assertTrue(driver.findElement(By.xpath(Pphone)).isDisplayed());
		Reporter.log("Phone Number field is present");
		
		
		
		
		Assert.assertTrue(driver.findElement(By.xpath(btnNextFromPatientTab)).isDisplayed());
		Reporter.log("Next Button field is Present");
		
	
	}
	
	
public static void verifytheMandatoryfieldsofPatienttab() throws IOException, InterruptedException 

	
	{
	
	Assert.assertTrue(driver.findElement(By.xpath(Patientfname)).isDisplayed());
	Reporter.log("PatientFirstName field is present");
	
		
	
		
		
	  Assert.assertTrue(driver.findElement(By.xpath(PatientLName)).isDisplayed());
			Reporter.log("PatientLastName field is present");
		  
			Assert.assertTrue(driver.findElement(By.xpath(PlblGender)).isDisplayed());
			Reporter.log("Gender field is present");
	
			Assert.assertTrue(driver.findElement(By.xpath(PDOB)).isDisplayed());
			Reporter.log("Date of Birth field is present");
		
			Assert.assertTrue(driver.findElement(By.xpath(Presidentfield)).isDisplayed());
			Reporter.log("Permananent Resident field is present");
			
		
//		Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$txtPatientSSN")).isDisplayed());
//		Reporter.log("Social Security field is present");
//		
			Assert.assertTrue(driver.findElement(By.xpath(paddr1)).isDisplayed());
			Reporter.log("Address Line1 field is present");
		
//		Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$txtPatientAddressLine2")).isDisplayed());
//		Reporter.log("Address Line2 field is present");
			
			Assert.assertTrue(driver.findElement(By.xpath(pcountry)).isDisplayed());
			Reporter.log("Country field is present");
			
			
		
			Assert.assertTrue(driver.findElement(By.xpath(pcity)).isDisplayed());
			Reporter.log("City field is present");
			
			
			
			
			Assert.assertTrue(driver.findElement(By.xpath(pstate)).isDisplayed());
			Reporter.log("State field is present");
			
			
	
	
		
		//ctl00$mainContent$txtPatientAddressZipCode
		
		
		Assert.assertTrue(driver.findElement(By.xpath(pzip)).isDisplayed());
		Reporter.log("Zip code field is present");
		
		
		//pzip ="//input[@id='ctl00_mainContent_txtPatientAddressZipCode']";
		//ctl00$mainContent$txtPatientPhoneNumber
		
//		Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$txtPatientPhoneNumber")).isDisplayed());
//		Reporter.log("Phone Number field is present");
//		
//		Assert.assertTrue(driver.findElement(By.id("btnNextFromPatientTab")).isDisplayed());
//		Reporter.log("Next Button field is Present");
//		
	
	}


public static void verifytheFunctionalityofNextbuttononPatienttab() throws IOException, InterruptedException 


{
	Assert.assertTrue(driver.findElement(By.xpath(btnNextFromPatientTab)).isDisplayed());
	Reporter.log("Next Button field is Present");
	driver.findElement(By.xpath(btnNextFromPatientTab)).click();
	
}

	
	
public static void verifythefieldsofInsurancetab() throws IOException, InterruptedException 


{
	
	String lblfield=driver.findElement(By.xpath(lblinsurance)).getText();
	
	Assert.assertEquals(lblfield, "Does the patient have insurance? *");
	Reporter.log("Does the patient have insurance text is present");
	
	
	Assert.assertTrue(driver.findElement(By.xpath(radioyes)).isDisplayed());
	Reporter.log("Yes Radio Button Yes is present");
	
	
	Assert.assertTrue(driver.findElement(By.xpath(radioNo)).isDisplayed());
	Reporter.log("No Radio Button  is present");
	
	
	Assert.assertTrue(driver.findElement(By.xpath(radioUnknown)).isDisplayed());
	Reporter.log("UnKnown Radio Button Yes is present");
	
	
	Assert.assertTrue(driver.findElement(By.xpath(radioyes)).isDisplayed());
	Reporter.log("Yes Radio Button Yes is present");
	
	
	Assert.assertTrue(driver.findElement(By.xpath(backbtn)).isDisplayed());
	Reporter.log("Back Button  is displayed");
	
	Assert.assertTrue(driver.findElement(By.xpath(nextbtn)).isDisplayed());
	Reporter.log("Next Button  is displayed");
}

	
	
public static void verifytheMandtoryfieldofInsurancetab() throws IOException, InterruptedException 

{
	
     String lblfield=driver.findElement(By.xpath(lblinsurance)).getText();
	
	Assert.assertEquals(lblfield, "Does the patient have insurance? *");
	Reporter.log("Does the patient have insurance text is present");
	
	
}
	
	
public static void verifythefunctionalityofPreviousbuttononInsurancetab() throws IOException, InterruptedException 

{
	
	
	
	
   driver.findElement(By.xpath(backbtn)).click();
   
  Assert.assertTrue(driver.findElement(By.xpath(Patienttab)).isDisplayed());
  
  Reporter.log("Navigated to Patient Tab on clicking back button in Insurance Tab");
	
	
}
	
public static void verifythefunctionalityofNextButtononInsurancetab() throws IOException, InterruptedException 

{
	
	
	driver.findElement(By.xpath(Insurancetab)).click();
	
   driver.findElement(By.xpath(nextbtn)).click();
   
  Assert.assertTrue(driver.findElement(By.xpath(Clinicaltab)).isDisplayed());
  
  Reporter.log("Navigated to Clinical Tab on clicking Next button in Insurance Tab");
	
	
}
	
public static void verifythefieldsofClinicaltab() throws IOException, InterruptedException 

{
	
	
	driver.findElement(By.xpath(Clinicaltab)).click();
	
  
  Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$ddlPrimaryDiagnosis")).isDisplayed());
  
  Reporter.log("Primary Diagnosis field is displayed");
  
  	
  String lblclincial=driver.findElement(By.id("lblIspatientOnDialysis")).getText();
  
  Assert.assertEquals(lblclincial, "Is the patient currently on dialysis?");
  
  Reporter.log("Is the patient currently on dialysis field is present");
  
Assert.assertTrue(driver.findElement(By.xpath(clinicalradioyes)).isDisplayed());
  
  Reporter.log("clinical radioyes Button field is present");
  
Assert.assertTrue(driver.findElement(By.xpath(clinicalradioNo)).isDisplayed());
  
  Reporter.log("clinical radioNo Button field is present");
  
//String lblclinicaldtlab=driver.findElement(By.id("ctl00_mainContent_txtPhosphorusValueTakenDate")).getText();
//
////System.out.println(lblclinicaldtlab);
//  
//
//
//  Assert.assertEquals(lblclinicaldtlab, "Current Phosphorus lab values (Date taken)");
//  
//  Reporter.log("Current Phosphorus lab values (Date taken) field is present");
//  
Assert.assertTrue(driver.findElement(By.xpath(txtdatevalue)).isDisplayed());
  
  Reporter.log("Current Phosphorus lab values (Date taken) text field is Present");
  
//String lblCurrentPhosphorus=driver.findElement(By.id("ctl00_mainContent_txtPhosphorusValue")).getText();
//  
//
//  Assert.assertEquals(lblCurrentPhosphorus, "Current Phosphorus lab values (MG/DL)");
//  
//  Reporter.log("Current Phosphorus lab values (MG/DL) label field is present"); 
  
  
Assert.assertTrue(driver.findElement(By.xpath(txtMgvalue)).isDisplayed());
  
  Reporter.log("Current Phosphorus lab values (MG/DL)  text field is Present");
	
}
		
//verifytheCinicaltabMandatoryfields() is pending

public static void verifyClinicaltabMandatoryfields() throws IOException, InterruptedException 

{
	
	driver.findElement(By.xpath(Clinicaltab)).click();
	 Assert.assertTrue(driver.findElement(By.xpath(PrimarycField)).isDisplayed());
	  
	  Reporter.log("Primary Diagnosis field is displayed");
	
 Assert.assertTrue(driver.findElement(By.xpath(Cdrugfield)).isDisplayed());
	  
	  Reporter.log("Drug field is displayed");
	  
	  
 Assert.assertTrue(driver.findElement(By.xpath(Cquantityfield)).isDisplayed());
	  
	  Reporter.log("Quantity field is displayed");
	  
 Assert.assertTrue(driver.findElement(By.xpath(Cfirsttxtfield)).isDisplayed());
	  
	  Reporter.log("FirstName field is displayed");
	  
 Assert.assertTrue(driver.findElement(By.xpath(Clasttxtfield)).isDisplayed());
	  
	  Reporter.log("lastName field is displayed");
	  
Assert.assertTrue(driver.findElement(By.xpath(CNpifield)).isDisplayed());
	  
	  Reporter.log("NPI field is displayed");
	  	  	  
	  
Assert.assertTrue(driver.findElement(By.xpath(CSlnfield)).isDisplayed());
	  
	  Reporter.log("SLN field is displayed");
	  	    

	  
Assert.assertTrue(driver.findElement(By.xpath(Caddfield1)).isDisplayed());
	  
	  Reporter.log("Address field is displayed");
	  
	  
	  
	  
	  
Assert.assertTrue(driver.findElement(By.xpath(Ccityfield)).isDisplayed());
	  
	  Reporter.log("City field is displayed");	  
	  
	  
Assert.assertTrue(driver.findElement(By.xpath(Cstatefield)).isDisplayed());
	  
	  Reporter.log("State field is displayed");	  
	  
	  
Assert.assertTrue(driver.findElement(By.xpath(CZipfield)).isDisplayed());
	  
	  Reporter.log("Zip field is displayed");	  
	 	  	 	  	    
Assert.assertTrue(driver.findElement(By.xpath(Cphonefield)).isDisplayed());
	  
	  Reporter.log("Phone field is displayed");	  
	  
	  
Assert.assertTrue(driver.findElement(By.xpath(CFaxfield)).isDisplayed());
	  
	  Reporter.log("Fax field is displayed");	  
	  

Assert.assertTrue(driver.findElement(By.xpath(CfaciltyNamefield)).isDisplayed());
	  
	  Reporter.log("Facility field is displayed");	  
	  
	  

Assert.assertTrue(driver.findElement(By.xpath(cfacilgtyContactfield)).isDisplayed());
	  
	  Reporter.log("Contact field is displayed");	  
	  	  
	  
Assert.assertTrue(driver.findElement(By.xpath(cfacilityphonefield)).isDisplayed());
	  
	  Reporter.log("Facility Phone field is displayed");	  
	  	  	  
	 
		
Assert.assertTrue(driver.findElement(By.xpath(cfacilityFaxfield)).isDisplayed());
	  
	  Reporter.log("Facility Fax field is displayed");	  
	  	  	  
		

		  	  
	  
	  
}



public static void verifythefunctionalityofPreviousbuttononClinicaltab() throws IOException, InterruptedException 

{
	//driver.findElement(By.xpath(Clinicaltab)).click();
	
	 driver.findElement(By.xpath(backclinicalbtn)).click();
	   
	  Assert.assertTrue(driver.findElement(By.xpath(Insurancetab)).isDisplayed());
	  
	  Reporter.log("Navigated to Insurance Tab on clicking back button in Insurance Tab");
		
	

}


public static void verifythefunctionalityofNextButtononClinicaltab() throws IOException, InterruptedException 

{
	
	
	driver.findElement(By.xpath(Clinicaltab)).click();
	
   driver.findElement(By.xpath(nextclinicalbtn)).click();
   
  Assert.assertTrue(driver.findElement(By.xpath(Submittab)).isDisplayed());
  
  Reporter.log("Navigated to Submit Tab on clicking Next button in Clinical Tab");
	
	
}

public static void verifythefunctionalityoftheSubmittabWithoutenteringallthemandatoryfields() throws IOException, InterruptedException 


{
	 driver.findElement(By.xpath(Patienttab)).click();
	 
     driver.findElement(By.xpath(btnNextFromPatientTab)).click();
     
     driver.findElement(By.xpath(nextbtn)).click();
     
     driver.findElement(By.xpath(nextclinicalbtn)).click();
     
	List<WebElement> myElements = driver.findElements(By.xpath(Submittabfield));
	
    for(WebElement e : myElements) 
    	
    {        
        System.out.print("Before Clicking on Submit Button"+e.getText()+"\t");
    }
    
    System.out.println(Keys.ENTER);
    
    System.out.println(Keys.SPACE);
    
    Thread.sleep(2000);
	
}


}






