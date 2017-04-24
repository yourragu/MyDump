package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class AccountSetupPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public AccountSetupPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Account Setup")){
			reportStep("This is not Account SetUp Page", "FAIL");
		}
	}

	//Click Get Started
	public PersonalizedAccountPage ClickGetStarted() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Get started')]]");
		Thread.sleep(3000);
		return new PersonalizedAccountPage(driver,test);
	}
	

}
