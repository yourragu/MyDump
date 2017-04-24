package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.GetStartedPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC014_MultipleBeneficiaryRegistration extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify Multiple Beneficiary Registration";
		testDescription="Multiple ALR Registration Flow";
		browserName="chrome";
		dataSheetName="TC014_MultipleBeneficiaryRegistration";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void MultipleBeneficiaryRegistration(String text1,String text2, String text3, String text4, String text5,
			String text6,String NName, String CashInvestment ) throws InterruptedException{

		new GetStartedPage(driver, test)
		.ClickSignIn()
		.EnterEmail(text1)
		.EnterPassword(text2)
		.ClickLogin()
		.SelectOther()
		.SelectPlanDocument()
		.SelectSiteDocument()
		.ClickStatementOption()
		.ClickNext()
		.EnterFirstName(text3)
		.EnterLastName(text4)
		.EnterBirthDate(text5)
		.ClickGender()
		.SelectGenderHe()		
		.EnterSSN(text6)
		.ClickRelationShip()
		.SelectRelationShip()
		.ClickPreSelectAddress()
		.SelectPreSelectAddress()
		.ClickNext()
		.ClickOption()
		.ClickDiagnosis()
		.SelectDiagnosis()
		.ClickDone()
		.ClickDisabilityNo()
		.ClickFirstPenalty()
		.ClickSecondPenalty()
		.ClickMoveOn()
		.ClickGetStarted()
		.EnterNickName(NName)
		.ClickSaveAndContinue()
		.EnterCashAllocation(CashInvestment)
		;
	
		
		
		
		
		
	}

}
