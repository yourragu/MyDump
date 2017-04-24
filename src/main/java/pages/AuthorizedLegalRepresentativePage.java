package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class AuthorizedLegalRepresentativePage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public AuthorizedLegalRepresentativePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Authorized Legal Representative Information")){
			reportStep("This is not Authorized Legal Representative Page", "FAIL");
		}
	}



	// Enter ALR FName
	public AuthorizedLegalRepresentativePage EnterALRFName(String text8) throws InterruptedException{
		enterById("firstName",text8);
		return this;
	}

	// Enter ALR LName
	public AuthorizedLegalRepresentativePage EnterALRLName(String text9) throws InterruptedException{
		enterById("lastName",text9);
		return this;
	}

	// Click Relationship
	public AuthorizedLegalRepresentativePage ClickRelationShip() throws InterruptedException{
		clickById("relationship");
		Thread.sleep(2000);
		return this;
	}

	// Select Relationship
	public AuthorizedLegalRepresentativePage SelectRelationShip() throws InterruptedException{
		clickById("legalGuardian");
		Thread.sleep(2000);
		return this;
	}

	// Click Gender
	public AuthorizedLegalRepresentativePage ClickGender() throws InterruptedException{
		clickById("gender");
		return this;
	}

	// Select Gender
	public AuthorizedLegalRepresentativePage SelectGender() throws InterruptedException{
		clickById("male");
		Thread.sleep(2000);
		return this;
	}

	// Enter ALR BirthDay
	public AuthorizedLegalRepresentativePage EnterALRBirthDate(String text10) throws InterruptedException{
		enterById("birthDate", text10);
		return this;
	}

	//Enter ALR SSN
	public AuthorizedLegalRepresentativePage EnterALRSSN(String text11) throws InterruptedException{
		enterById("ssn", text11);
		Thread.sleep(2000);
		return this;
	}

	//Enter Phone Number
	public AuthorizedLegalRepresentativePage EnterPhNo(String text12) throws InterruptedException{
		enterById("phone", text12);
		Thread.sleep(2000);
		return this;
	}


	//Copy Address
	public AuthorizedLegalRepresentativePage ClickCopyAddress() throws InterruptedException{
		clickByXpath("//div[@class='checkbox']");
		Thread.sleep(2000);
		return this;
	}
	
	//Click ALR Next
		public EmploymentInformationPage ClickALRNext() throws InterruptedException{
			clickByXpath("//button[text()[contains(.,'Next')]]");
			Thread.sleep(2000);
			return new EmploymentInformationPage(driver, test);
		}
}
