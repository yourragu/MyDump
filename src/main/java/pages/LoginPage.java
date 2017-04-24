package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class LoginPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Account Login")){
			reportStep("This is not Account Login Page", "FAIL");
		}
	}

	//Enter Email ID
	public LoginPage EnterEmailID(String Email){
		enterById("Email", Email);
		return this;
	}
	//Enter password
	public  LoginPage EnterPassWord(String Password){
		enterById("Password", Password);
		return this;
	}
	//Enter Click Login
	public AccountDashboardPage ClickLogin() throws InterruptedException{
		clickByXpath("//button[@type='submit']");
		Thread.sleep(20000);
		return new AccountDashboardPage(driver,test);

	}
	//Click Forgot Password
		public ForgotPasswordPage ClickForgotPasswordLink() throws InterruptedException{
			clickByXpath("//a[text()[contains(.,'Forgot your password?')]]");
			Thread.sleep(2000);
			return new ForgotPasswordPage(driver,test);

		}
		


}
