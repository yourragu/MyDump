package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class AccountOverViewPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public AccountOverViewPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Account Overview")){
			reportStep("This is not Account OverView Page", "FAIL");
		}
	}

	//Click Account tile in the dashboard
	public EditAccountInformationPage ClickEditAccountInformationLink() throws InterruptedException{
		clickByLink("Edit account information");
		Thread.sleep(3000);
		return new EditAccountInformationPage(driver,test);

	}


	//Click Transfers Link
	public InstantTransfersPage ClickTransfersLink() throws InterruptedException{
		clickByXpath("//span[text()[contains(.,'Transfers')]]");
		Thread.sleep(3000);
		return new InstantTransfersPage(driver,test);

	}


	//Check Balance
	public AccountOverViewPage VerifyBalance() throws InterruptedException{
		verifyTextByXpath("(//span[@class='amount'])[1]", AccountDashboardPage.Balance);
		System.out.println("Balance at Account OverView"+AccountDashboardPage.Balance);
		Thread.sleep(5000);
		return this;

	}

	//Click Activity
	public AccountActivityPage ClickActivity() throws InterruptedException{
		clickByLink("Activity");
		Thread.sleep(10000);
		return new AccountActivityPage(driver, test);

	}

	//Click Prepaid card link
	public AboutPrepaidCardPage ClickPrepaidCard() throws InterruptedException{
		clickByLink("Get a prepaid card");
		Thread.sleep(3000);
		return new AboutPrepaidCardPage(driver, test);

	}
	
	


}
