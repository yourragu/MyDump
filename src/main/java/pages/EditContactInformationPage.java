package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditContactInformationPage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public EditContactInformationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Edit Contact Information")){
			reportStep("This is not Edit Contact Information Page", "FAIL");
		}
	}

	//Enter Ph No
	public EditContactInformationPage EnterPhNo(String Phone) throws InterruptedException{
		enterById("phone", Phone);
		return this;
	}

	//Get Gender

	public EditContactInformationPage GetGender() throws InterruptedException{
		String Str= driver.findElementById("gender").getText();
		if(Str.equals("as a he"))
		{
			clickById("gender");
			Thread.sleep(1000);
			clickById("female");
		}
		else if(Str.equals("as a she"))
		{
			clickById("gender");
			Thread.sleep(1000);
			clickById("male");
		}
		Thread.sleep(10000);
		return this;
	}

	//Enter Hold Period (Address)
	public EditContactInformationPage VerifyHoldPeriod(String VerError) throws InterruptedException{
		String str = "Hold on 30 days before changing your address";
		if(str.equals(VerError)){
			verifyTextByXpath("//*[@class='red-text text-bold']", VerError);
		}
		else
		{
			System.out.println("Edit address code not written due to address change hold period!!");
		}

		return this;
	}

	//Click Save Changes
	public EditContactInformationPage ClickSaveChanges() throws InterruptedException{
		clickByXpath("(//button[text()[contains(.,'Save Changes')]])");
		Thread.sleep(3000);
		return this;

	}

	//Verify (MyProfile) Confirmation Screen
	public EditContactInformationPage VerMyProfileConfId(String ConfId) throws InterruptedException{
		verifyTextById("takeoverTitle", ConfId);
		Thread.sleep(2000);
		return this;

	}

	//Verify (MyProfile) Confirmation Screen
	public EditContactInformationPage VerMyProfileConfDesc(String ConfDesc) throws InterruptedException{
		verifyTextById("takeoverDescription", ConfDesc);
		Thread.sleep(2000);
		return this;

	}

	//Click Continue
	public MyProfilePage ClickContinue() throws InterruptedException{
		clickByXpath("(//button[text()[contains(.,'Continue')]])");
		Thread.sleep(2000);
		return new MyProfilePage(driver, test);

	}

}
