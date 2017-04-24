package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC008_MonthlyTransfer extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify Monthly Transfer Edit and Stop Monthly Transfer";
		testDescription="Monthly Transfer - Edit/Stop Transfer";
		browserName="chrome";
		dataSheetName="TC008_Monthly Transfer";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void MonthlyTransfer(String Email, String Password) throws InterruptedException{

		new LoginPage(driver, test)
		.EnterEmailID(Email)
		.EnterPassWord(Password)
		.ClickLogin()
		.Dashboardtile()
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
