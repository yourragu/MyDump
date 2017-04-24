package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC010_AllActivity extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify All activity";
		testDescription="All Activity";
		browserName="chrome";
		dataSheetName="TC010_AllActivity";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void AllActivity(String Email, String Password) throws InterruptedException{

		new LoginPage(driver, test)
		.EnterEmailID(Email)
		.EnterPassWord(Password)
		.ClickLogin()
		.GetBalance()
		.Dashboardtile()
		.VerifyBalance()
		.ClickActivity()
		.VerifyActivityBalance()
		.CheckAllActivity();
			
		
	}

}
