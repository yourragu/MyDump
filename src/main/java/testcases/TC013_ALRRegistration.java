package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.GetStartedPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC013_ALRRegistration extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify ALR Registration";
		testDescription="ALR Regstration Flow";
		browserName="chrome";
		dataSheetName="TC013_ALRRegistrationFlow";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData",dependsOnMethods={"testcases.TC012_BeneficiaryRegistration.BeneficiaryRegistration"})
	public void ALRRegistration(String Email,String text1, String text2, String text3, String text4, 
			 String text6, String text7, String code, String text8, String text9, String text10, String text11,
			String text12,String VerEmail, String CrePass, String ConfCrePass) throws InterruptedException{

		new GetStartedPage(driver, test)
		.EnterNewEmail(Email)
		.SelectOther()
		.SelectPlanDocument()
		.SelectSiteDocument()
		.ClickNext()
		.EnterFirstName(text1)
		.EnterLastName(text2)
		.EnterBirthDate(text3)
		.ClickGender()
		.SelectGenderHe()		
		.EnterSSN(text4)
		.EnterLine1(text6)
		.EnterLine2(text7)
		.EnterZipCode(code)
		.ClickNext()
		.ClickOption()
		.ClickDiagnosis()
		.SelectDiagnosis()
		.ClickDone()
		.ClickDisabilityNo()
		.ClickFirstPenalty()
		.ClickSecondPenalty()
		.ClickALRNext()
		.EnterALRFName(text8)
		.EnterALRLName(text9)
		.ClickRelationShip()
		.SelectRelationShip()
		.ClickGender()
		.SelectGender()
		.EnterALRBirthDate(text10)
		.EnterALRSSN(text11)
		.EnterPhNo(text12)
		.ClickCopyAddress()
		.ClickALRNext()
		.ClickWork()
		.SelectWork()
		.ClickOccupation()
		.SelectOccupation()
		.ClickOccupationDone()
		.ClickOccupationNext()
		.ClickGetStarted()
		.SelectAnswerforOne()
		.SelectAnswerforSecond()
		.SelectAnswerforThird()
		.SelectAnswerforFourth()
		.GetEmail(VerEmail)
		.CreatePass(CrePass)
		.ConfirmCreatePass(ConfCrePass)
		.ClickALRStatementOption()
		//.ClickStayTouch()
		//.ClickMoveOn()
		;
	
		
		
		
		
		
	}

}
