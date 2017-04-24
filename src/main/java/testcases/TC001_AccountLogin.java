package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_AccountLogin extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Login(Positive)";
		testDescription="Login To Opentaps";
		browserName="chrome";
		dataSheetName="TC001";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void login(String Email, String Password, String NickName, String Investment, String Option, String goal) throws InterruptedException{

		new LoginPage(driver, test)
		.EnterEmailID(Email)
		.EnterPassWord(Password)
		.ClickLogin()
		.Dashboardtile()
		/*.ClickEditAccountInformationLink()
		.ClickActivityLink()
		.ClickCardLink()
		.ClickOverview()
		.ClickEditAccountInformationLink()
		.ClickConditionLink()
		.ClickPenaltyradioOption()
		.ClickDiagnosisOption()
		.ClickDiagnosisCodes2()
		.ClickDone()
		.ClickDisabilityTemporary()
		.ClickPenaltyOneOption()
		.ClickPenaltyTwoOption()
		.ClickConditionSaveChangesButton()
		.VerifyConditionConfirmation()
		.ClickContinue()//Edit Condition ends here
		.ClickCustomizeLink()
		.EnterNickName(NickName)
		.Clickcustomizesavechanges()
		.VerifyCustomizeConfirmation()
		.ClickContinue()//NickName updation ends here
		.ClickDistributionLink()
		.EnterAllocation(Investment)
		.Clickcustomizesavechanges()
		.VerifydistributionConfirmation()
		.ClickContinue()//Money Allocation  ends here
		.ClickInvestmentLink()
		.ClickInvestmentoption(Option)
		.ClickInvestmentsavechanges()
		.VerifyInvestmentConfirmation()
		.ClickContinue()//Investment choice ends here
		.ClickGoalLink()
		.EditYearlyGoal(goal)
		.ClickGoalsavechanges()
		.VerifyGoalConfirmation()
		.ClickContinue()// Goals ends here
		.ClickTransfersLink()
		.TransferFromLink()
		.PickAmtToTransfer()
		.ClickDone()
		.ClickMakeItHappenLink()
		.VerifyInstantTransferConfirmation()
		.ClickContinue()*/
		.ClickTransfersLink()
		.ClickMonthlyTransferLink()
		.MonthlyTransferAccount()
		.PickMonthlyAmtToTransfer()
		.ClickDone()
		.MonthlyTransferDay()
		.MonthlyTransferDate()
		.MonthlyTransferDone()
		.ClickMakeItHappenLink()
		.VerifyMonthlyTransferConfirmation()
		.ClickContinue()
		.ClickButtonEdit()
		.ClickGoBack()
		.ClickButtonEdit()
		.MonthlyTransferDay()
		.ChangeMonthlyTransferDate()
		.MonthlyTransferDone()
		.ClickSaveChanges()
		.VerifyMonthlyEditConfirmation()
		.ClickContinue()
		.StopMonthlyTransfer();
		












	}

}
