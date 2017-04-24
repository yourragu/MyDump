package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MonthlyTransferPage;
import wrappers.LeafTapsWrappers;

public class TC009_TransferErrorMessageValidation extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify Error Message Validation";
		testDescription="AnyTime/Monthly Error message validation";
		browserName="chrome";
		dataSheetName="TC009_TransferErrorMessageValidation";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void login(String Email, String Password, String data, String text1, String data2, String text2) throws InterruptedException{

		new LoginPage(driver, test)
		.EnterEmailID(Email)
		.EnterPassWord(Password)
		.ClickLogin()
		.Dashboardtile()
		.ClickTransfersLink()
		.TransferFromLink()
		.EnterExcessDepositAmount(data)
		.ExcessAmountError(text1)
		.ClickCancel()
		
		//Already Withdrawal Happened
		.ClickFromAccount()
		.ClickValidation()
		
		//Monthly Transfer
		
		.ClickMonthlyTransferLink()
		.MonthlyTransferAccount()
		.EnterMonthlyTransferAmount(data2)
		.ExcessAmountError(text2)
		.ClickCancel();
			
	}

}
