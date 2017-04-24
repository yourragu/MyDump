package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DisabilityInformationPage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public DisabilityInformationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Disability Information")){
			reportStep("This is not Disability Information Page", "FAIL");
		}
	}


	//Click Label option 2
	public DisabilityInformationPage ClickLabel() throws InterruptedException{
		clickByXpath("(//*[@class='radio'])[1]");
		Thread.sleep(2000);
		return this;
	}

	//Click Label option 3
		public DisabilityInformationPage ClickOption() throws InterruptedException{
			clickByXpath("(//*[@class='radio'])[3]");
			Thread.sleep(2000);
			return this;
			
		}
	//	Click Diagnosis
	public DisabilityInformationPage ClickDiagnosis() throws InterruptedException{
		clickByClassName("info-group");
		Thread.sleep(2000);
		return this;
	}
//	Select Diagnosis
	public DisabilityInformationPage SelectDiagnosis() throws InterruptedException{
		clickByXpath("(//div[@class='radio'])[10]");
		Thread.sleep(2000);
		return this;
	}
	
//	Click Done
	public DisabilityInformationPage ClickDone() throws InterruptedException{
		clickByXpath("(//button[@type='submit'])[2]");
		return this;
	}
	
//	Click Disability 'Yes'
	public DisabilityInformationPage ClickDisabilityYes() throws InterruptedException{
		clickByXpath("//label[@for='permanentDisabilityLabel_yes']");
		return this;
	}
	
//	Click Disability 'No'
	public DisabilityInformationPage ClickDisabilityNo() throws InterruptedException{
		clickByXpath("//label[@for='permanentDisabilityLabel_no']");
		return this;
	}
	
//	Click First Penalty
	public DisabilityInformationPage ClickFirstPenalty() throws InterruptedException{
		clickByXpath("//label[@for='eligibilityCertifyLabel1']/div");
		Thread.sleep(2000);
		return this;
	}
	
	
//	Click Second Penalty
	public DisabilityInformationPage ClickSecondPenalty() throws InterruptedException{
		clickByXpath("//label[@for='eligibilityCertifyLabel2']/div");
		Thread.sleep(2000);
		return this;
	}
	
//	Click Third Penalty
	public DisabilityInformationPage ClickThirdPenalty() throws InterruptedException{
		clickByXpath("//label[@for='eligibilityCertifyLabel3']/div");
		Thread.sleep(2000);
		return this;
	}
	
//	Click Next
	public EmploymentInformationPage ClickNext() throws InterruptedException{
		clickByXpath("(//button[@type='submit'])[1]");
		Thread.sleep(5000);
		return new EmploymentInformationPage(driver, test);
	}
	
//	Click ALRNext
	public AuthorizedLegalRepresentativePage ClickALRNext() throws InterruptedException{
		clickByXpath("(//button[@type='submit'])[1]");
		Thread.sleep(5000);
		return new AuthorizedLegalRepresentativePage(driver, test);
	}
	
//	Click Move On
	public AccountSetupPage ClickMoveOn() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Move on')]]");
		Thread.sleep(5000);
		return new AccountSetupPage(driver, test);
	}
}
