package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC011_AboutPrepaidCard extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify about prepaid card page";
		testDescription="About prepaid card page";
		browserName="chrome";
		dataSheetName="TC011_AboutPrepaidCard";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void AboutPrepaidCard(String Email, String Password) throws InterruptedException{

		new LoginPage(driver, test)
		.EnterEmailID(Email)
		.EnterPassWord(Password)
		.ClickLogin()
		.Dashboardtile()
		.ClickPrepaidCard()
		.ClickLogo()
		.ClickPromoLink()
		.ClickMarqueta()
		.ClickCNBLink();	
		
	}

}
