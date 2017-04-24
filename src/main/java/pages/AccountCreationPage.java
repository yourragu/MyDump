package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class AccountCreationPage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public AccountCreationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Account Creation")){
			reportStep("This is not Account Creation Page", "FAIL");
		}
	}


	// Get Email
	public AccountCreationPage GetEmail(String VerEmail) throws InterruptedException{
		String getEmail= driver.findElementById("email").getText();
		System.out.println("GetEmail:"+getEmail);
		System.out.println("VerEmail"+VerEmail);
		//String str = driver.findElementById("email").getText();
		
		if(getEmail.equals(VerEmail)){
			System.out.println("Registration Email Matched...Execution Proceeding!!");
		}
		else
		{
			System.out.println("Registration Email doesn't match..Execution Terminated");
			
		}
		Thread.sleep(2000);
		return this;
	}

	// Create Password
	public AccountCreationPage CreatePass(String text1) throws InterruptedException{
		enterById("password",text1);
		Thread.sleep(2000);
		return this;
	}

	// Confirm Create Password
	public AccountCreationPage ConfirmCreatePass(String ConfCrePass) throws InterruptedException{
		enterById("confirmPassword",ConfCrePass);
		Thread.sleep(2000);
		return this;
	}

	// Click Statement option
	public AccountCreationPage ClickStatementOption() throws InterruptedException{
		clickByXpath("(//div[@class='radio'])[2]");
		Thread.sleep(2000);
		return this;
	}
	
	// Click ALR Statement option
		public AccountCreationPage ClickALRStatementOption() throws InterruptedException{
			clickByXpath("(//div[@class='radio'])[3]");
			Thread.sleep(2000);
			return this;
		}
	
	// Click Stay in touch option
		public AccountCreationPage ClickStayTouch() throws InterruptedException{
			clickByXpath("//div[@class='checkbox']");
			Thread.sleep(2000);
			return this;
		}
	
	// Click Move On
		public AccountCreationPage ClickMoveOn() throws InterruptedException{
			clickByXpath("//button[@class='btn-block arrow']");
			Thread.sleep(5000);
			return this;
		}

}
