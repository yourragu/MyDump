package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_FooterValidation extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify Footer Validation";
		testDescription="Footer Validation";
		browserName="chrome";
		dataSheetName="TC004";
		category="Sumday Savings/Able Plan";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void FooterValidation(String Email, String Password, String text1) throws InterruptedException {

		new LoginPage(driver, test)

		.EnterEmailID(Email)
		.EnterPassWord(Password)
		.ClickLogin()
		.ClickSelectOne()
		/*.ClickOregonAble()
		.ClickOregonPlanLink()
		.ClickSavingsPlanAgreement_Left()
		.ClickSavingsDisclosureBooklet_Left()
		.ClickParticipationAgreementSavings_Middle()
		.ClickDisclosureBookletSavings_Middle()
		.ClickAbleForAll()*/
		.ClickABLEforAllLink()
		.ClickAbleForAllAgreement_Left()
		.ClickAbleForAllDisclosureBooklet_Left()
		.ClickParticipationAgreementAble_Middle()
		.ClickDisclosureBookletAble_Middle()
		.ClickOnlinePrivacy()
		.ClickSiteTermsOfUse()
		.ClickBrowserCompatibility();
		
		
		
		
	}

}
