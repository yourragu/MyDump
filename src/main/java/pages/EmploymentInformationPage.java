package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EmploymentInformationPage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public EmploymentInformationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Employment Information")){
			reportStep("This is not Employment Information Page", "FAIL");
		}
	}

//	Click Work Status
	public EmploymentInformationPage ClickWork() throws InterruptedException{
		clickById("sumdaySelect");
		Thread.sleep(2000);
		return this;
	}
	
//	Select Type of Work
	public EmploymentInformationPage SelectWork() throws InterruptedException{
		clickById("selfEmployed");
		Thread.sleep(2000);
		return this;
	}
	
//	Click Occupation
	public EmploymentInformationPage ClickOccupation() throws InterruptedException{
		clickByClassName("info-group");
		Thread.sleep(2000);
		return this;
	}
	
//	Select Occupation
	public EmploymentInformationPage SelectOccupation() throws InterruptedException{
		clickByXpath("(//div[@class='radio'])[8]");
		Thread.sleep(2000);
		return this;
	}
	
	//	Click Occupation Done
	public EmploymentInformationPage ClickOccupationDone() throws InterruptedException{
		clickByXpath("(//button[@class='btn-submit'])");
		Thread.sleep(2000);
		return this;
	}
	
//	Click Occupation Next
	public IdentityVerificationPage ClickOccupationNext() throws InterruptedException{
		clickByXpath("//button[@class='btn-submit pull-right']");
		Thread.sleep(5000);
		return new IdentityVerificationPage(driver, test);
	}
	
	
	
	
}
