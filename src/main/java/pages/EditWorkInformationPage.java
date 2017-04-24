package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditWorkInformationPage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public EditWorkInformationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Edit Work Information")){
			reportStep("This is not Work Information Page", "FAIL");
		}
	}

	// Enter ALR FName
	public EditWorkInformationPage EnterWorkStatus() throws InterruptedException{
		String Str= driver.findElementById("sumdaySelect").getText();
		if(Str.equals("I'm self-employed"))
		{
			clickById("sumdaySelect");
			Thread.sleep(1000);
			clickById("employed");
		}
		else if(Str.equals("I'm employed"))
		{
			clickById("sumdaySelect");
			Thread.sleep(1000);
			clickById("selfEmployed");
		}
		else if (Str.equals("I'm retired or not working"))
		{
			clickById("sumdaySelect");
			Thread.sleep(1000);
			clickById("employed");
		}
		return this;
	}

	// Click Occupation
	public EditWorkInformationPage SelectOccupation() throws InterruptedException{
		String str =driver.findElementByXPath("//div[@class='info-group']/p").getText();
		if(str.equals("Transportation/Warehousing"))
		{
			clickByXpath("//div[@class='info-group']");
			Thread.sleep(1000);
			clickByXpath("(//div[@class='radio'])[16]");
		}
		else if(str.equals("Health Care Professional"))
		{
			clickByXpath("//div[@class='info-group']");
			Thread.sleep(1000);
			clickByXpath("(//div[@class='radio'])[29]");
			
		}
		Thread.sleep(2000);
		return this;
	}

	
	//Click Done 
	public EditWorkInformationPage ClickDone() throws InterruptedException{
		clickByXpath("(//button[text()[contains(.,'Done')]])");
		Thread.sleep(2000);
		return this;
	}
	
	//Click Save Changes
		public EditWorkInformationPage ClickSaveChanges() throws InterruptedException{
			clickByXpath("(//button[text()[contains(.,'Save Changes')]])");
			Thread.sleep(10000);
			return this;

		}
		
		//Verify (MyProfile) Work Confirmation Screen
		public EditWorkInformationPage VerworkConfId(String WConfId) throws InterruptedException{
			verifyTextById("takeoverTitle", WConfId);
			Thread.sleep(2000);
			return this;

		}

		//Verify (MyProfile) Work Confirmation Screen
		public EditWorkInformationPage VerworkConfDesc(String WConfDesc) throws InterruptedException{
			verifyTextById("takeoverDescription", WConfDesc);
			Thread.sleep(2000);
			return this;

		}

		//Click Continue
		public MyProfilePage ClickTakeALook() throws InterruptedException{
			clickByXpath("(//button[text()[contains(.,'Take a look')]])");
			Thread.sleep(2000);
			return new MyProfilePage(driver, test);

		}

}
