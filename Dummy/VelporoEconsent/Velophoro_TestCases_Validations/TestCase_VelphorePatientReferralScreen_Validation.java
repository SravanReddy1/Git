package Velophoro_TestCases_Validations;

import java.io.IOException;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import Velphoro_Pages_Validations.VelphorePatientReferralScreen_Validation;

import common.Utilities;
import jxl.read.biff.BiffException;

public class TestCase_VelphorePatientReferralScreen_Validation extends Utilities

{

	
	@BeforeClass()
	public void setup() throws IOException, InterruptedException, BiffException
	
	{
		Utilities.portalName="Velporo";
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Utilities.startApplication();
		
	}

	@Test(priority=1)
	public void MDwebportalLoginProcess() throws IOException, InterruptedException
	{
		VelphorePatientReferralScreen_Validation.verifyTheMDwebportalLoginProcess();
	}
	
	@Test(priority=2)
	public void MDwebportalApplicationHomePage() throws IOException, InterruptedException
	{
		VelphorePatientReferralScreen_Validation.verifyTheMDwebportalApplicationHomePage();
	}
	
	@Test(priority=3)
	public void MDwebportalApplicationHomePageFields() throws IOException, InterruptedException
	{
		VelphorePatientReferralScreen_Validation.verifyTheMDwebportalApplicationHomePageFields();
	}
	
	
	@Test(priority=4)
	public void MDwebportalApplicationHomePageHeader() throws IOException, InterruptedException
	
	{
		VelphorePatientReferralScreen_Validation.verifyTheMDwebportalApplicationHomePageHeader();
		
	}
	
	
	@Test(priority=5)
	public void MDwebportalApplicationHomePageFooter() throws IOException, InterruptedException 
	
	{
		VelphorePatientReferralScreen_Validation.verifyTheMDwebportalApplicationHomePageFooter();
		
	}
	@Test(priority=6)
	
	
	public void PrivacyPolicyLinkOnMDwebportalApplication() throws IOException, InterruptedException
	{
		VelphorePatientReferralScreen_Validation.verifyThePrivacyPolicyLinkOnMDwebportalApplication();
	}
	
	
   @Test(priority=7)
	
	
	public void TermsofUselinkonMDwebportalApplication() throws IOException, InterruptedException
	{
		VelphorePatientReferralScreen_Validation.verifytheTermsofuselinkonMDwebportalApplication();
	}
	
   
   
   
   
  @Test(priority=8)	
	
  	public void ImportantSecurityInformationlinkonMDwebportalApplication() throws IOException, InterruptedException
  	{
 		VelphorePatientReferralScreen_Validation.verifytheImportantSecurityInformationlinkonMDwebportalApplication();
  	}
  
   
   @Test(priority=9)
	
	
 	public void PrescribingInformationlinkonMDwebportalApplication() throws IOException, InterruptedException
 	{
 		VelphorePatientReferralScreen_Validation.verifythePrescribingInformationlinkonMDwebportalApplication();
 	}
   
   @Test(priority=10)
	
	
	public void FirstlinkinImportantSafetyInformationsectionofMDwebportalApplication() throws IOException, InterruptedException
	{
		VelphorePatientReferralScreen_Validation.VerifyFirstlinkinImportantSafetyInformationsectionofMDwebportalApplication();
	}
  
   
   @Test(priority=11)
	
	
  	public void SecondlinkinImportantSafetyInformationsectionofMDwebportalApplication() throws IOException, InterruptedException
  	{
  		VelphorePatientReferralScreen_Validation.VerifySecondlinkinImportantSafetyInformationsectionofMDwebportalApplication();
  	}
   
   
   @Test(priority=12)
	
	
 	public void FunctionalityofClickheretostartaBenefitInvestigationlink() throws IOException, InterruptedException
 	{
 		VelphorePatientReferralScreen_Validation.verifythefunctionalityofClickheretostartaBenefitInvestigationlink();
 	}
  
   
   @Test(priority=13)
	
	
	public void FieldsofPatienttab() throws IOException, InterruptedException
	{
		VelphorePatientReferralScreen_Validation.verifythefieldsofPatienttab();
	}
 
   @Test(priority=14)
   
    public void MandatoryfieldsofPatienttab() throws IOException, InterruptedException
	
	{
	   
	   VelphorePatientReferralScreen_Validation.verifytheMandatoryfieldsofPatienttab();
	   
	}
   
   
   @Test(priority=15)
   
   public void FunctionalityofNextbuttononPatienttab() throws IOException, InterruptedException
	
	{
	   
	   VelphorePatientReferralScreen_Validation.verifytheFunctionalityofNextbuttononPatienttab();
	   
	}
  
   
   
@Test(priority=16)
   
   public void fieldsofInsurancetab() throws IOException, InterruptedException
	
	{
	   
	   VelphorePatientReferralScreen_Validation.verifythefieldsofInsurancetab();
	   
	}
   	
@Test(priority=17)

public void MandtoryfieldofInsurancetab() throws IOException, InterruptedException
   
{
	
	 VelphorePatientReferralScreen_Validation.verifytheMandtoryfieldofInsurancetab();
	
	
}

@Test(priority=18)

public void functionalityofPreviousbuttononInsurancetab() throws IOException, InterruptedException
   
{
	
	 VelphorePatientReferralScreen_Validation.verifythefunctionalityofPreviousbuttononInsurancetab();
	
	
}


@Test(priority=19)

public void functionalityofNextbuttononInsurancetab() throws IOException, InterruptedException
   
{
	
	 VelphorePatientReferralScreen_Validation.verifythefunctionalityofNextButtononInsurancetab();
	
	
}

@Test(priority=20)

public void FieldsofClinicaltab() throws IOException, InterruptedException
   
{
	
	 VelphorePatientReferralScreen_Validation.verifythefieldsofClinicaltab();
	
	
}
@Test(priority=21)
public void ClinicaltabMandatoryfields() throws IOException, InterruptedException

{
	
	 VelphorePatientReferralScreen_Validation.verifyClinicaltabMandatoryfields();
	
}



@Test(priority=22)
public void functionalityofPreviousbuttononClinicaltab() throws IOException, InterruptedException

{
	
	 VelphorePatientReferralScreen_Validation.verifythefunctionalityofPreviousbuttononClinicaltab();
	
	
}


@Test(priority=23)


public void functionalityofNextbuttononClinicaltab() throws IOException, InterruptedException

{
	
	 VelphorePatientReferralScreen_Validation.verifythefunctionalityofNextButtononClinicaltab();
	
	
}


@Test(priority=24)


public void functionalityoftheSubmittabWithoutenteringallthemandatoryfields() throws IOException, InterruptedException

{
	
	 VelphorePatientReferralScreen_Validation.verifythefunctionalityoftheSubmittabWithoutenteringallthemandatoryfields();
	
	
}






   
//	@Test(priority=5)
//	public void SearchPatientFunctionalityOnDashboardTab() throws IOException, InterruptedException
//	{
//		VelphorePatientReferralScreen_Validation.verifyTheTermsOfUseLinkOnMDwebportalApplication();
//	}
//	
//	@Test(priority=6)
//	public void SearchPatientFunctionalityforInvalidPatient() throws IOException, InterruptedException
//	{
//		VelphorePatientReferralScreen_Validation.verifyTheImportantSecurityInformationLinkOnMDwebportalApplication();
//	}
	
//	@Test(priority=7)
//	public void FilterFunctionalityOnDashboard() throws IOException, InterruptedException
//	{
//		VelphorePatientReferralScreen_Validation.verifyFilterFunctionalityOnDashboard();
//	}
//	
//	@Test(priority=8)
//	public void OrderTabOnPatientCaseDetailsHyperlink() throws IOException, InterruptedException
//	{
//		VelphorePatientReferralScreen_Validation.verifyOrderTabOnPatientCaseDetailsHyperlink();
//	}
//	
//	@Test(priority=9)
//	public void ShipmentTabOnPatientCaseDetailsHyperlink() throws IOException, InterruptedException
//	{
//		VelphorePatientReferralScreen_Validation.verifyShipmentTabOnPatientCaseDetailsHyperlink();
//	}
//	 
//	@Test(priority=10)
//	public void StartAnOnlineApplicationLinkDetailsPage() throws IOException, InterruptedException
//	{
//		VelphorePatientReferralScreen_Validation.verifyStartAnOnlineApplicationLinkDetailsPage();
//	}
	@AfterClass()
	public void tearDown()
	
	{
		driver.quit();
		
	}

}
