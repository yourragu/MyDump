package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class GoalsPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public GoalsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Edit Goals")){
			reportStep("This is not Edit Goals Page", "FAIL");
		}
	}

	//Edit Yearly Goal
	public GoalsPage EditYearlyGoal(String goal) throws InterruptedException{
		enterById("yearlyGoal", goal);
		Thread.sleep(3000);
		return this;

	}
	
	//Click Goal save changes
	public GoalsPage ClickGoalsavechanges() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Save Changes')]]");
		Thread.sleep(10000);
		return this;

	}
	
	//Verify Goal confirmation Screen
	public GoalsPage VerifyGoalConfirmation() throws InterruptedException{
		verifyTextById("takeoverTitle", "Good planning goes a long way");
		verifyTextByXpath("//p[@id='takeoverDescription']", "We updated your yearly goal.");
		Thread.sleep(2000);
		return this;

	}
	
	//Click Continue Investment confirmation screen
	public EditAccountInformationPage ClickContinue() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Continue')]]");
		Thread.sleep(2000);
		return new EditAccountInformationPage(driver,test);

	}
			
		

	}
