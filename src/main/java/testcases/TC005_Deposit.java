package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC005_Deposit extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify deposit into sumday account";
		testDescription="Anytime Transfer - Deposit";
		browserName="chrome";
		dataSheetName="TC005";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void MyProfile(String Email, String Password) throws InterruptedException{

		new LoginPage(driver, test)
		.EnterEmailID(Email)
		.EnterPassWord(Password)
		.ClickLogin()
		.Dashboardtile()
		.ClickTransfersLink()
		.TransferFromLink()
		.PickAmtToTransfer()
		.ClickDone()
		.ClickMakeItHappenLink()
		.VerifyInstantTransferConfirmation()
		.ClickContinue();
		
		
	}

}
