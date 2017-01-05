package Velophoro_Pages;

import java.io.IOException;

import org.hamcrest.text.IsEqualIgnoringCase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import common.Utilities;
import jxl.read.biff.BiffException;

public class FunctionalityoftheSubmittab extends Utilities 

{
	
	
	static String VStartLOC = "//a[text()='Click here to start a benefit investigation']";;
	static String PatientHeader= "//div[@id='content']/div/legend";
	static String Patienttab="//a[text()='Patient']";
	static String PatientFirstName = "//input[@id='ctl00_mainContent_txtPatientFirstName']";
	static String PatientLastName = "//input[@id='ctl00_mainContent_txtPatientLastName']";
	static String PatientMiddleInitial = "//input[@id='ctl00_mainContent_txtPatientMiddleInitial']";
	static String PatientDateOfBirth = "//input[@id='ctl00_mainContent_txtPatientDateOfBirth']";
	static String SocialSecrityNumber = ".//*[@id='ctl00_mainContent_txtPatientSSN']";
     
	
	static String Male = ".//*[@id='ctl00_mainContent_rblGender_0']";
	static String Female = ".//*[@id='ctl00_mainContent_rblGender_1']";
	static String PatientAddressLine1 = ".//*[@id='ctl00_mainContent_txtPatientAddressLine1']";
	static String PatientAddressLine2 = ".//*[@id='ctl00_mainContent_txtPatientAddressLine2']";
	static String PatientAddressCity = ".//*[@id='ctl00_mainContent_txtPatientAddressCity']";
	static String PatientAddressZipCode = ".//*[@id='ctl00_mainContent_txtPatientAddressZipCode']";
	
	static String PatientState = "//select[@id='ctl00_mainContent_ddlPatientAddressState']";
	static String PhoneNum = "//input[@id='ctl00_mainContent_txtPatientPhoneNumber']";
	
	static String btnNextFromPatientTab="//input[@id='btnNextFromPatientTab']";
	
	static String StatusYes = "//input[@id='ctl00_mainContent_rblIsPatientUSResident_0']";
	static String StatusNo = "//input[@id='ctl00_mainContent_rblIsPatientUSResident_1']";
	static String IStatusYes = "//input[@id='ctl00_mainContent_rblDoesPatientHaveInsurance_0']";
	
	//ctl00_mainContent_rblDoesPatientHaveInsurance_0
	static String IStatusNo = "//input[@id='ctl00_mainContent_rblDoesPatientHaveInsurance_1']";
	static String nextbtn="//input[@id='btnNextFromInsuranceTab']";
	
	static String InsNametxtField="//input[@id='ctl00_mainContent_txtPrimaryInsuranceProvider']";

			static String IPolicytxtField="//input[@id='ctl00_mainContent_txtPrimaryInsurancePolicyNumber']";

			static String IgrouptxtField="//input[@ id='ctl00_mainContent_txtPrimaryInsuranceGroupNumber']";


			static String IBintxtField="//input[@id='ctl00_mainContent_txtPrimaryInsuranceBIN']";

			static String IphonetxtField="//input[@id='ctl00_mainContent_txtPrimaryInsurancePhone']";

			static String IfaxtxtField="//input[@id='ctl00_mainContent_txtPrimaryInsuranceFax']";

			static String IfirstnameField="//input[@id='ctl00_mainContent_txtPrimaryInsurancePolicyHolderFirstName']";

			static String IlastnameField="//input[@id='ctl00_mainContent_txtPrimaryInsurancePolicyHolderLastName']";

			static String SecInsyesField="//input[@id='ctl00_mainContent_rblSecondaryInsurance_0']";

			static String SecInsNoField="//input[@id='ctl00_mainContent_rblSecondaryInsurance_1']";

			static String PInsyesField="//input[@id='ctl00_mainContent_rblDoesPatientHavePBM_0']";

			static String pInsNoField="//input[@id='ctl00_mainContent_rblDoesPatientHavePBM_1']";
			
			
			//secondary insured
			
			static String SecIName="//input[@id='ctl00_mainContent_txtSecondaryInsuranceProvider']";

					static String SecIPolicy="//input[@id='ctl00_mainContent_txtSecondaryInsurancePolicyNumber']";


					static String SecIBin="//input[@id='ctl00_mainContent_txtSecondaryInsuranceBIN']";

					static String SecIBphone="//input[@id='ctl00_mainContent_txtSecondaryInsurancePhone']";




					static String SecIFax="//input[@id='ctl00_mainContent_txtSecondaryInsuranceFax']";

					static String SecIPHFirstName="//input[@id='ctl00_mainContent_txtSecondaryInsurancePolicyHolderFirstName']";

					static String SecIPHLirstName="//input[@id='ctl00_mainContent_txtSecondaryInsurancePolicyHolderLastName']";

//pharmacy 
					
					static String PhName="//input[@id='ctl00_mainContent_txtPrimaryPBMName']";

							static String phphone="//input[@id='ctl00_mainContent_txtPrimaryPBMPhoneNumber']";

							static String Phmemberid="//input[@id='ctl00_mainContent_txtPrimaryPBMMemberID']";

							static String phgroup="//input[@id='ctl00_mainContent_txtPrimaryPBMGroupNumber']";

							static String phbin="//input[@id='ctl00_mainContent_txtPrimaryPBMBIN']";

							static String phfax="//input[@id='ctl00_mainContent_txtPrimaryPBMFax']";

							static String phpcn="//input[@id='ctl00_mainContent_txtPrimaryPBMPCN']";


//secondarypharmacy
							
							static String phsecyes="//input[@id='ctl00_mainContent_rblSecondaryPBM_0']";

							static String phsecNo="//input[@id='ctl00_mainContent_rblSecondaryPBM_1']";
							
							
							     static String PhsName="//input[@id='ctl00_mainContent_txtSecondaryPBMName']";
									static String phsphone="//input[@id='ctl00_mainContent_txtSecondaryPBMPhoneNumber']";
									static String Phsmemberid="//input[@id='ctl00_mainContent_txtSecondaryPBMMemberID']";

									static String phsgroup="//input[@id='ctl00_mainContent_txtSecondaryPBMGroupNumber']";

									static String phsbin="//input[@id='ctl00_mainContent_txtSecondaryPBMBIN']";

									static String phsfax="//input[@id='ctl00_mainContent_txtSecondaryPBMFax']";

									static String phspcn="//input[@id='ctl00_mainContent_txtSecondaryPBMPCN']";

							
	//clinical
									
		
									static String PrimarycField="//select[@id='ctl00_mainContent_ddlPrimaryDiagnosis']";

									static String	othercField="//input[@id='ctl00_mainContent_txtOtherDiagnosisCodes']";

									static String	CYes="//input[@id='ctl00_mainContent_rblIsPatientOnDialysis_0']";

									static String	CNo="//input[@id='ctl00_mainContent_rblIsPatientOnDialysis_1']";
									
									
									static String Cdatefield="//input[@id='ctl00_mainContent_txtPhosphorusValueTakenDate']";

									static String	Clabfield="//input[@id='ctl00_mainContent_txtPhosphorusValue']";

									static String	Cdrugfield="//select[@id='ctl00_mainContent_ddlProduct']";

									static String Cquantityfield="//input[@id='ctl00_mainContent_txtQuantity']";
									static String Cthfield1="//input[@id='ctl00_mainContent_cblPreviousTherapy_0']";
									static String	Cthfield2="//input[@id='ctl00_mainContent_cblPreviousTherapy_1']";
									static String	Cthfield3="//input[@id='ctl00_mainContent_cblPreviousTherapy_2']";
									static String	Cthfield4="//input[@id='ctl00_mainContent_cblPreviousTherapy_3']";
									static String	Cthfield5="//input[@id='ctl00_mainContent_cblPreviousTherapy_4']";
									static String	Cthfield6="//input[@id='ctl00_mainContent_cblPreviousTherapy_5']";
									static String	Cthfield7="//input[@id='ctl00_mainContent_cblPreviousTherapy_6']";
									static String	Cthfield8="//input[@id='ctl00_mainContent_cblPreviousTherapy_7']";

									static String	Cinsfield="//textarea[@id='ctl00_mainContent_txtPatientInstructions']";

									static String	Cfirsttxtfield="//input[@id='ctl00_mainContent_txtPhysFirstName']";

								static String	Clasttxtfield="//input[@id='ctl00_mainContent_txtPhysLastName']";

								static String	CNpifield="//input[@id='ctl00_mainContent_txtPhysNPI']";

							static String	CSlnfield="//input[@id='ctl00_mainContent_txtPhysSLN']";



							static String	CDEAfield="//input[@id='ctl00_mainContent_txtPhysDEA']";

							static String	Cspecialitytxtfield="//select[@id='ctl00_mainContent_ddlPhysSpecialty']";

							static String	Cofficefield="//input[@id='ctl00_mainContent_txtPhysOfficeName']";

							static String Caddfield1="//input[@id='ctl00_mainContent_txtPhysAddressLine1']";

							static String	Caddfield2="//input[@id='ctl00_mainContent_txtPhysAddressLine2']";

							static String	Ccountyfield="//input[@id='ctl00_mainContent_txtPhysAddressCounty']";

							static String Ccityfield="//input[@id='ctl00_mainContent_txtPhysAddressCity']";

							static String Cstatefield="//select[@id='ctl00_mainContent_ddlPhysAddressState']";


							static String CZipfield="//input[@id='ctl00_mainContent_txtPhysAddressZipCode']";


							static String Cphonefield="//input[@id='ctl00_mainContent_txtPhysPhone']";

						static String Ccontactfield="//input[@id='ctl00_mainContent_txtPhysContact']";

						static String CFaxfield="//input[@id='ctl00_mainContent_txtPhysFax']";


						static String	CfaciltyNamefield="//input[@id='ctl00_mainContent_txtTreatmentFacilityName']";

						static String	cfacilgtyContactfield="//input[@id='ctl00_mainContent_txtTreatmentFacilityContact']";

						static String	cfacilityphonefield="//input[@id='ctl00_mainContent_txtTreatmentFacilityPhone']";

						static String	cfacilityFaxfield="//input[@id='ctl00_mainContent_txtTreatmentFacilityFax']";

						static String	cfacilityEmailfield="//input[@id='ctl00_mainContent_txtTreatmentFacilityEmail']";

				    	static String	Cchkfield="//input[@id='ctl00_mainContent_chkFreeStarterKit']";
									
				    	static String btnsave="//input[@id='btnNextFromClinicalTab']";			
									
				    	static String btnsubmit="//button[@id='btnReferralDownload']";

	
  public static  void CreatePatientForm(int row) throws InterruptedException, IOException, BiffException 
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
	//Thread.sleep(4000);
	
	driver.findElement(By.xpath(PatientFirstName)).sendKeys(Utilities.readFromExcel(2, row));
	
	driver.findElement(By.xpath(PatientLastName)).sendKeys(Utilities.readFromExcel(3, row));
	
	driver.findElement(By.xpath(PatientMiddleInitial)).sendKeys(Utilities.readFromExcel(4, row));
	
	driver.findElement(By.xpath(PatientDateOfBirth)).sendKeys(Utilities.readFromExcel(5, row));
	
	driver.findElement(By.xpath(SocialSecrityNumber)).sendKeys(Utilities.readFromExcel(9, row));
	
	String Gender = "Female";
	if (Gender.equals("Female"))
		
	{
		driver.findElement(By.xpath(Female)).click();
	}
	else
		
	{
		driver.findElement(By.xpath(Male)).click();
	}
	
	String status="yes";
	
	if(status.equalsIgnoreCase("yes"))
	{
		driver.findElement(By.xpath(StatusYes)).click();
	}
	else
	{

		driver.findElement(By.xpath(StatusNo)).click();
	}
	
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath(PatientAddressLine1)).sendKeys(Utilities.readFromExcel(6, row));
	
	driver.findElement(By.xpath(PatientAddressLine2)).sendKeys(Utilities.readFromExcel(7, row));
	
	driver.findElement(By.xpath(PatientAddressCity)).sendKeys(Utilities.readFromExcel(8, row));
	
	driver.findElement(By.xpath(PatientAddressZipCode)).sendKeys(Utilities.readFromExcel(10, row));
	
	Select state = new Select(driver.findElement(By.xpath(PatientState)));
	
	state.selectByIndex(4);
	

	
	driver.findElement(By.xpath(PhoneNum)).sendKeys(Utilities.readFromExcel(11, row));
	

	//driver.findElement(By.xpath(AssetValue)).click();
	
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath(btnNextFromPatientTab)).click();
	
	
	
	
	

		
	}
	
	
  public static  void CreateInsuranceForm(int row) throws InterruptedException, IOException, BiffException 
  
  {
	  
	 
	  
	 
	  String status="yes";
		
		if(status.equalsIgnoreCase("yes"))
		{
			driver.findElement(By.xpath(IStatusYes)).click();
			
			
			
		}
		else
		{

			driver.findElement(By.xpath(IStatusNo)).click();
		}
		  
		
		driver.findElement(By.xpath(InsNametxtField)).sendKeys(Utilities.readFromExcel(12, row));
		
		driver.findElement(By.xpath(IPolicytxtField)).sendKeys(Utilities.readFromExcel(13, row));
		
		driver.findElement(By.xpath(IgrouptxtField)).sendKeys(Utilities.readFromExcel(14, row));
		
		driver.findElement(By.xpath(IBintxtField)).sendKeys(Utilities.readFromExcel(15, row));
		
		driver.findElement(By.xpath(IphonetxtField)).sendKeys(Utilities.readFromExcel(16, row));
		
		driver.findElement(By.xpath(IfaxtxtField)).sendKeys(Utilities.readFromExcel(17, row));
		driver.findElement(By.xpath(IfirstnameField)).sendKeys(Utilities.readFromExcel(18, row));
		driver.findElement(By.xpath(IlastnameField)).sendKeys(Utilities.readFromExcel(19, row));
		
		
		if(status.equalsIgnoreCase("yes"))
		{
			driver.findElement(By.xpath(SecInsyesField)).click();
			
			
			
		}
		else
		{

			driver.findElement(By.xpath(SecInsNoField)).click();
		}
		
		
       driver.findElement(By.xpath(SecIName)).sendKeys(Utilities.readFromExcel(20, row));
		
		driver.findElement(By.xpath(SecIPolicy)).sendKeys(Utilities.readFromExcel(21, row));
		
		driver.findElement(By.xpath(SecIBin)).sendKeys(Utilities.readFromExcel(22, row));
		
		driver.findElement(By.xpath(SecIBphone)).sendKeys(Utilities.readFromExcel(23, row));
		
		driver.findElement(By.xpath(SecIFax)).sendKeys(Utilities.readFromExcel(24, row));
		
		driver.findElement(By.xpath(SecIPHFirstName)).sendKeys(Utilities.readFromExcel(25, row));
		driver.findElement(By.xpath(SecIPHLirstName)).sendKeys(Utilities.readFromExcel(26, row));
		
		
		
		
		
		if(status.equalsIgnoreCase("yes"))
		{
			driver.findElement(By.xpath(PInsyesField)).click();
			
			
			
		}
		else
		{

			driver.findElement(By.xpath(pInsNoField)).click();
			
			
					
		}
		
		
		
		 driver.findElement(By.xpath(PhName)).sendKeys(Utilities.readFromExcel(27, row));
			
			driver.findElement(By.xpath(phphone)).sendKeys(Utilities.readFromExcel(28, row));
			
			driver.findElement(By.xpath(Phmemberid)).sendKeys(Utilities.readFromExcel(29, row));
			
			driver.findElement(By.xpath(phgroup)).sendKeys(Utilities.readFromExcel(30, row));
			
			driver.findElement(By.xpath(phbin)).sendKeys(Utilities.readFromExcel(31, row));
			
			driver.findElement(By.xpath(phfax)).sendKeys(Utilities.readFromExcel(32, row));
			driver.findElement(By.xpath(phpcn)).sendKeys(Utilities.readFromExcel(33, row));
			
			
			
			if(status.equalsIgnoreCase("yes"))
			{
				driver.findElement(By.xpath(phsecyes)).click();
				
				
				
			}
			else
			{

				driver.findElement(By.xpath(phsecNo)).click();
				
				
						
			}
				
			
            driver.findElement(By.xpath(PhsName)).sendKeys(Utilities.readFromExcel(34, row));
			
			driver.findElement(By.xpath(phsphone)).sendKeys(Utilities.readFromExcel(35, row));
			
			driver.findElement(By.xpath(Phsmemberid)).sendKeys(Utilities.readFromExcel(36, row));
			
			driver.findElement(By.xpath(phsgroup)).sendKeys(Utilities.readFromExcel(37, row));
			
			driver.findElement(By.xpath(phsbin)).sendKeys(Utilities.readFromExcel(38, row));
			
			driver.findElement(By.xpath(phsfax)).sendKeys(Utilities.readFromExcel(39, row));
			driver.findElement(By.xpath(phspcn)).sendKeys(Utilities.readFromExcel(40, row));
				
		
		
	  
	driver.findElement(By.xpath(nextbtn)).click();	  
		 
 }
  
  
public static  void CreateClinicalForm(int row) throws InterruptedException, IOException, BiffException 
  
  {
	 

	Select dd = new Select(driver.findElement(By.xpath(PrimarycField)));
	
	dd.selectByIndex(1);
	driver.findElement(By.xpath(othercField)).sendKeys(Utilities.readFromExcel(12, row));
	
String status="yes";
	
	if(status.equalsIgnoreCase("yes"))
	{
		driver.findElement(By.xpath(CYes)).click();
	}
	else
	{

		driver.findElement(By.xpath(CNo)).click();
	}
	
	
	 driver.findElement(By.xpath(Cdatefield)).sendKeys(Utilities.readFromExcel(41, row));
		
		driver.findElement(By.xpath(Clabfield)).sendKeys(Utilities.readFromExcel(42, row));
		
		
		Select drug = new Select(driver.findElement(By.xpath(Cdrugfield)));
		
		drug.selectByIndex(1);
		
		driver.findElement(By.xpath(Cquantityfield)).sendKeys(Utilities.readFromExcel(43, row));
		
		
		
		driver.findElement(By.xpath(Cthfield1)).click();
		
		driver.findElement(By.xpath(Cthfield2)).click();
		
		driver.findElement(By.xpath(Cthfield3)).click();
		
		driver.findElement(By.xpath(Cthfield4)).click();
		
		driver.findElement(By.xpath(Cthfield5)).click();
		
		driver.findElement(By.xpath(Cthfield6)).click();
		
		driver.findElement(By.xpath(Cthfield7)).click();

		driver.findElement(By.xpath(Cthfield8)).click();
		
		
		driver.findElement(By.xpath(Cinsfield)).sendKeys(Utilities.readFromExcel(44, row));
		
		driver.findElement(By.xpath(Cfirsttxtfield)).sendKeys(Utilities.readFromExcel(45, row));
		driver.findElement(By.xpath(Clasttxtfield)).sendKeys(Utilities.readFromExcel(46, row));
		
driver.findElement(By.xpath(CNpifield)).sendKeys(Utilities.readFromExcel(47, row));
		
		driver.findElement(By.xpath(CSlnfield)).sendKeys(Utilities.readFromExcel(48, row));
		driver.findElement(By.xpath(CDEAfield)).sendKeys(Utilities.readFromExcel(49, row));
		
Select speciality = new Select(driver.findElement(By.xpath(Cspecialitytxtfield)));
		
speciality.selectByIndex(1);
		

		
		driver.findElement(By.xpath(Cofficefield)).sendKeys(Utilities.readFromExcel(50, row));
		
		driver.findElement(By.xpath(Caddfield1)).sendKeys(Utilities.readFromExcel(51, row));
		
		driver.findElement(By.xpath(Caddfield2)).sendKeys(Utilities.readFromExcel(52, row));
		
		
		
driver.findElement(By.xpath(Ccountyfield)).sendKeys(Utilities.readFromExcel(53, row));
		
		driver.findElement(By.xpath(Ccityfield)).sendKeys(Utilities.readFromExcel(54, row));
		
		
		Select state = new Select(driver.findElement(By.xpath(Cstatefield)));
		
		state.selectByIndex(1);
		
		
		
		
         driver.findElement(By.xpath(CZipfield)).sendKeys(Utilities.readFromExcel(55, row));
		
		driver.findElement(By.xpath(Cphonefield)).sendKeys(Utilities.readFromExcel(56, row));
		driver.findElement(By.xpath(Ccontactfield)).sendKeys(Utilities.readFromExcel(57, row));
		
			
		 driver.findElement(By.xpath(CFaxfield)).sendKeys(Utilities.readFromExcel(58, row));
			
			driver.findElement(By.xpath(CfaciltyNamefield)).sendKeys(Utilities.readFromExcel(59, row));
			driver.findElement(By.xpath(cfacilgtyContactfield)).sendKeys(Utilities.readFromExcel(60, row));
			
			driver.findElement(By.xpath(cfacilityphonefield)).sendKeys(Utilities.readFromExcel(61, row));
			driver.findElement(By.xpath(cfacilityFaxfield)).sendKeys(Utilities.readFromExcel(62, row));
			driver.findElement(By.xpath(cfacilityEmailfield)).sendKeys(Utilities.readFromExcel(63, row));
			driver.findElement(By.xpath(Cchkfield)).click();
			
			driver.findElement(By.xpath(btnsave)).click();
			
			driver.findElement(By.xpath(btnsubmit)).click();
	
			
	
  }



}
