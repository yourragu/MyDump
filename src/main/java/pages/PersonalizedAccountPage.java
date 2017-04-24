package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class PersonalizedAccountPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public PersonalizedAccountPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Personalize Account")){
			reportStep("This is not Personalized Account Page", "FAIL");
		}
	}


	//Enter Nick Name
	public PersonalizedAccountPage EnterNickName(String Id) throws InterruptedException{

		if(Id.equalsIgnoreCase("Sumday"))
		{
			enterById("title", "Savings ABLE Account");
		}

		else
		{

			enterById("title", "National ABLE for All Acc");
		}
		return new PersonalizedAccountPage(driver,test);

	}

	//Click Customize Save changes button
	public PersonalizedAccountPage Clickcustomizesavechanges() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Save Changes')]]");
		Thread.sleep(3000);
		return this;

	}

	//Verify Customize Confirmation Screen
	public PersonalizedAccountPage VerifyCustomizeConfirmation() throws InterruptedException{
		verifyTextById("takeoverTitle", "It's personal");
		verifyTextByXpath("//p[@id='takeoverDescription']", "We've made your changes.");
		Thread.sleep(2000);
		return this;

	}

	//Click Continue in Edit customize confirmation screen
	public EditAccountInformationPage ClickContinue() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Continue')]]");
		Thread.sleep(2000);
		return new EditAccountInformationPage(driver,test);

	}
	
	//Click Save and Continue
		public CashPositionPage ClickSaveAndContinue() throws InterruptedException{
			clickByXpath("//button[text()[contains(.,'Save and continue')]]");
			Thread.sleep(2000);
			return new CashPositionPage(driver,test);

		}



}
