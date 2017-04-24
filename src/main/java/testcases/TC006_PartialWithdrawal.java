package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC006_PartialWithdrawal extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify Partial withdrawal amount from sumday account";
		testDescription="Anytime Transfer - Partial Withdrawal";
		browserName="chrome";
		dataSheetName="TC006_PartialWithdrawal";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void PartialWithdrawal(String Email, String Password, String data) throws InterruptedException{

		new LoginPage(driver, test)
		.EnterEmailID(Email)
		.EnterPassWord(Password)
		.ClickLogin()
		.Dashboardtile()
		.ClickTransfersLink()
		.ClickFromAccount()
		.ToAccount()
		.ClickAmountTextBox()
		.EnterPartialWithdrawal(data)
		.ClickDone()
		.ClickMakeItHappenLink()
		.VerifyWithdrawalConfirmationScreen()
		.ClickContinue();
		
		
		
	}

}
