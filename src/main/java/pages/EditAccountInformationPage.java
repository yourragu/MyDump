package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditAccountInformationPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public EditAccountInformationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Edit Account Information")){
			reportStep("This is not Edit Account Information Page", "FAIL");
		}
	}

	//Click Activity link
	public EditAccountInformationPage ClickActivityLink() throws InterruptedException{
		clickByLink("Activity");
		Thread.sleep(10000);
		return this;

	}


	//Click Card Link
	public EditAccountInformationPage ClickCardLink() throws InterruptedException{
		clickByLink("Card");
		Thread.sleep(3000);
		return this;

	}

	//Click overview Link
	public AccountOverViewPage ClickOverview() throws InterruptedException{
		clickByLink("Overview");
		Thread.sleep(3000);
		return new AccountOverViewPage(driver, test);

	}

	//Click Condition Link
	public ConditionPage ClickConditionLink() throws InterruptedException{
		clickByXpath("//*[@routerlink='condition']");
		Thread.sleep(3000);
		return new ConditionPage(driver,test);

	}

	//Click Customize Link
	public PersonalizedAccountPage ClickCustomizeLink() throws InterruptedException{
		clickByXpath("//*[@routerlink='customize']");
		Thread.sleep(3000);
		return new PersonalizedAccountPage(driver,test);

	}


	//Click distribution Link
	public CashPositionPage ClickDistributionLink() throws InterruptedException{
		clickByXpath("//*[@routerlink='distribution']");
		Thread.sleep(3000);
		return new CashPositionPage(driver,test);

	}

	//Click Investment Link
	public InvestmentOptionPage ClickInvestmentLink() throws InterruptedException{
		clickByXpath("//*[@routerlink='investment']");
		Thread.sleep(3000);
		return new InvestmentOptionPage(driver,test);

	}

	//Click Goal Link
	public GoalsPage  ClickGoalLink() throws InterruptedException{
		clickByXpath("//*[@routerlink='goal']");
		Thread.sleep(3000);
		return new GoalsPage(driver,test);

	}
	
	//Click Transfers Link
		public InstantTransfersPage ClickTransfersLink() throws InterruptedException{
			clickByXpath("//span[text()[contains(.,'Transfers')]]");
			Thread.sleep(3000);
			return new InstantTransfersPage(driver,test);

		}
	
	



}
