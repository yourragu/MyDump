package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class AccountLoginPage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public AccountLoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Account Login")){
			reportStep("This is not Account Login Page", "FAIL");
		}
	}

	//Enter Email ID
	public AccountLoginPage EnterEmail(String text1) throws InterruptedException{
		enterByXpath("//*[@type='email']", text1);
		Thread.sleep(2000);
		return this;
	}

	//Enter Password
	public AccountLoginPage EnterPassword(String text2) throws InterruptedException{
		enterByXpath("//*[@type='password']", text2);
		Thread.sleep(2000);
		return this;
	}

	//Click Login
	public GetStartedPage ClickLogin() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Log in and create a new account')]]");
		Thread.sleep(10000);
		return new GetStartedPage(driver, test);
	}



}
