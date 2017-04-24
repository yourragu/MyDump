package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ForgotPasswordPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public ForgotPasswordPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Forgot Password")){
			reportStep("This is not Forgot Password Page", "FAIL");
		}
	}

	//Click Account tile in the Dashboard
	public ForgotPasswordPage VerifyPasswordText() throws InterruptedException{
		verifyTextContainsByXpath("//div[@class='login-container']/h2", "Can't remember your password?");
		verifyTextContainsByXpath("//div[@class='login-container']/p", "It happens to the best of us. Let's set up a new one in a few steps.");
		Thread.sleep(5000);
		return this;

	}

	//Enter Forgot Email ID
	public ForgotPasswordPage EnterForgotPasword(String Email) throws InterruptedException{
		enterById("Email", Email);
		Thread.sleep(2000);
		return this;

	}
	//Click Send Help
	public ForgotPasswordPage ClickSendHelp() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Send help')]]");
		Thread.sleep(5000);
		return this;

	}

	//Verify error message wwhen email Id is not entered
	public ForgotPasswordPage VerifyEmailValidationError() throws InterruptedException{
		verifyTextContainsByXpath("//span[@class='validation field-validation-error']", "The Email field is required.");
		Thread.sleep(5000);
		return this;

	}

	//Verify forgot password static Text
	public ForgotPasswordPage VerifyForgotPasswordStaticText() throws InterruptedException{
		verifyTextContainsByXpath("//div[@class='login-container']/h2", "Head over to your inbox to reset your password.");
		Thread.sleep(5000);
		return this;

	}
	//Click Try Again 
	public ForgotPasswordPage ClickTryAgain() throws InterruptedException{
		clickByXpath("//a[text()[contains(.,'Try again')]]");
		Thread.sleep(2000);
		return this;

	}

}
