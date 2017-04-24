package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CashPositionPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public CashPositionPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Edit Cash Position")){
			reportStep("This is not Cash Position Page", "FAIL");
		}
	}

	//Enter Investment Allocation Percentage
	public CashPositionPage EnterAllocation(String Investment) throws InterruptedException{
		enterById("investmentContributionPercentage", Investment);
		Thread.sleep(2000);
		return new CashPositionPage(driver, test);

	}
	
	//Enter Cash Allocation Percentage
		public CashPositionPage EnterCashAllocation(String CashInvestment) throws InterruptedException{
			enterById("cashContributionPercentage", CashInvestment);
			Thread.sleep(2000);
			return new CashPositionPage(driver, test);

		}
	

	//Click distribution Save changes button
	public CashPositionPage Clickcustomizesavechanges() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Save Changes')]]");
		Thread.sleep(10000);
		return this;

	}
	//Click distribution confirmation
	public CashPositionPage VerifydistributionConfirmation() throws InterruptedException{
		verifyTextById("takeoverTitle", "We made your changes");
		verifyTextByXpath("//p[@id='takeoverDescription']", "Your target allocation has been updated.");
		Thread.sleep(2000);
		return this;

	}

	//Click Continue distribution confirmation screen
	public EditAccountInformationPage ClickContinue() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Continue')]]");
		Thread.sleep(2000);
		return new EditAccountInformationPage(driver,test);

	}


}
