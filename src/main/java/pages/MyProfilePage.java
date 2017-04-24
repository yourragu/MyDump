package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyProfilePage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public MyProfilePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Profile")){
			reportStep("This is not My Profile Page", "FAIL");
		}
	}

	//Edit Home Address and Phone Number
	public EditContactInformationPage ClickEditProfile() throws InterruptedException{
		clickByXpath("//*[@aria-label='Edit your personal information']");
		Thread.sleep(3000);
		return new EditContactInformationPage(driver, test);

	}
	
	//Edit Home Address and Phone Number
		public EditWorkInformationPage ClickEditWork() throws InterruptedException{
			clickByXpath("//button[@aria-label='Edit your work information']");
			Thread.sleep(3000);
			return new EditWorkInformationPage(driver, test);

		}
	
	

}
