package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class IdentityVerificationPage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public IdentityVerificationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Identity Verification")){
			reportStep("This is not Identity Verification Page", "FAIL");
		}
	}

//	Click GetStarted
	public IdentityVerificationPage ClickGetStarted() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Get Started')]]");
		Thread.sleep(5000);
		return this;
	}
	

//	Answer 1st Ques
	public IdentityVerificationPage SelectAnswerforOne() throws InterruptedException{
		clickByXpath("(//div[@class='radio'])[5]");
		Thread.sleep(2000);
		clickByClassName("icon-circle-right-carrot");
		return this;
	}
	
//	Answer 2nd Ques
	public IdentityVerificationPage SelectAnswerforSecond() throws InterruptedException{
		clickByXpath("(//div[@class='radio'])[5]");
		Thread.sleep(2000);
		clickByClassName("icon-circle-right-carrot");
		return this;
	}
	
//	Answer 3rd Ques
	public IdentityVerificationPage SelectAnswerforThird() throws InterruptedException{
		clickByXpath("(//div[@class='radio'])[5]");
		Thread.sleep(2000);
		clickByClassName("icon-circle-right-carrot");
		return this;
	}
//	Answer 4rth Ques
	public AccountCreationPage SelectAnswerforFourth() throws InterruptedException{
		clickByXpath("(//div[@class='radio'])[5]");
		Thread.sleep(2000);
		clickByXpath("//button[@class='btn-submit pull-right']");
		Thread.sleep(3000);
		return new AccountCreationPage(driver, test);
		
	}
	
}
