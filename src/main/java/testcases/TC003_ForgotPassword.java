package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_ForgotPassword extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify Forgot Password";
		testDescription="Forgot PasswordCheck";
		browserName="chrome";
		dataSheetName="TC003";
		category="Sumday Savings Plan";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void ForgotPassword(String Email) throws InterruptedException {

		new LoginPage(driver, test)

		.ClickForgotPasswordLink()
		.VerifyPasswordText()
		.ClickSendHelp()
		.VerifyEmailValidationError()
		.EnterForgotPasword(Email)
		.ClickSendHelp()
		.VerifyForgotPasswordStaticText()
		.ClickTryAgain();
	}

}
