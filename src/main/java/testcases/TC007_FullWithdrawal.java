package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC007_FullWithdrawal extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify Full withdrawal amount from sumday account";
		testDescription="Anytime Transfer - Full Withdrawal";
		browserName="chrome";
		dataSheetName="TC007_FullWithdrawal";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void FullWithdrawal(String Email, String Password) throws InterruptedException{

		new LoginPage(driver, test)
		.EnterEmailID(Email)
		.EnterPassWord(Password)
		.ClickLogin()
		.Dashboardtile()
		.ClickTransfersLink()
		.ClickFromAccount()
		.ToAccount()
		.ClickAmountTextBox()
		.ClickFullWithdrawal()
		.ClickDone()
		.ClickMakeItHappenLink()
		.VerifyInstantTransferConfirmation()
		.ClickContinue();
		
		
	}

}
