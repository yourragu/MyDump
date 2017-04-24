package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class BeneficiaryInformationPage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public BeneficiaryInformationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Beneficiary Information")){
			reportStep("This is not Beneficiary Information Page", "FAIL");
		}
	}

	//Enter first Name
	public BeneficiaryInformationPage EnterFirstName(String text) throws InterruptedException{
		enterById("firstName", text);
		return this;
	}

	//Enter Last Name
	public BeneficiaryInformationPage EnterLastName(String text) throws InterruptedException{
		enterById("lastName", text);
		return this;
	}

	//Enter Gender
	public BeneficiaryInformationPage ClickGender() throws InterruptedException{
		clickById("gender");
		Thread.sleep(2000);
		return this;

	}

	//Select Gender
	public BeneficiaryInformationPage SelectGender() throws InterruptedException{
		clickById("female");
		return this;
	}

	//Select Gender 'He'
	public BeneficiaryInformationPage SelectGenderHe() throws InterruptedException{
		clickById("male");
		return this;
	}

	//Enter Birthdate
	public BeneficiaryInformationPage EnterBirthDate(String text) throws InterruptedException{
		enterById("birthDate", text);
		return this;
	}

	//Enter SSN
	public BeneficiaryInformationPage EnterSSN(String text) throws InterruptedException{
		enterById("ssn", text);
		return this;
	}

	//Enter Phone Number
	public BeneficiaryInformationPage EnterPhoneNo(String text) throws InterruptedException{
		enterById("phone", text);
		return this;
	}

	//Enter Street 1
	public BeneficiaryInformationPage EnterLine1(String text) throws InterruptedException{
		enterById("line1", text);
		return this;
	}

	//Enter Street 2
	public BeneficiaryInformationPage EnterLine2(String text) throws InterruptedException{
		enterById("line2", text);
		return this;
	}

	//Enter ZipCode
	public BeneficiaryInformationPage EnterZipCode(String code) throws InterruptedException{
		enterById("postalCode", code);
		Thread.sleep(3000);
		return this;
	}


	//Click Next
	public DisabilityInformationPage ClickNext() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Next')]]");
		Thread.sleep(3000);
		return new DisabilityInformationPage(driver, test);
	}

	// Click Relationship
	public BeneficiaryInformationPage ClickRelationShip() throws InterruptedException{
		clickById("relationship");
		Thread.sleep(2000);
		return this;
	}

	// Select Relationship
	public BeneficiaryInformationPage SelectRelationShip() throws InterruptedException{
		clickById("legalGuardian");
		Thread.sleep(2000);
		return this;
	}

	// Click Pre-Select Address
	public BeneficiaryInformationPage ClickPreSelectAddress() throws InterruptedException{
		clickById("preselectedAddress");
		Thread.sleep(2000);
		return this;
	}

	// Select Pre-Select Address
		public BeneficiaryInformationPage SelectPreSelectAddress() throws InterruptedException{
			clickByXpath("	(//*[@role='presentation'])[8]");
			Thread.sleep(5000);
			return this;
		}
	
    
}
