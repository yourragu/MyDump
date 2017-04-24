package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.GetStartedPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC012_BeneficiaryRegistration extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify Beneficiary Registration";
		testDescription="Beneficiary Regstration Flow";
		browserName="chrome";
		dataSheetName="TC012_BeneficiaryRegistrationFlow";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void BeneficiaryRegistration(String Email,String text1, String text2, String text3, String text4, 
			String text5, String text6, String text7, String code, String VerEmail, String CrePass, String ConfCrePass) throws InterruptedException{

		new GetStartedPage(driver, test)
		.EnterNewEmail(Email)
		.SelectMe()
		.SelectPlanDocument()
		.SelectSiteDocument()
		.ClickNext()
		.EnterFirstName(text1)
		.EnterLastName(text2)
		.ClickGender()
		.SelectGender()
		.EnterBirthDate(text3)
		.EnterSSN(text4)
		.EnterPhoneNo(text5)
		.EnterLine1(text6)
		.EnterLine2(text7)
		.EnterZipCode(code)
		.ClickNext()
		.ClickLabel()
		.ClickDiagnosis()
		.SelectDiagnosis()
		.ClickDone()
		.ClickDisabilityYes()
		.ClickFirstPenalty()
		.ClickSecondPenalty()
		.ClickThirdPenalty()
		.ClickNext()
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
		.ClickStatementOption()
		//.ClickStayTouch()
		//.ClickMoveOn()
		;
	
		
		
		
		
		
	}

}
