package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class GetStartedPage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public GetStartedPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Get Started")){
			reportStep("This is not Get Started Page", "FAIL");
		}
	}

	//Enter New Email
	public GetStartedPage EnterNewEmail(String text) throws InterruptedException{
		enterById("email", text);
		Thread.sleep(3000);
		return this;
	}

	//Select It's me option
	public GetStartedPage SelectMe() throws InterruptedException{
		clickByXpath("//*[@for='ownerOption']");
		return this;
	}

	//Select SomeOne Else
	public GetStartedPage SelectOther() throws InterruptedException{
		clickByXpath("//label[@for='alrLabel']/div");
		return this;
	}

	//Select Plan Document
	public GetStartedPage SelectPlanDocument() throws InterruptedException{
		clickByXpath("(//*[@class='checkbox'])[1]");
		return this;
	}


	//Select Site Document
	public GetStartedPage SelectSiteDocument() throws InterruptedException{
		clickByXpath("(//*[@class='checkbox'])[2]");
		return this;
	}

	// Click Statement option
	public GetStartedPage ClickStatementOption() throws InterruptedException{
		clickByXpath("(//*[@class='radio'])[3]");
		Thread.sleep(2000);
		return this;
	}

	//Click Next
	public BeneficiaryInformationPage ClickNext() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Next')]]");
		Thread.sleep(10000);
		return new BeneficiaryInformationPage(driver, test);
	}

	//Click Sign in Link
	public AccountLoginPage ClickSignIn() throws InterruptedException{
		clickByLink("sign in");
		Thread.sleep(5000);
		return new AccountLoginPage(driver, test);
	}

}
