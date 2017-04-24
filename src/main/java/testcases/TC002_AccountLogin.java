package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002_AccountLogin extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Login(Positive)";
		testDescription="Login To Opentaps";
		browserName="chrome";
		dataSheetName="TC002";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void login(String Email, String Password) throws InterruptedException{

		new LoginPage(driver, test)
		.EnterEmailID(Email)
		.EnterPassWord(Password)
		.ClickLogin()
		.Dashboardtile()
		.ClickEditAccountInformationLink()
		.ClickActivityLink()
		.ClickCardLink()
		.ClickOverview()
		.ClickEditAccountInformationLink()
		.ClickConditionLink()
		.ClickPenaltyradioOption()
		.ClickDiagnosisOption()
		.ClickDiagnosisCodes()
		.ClickDone()
		.ClickDisabilityPermanent()
		.ClickPenaltyOneOption()
		.ClickPenaltyTwoOption()
		.ClickPenaltyThreeOption()
		.ClickConditionSaveChangesButton()
		.VerifyConditionConfirmation()
		.ClickContinue();//Edit Condition ends here
	

		
		
		
		
		 

	}

}
