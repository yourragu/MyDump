package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ConditionPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public ConditionPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Edit Condition")){
			reportStep("This is not Condition Page", "FAIL");
		}
	}

	//Click penalty option radio button
	public ConditionPage ClickPenaltyradioOption() throws InterruptedException{
		/*WebElement str1 = driver.findElement(By.xpath("//*[@class='radio'][1]"));
		WebElement str2 = driver.findElement(By.xpath("//*[@class='radio'][2]"));
		if(str1.isSelected())
		{
			clickByXpath("//*[@class='radio'][2]");
		}

		else if(str2.isSelected())
		{
			clickByXpath("//*[@class='radio'][1]");
		}
		else
		{
		}*/
		clickByXpath("//*[@class='radio'][3]");
		Thread.sleep(2000);
		return this;
	}


	//Click diagnosis link
	public ConditionPage ClickDiagnosisOption() throws InterruptedException{
		clickByXpath("//*[@class='info-group']");
		Thread.sleep(3000);
		return this;

	}

	//Choose diagnosis codes
	public ConditionPage ClickDiagnosisCodes() throws InterruptedException{
		clickByXpath("(//*[@class='code-name'])[6]");
		Thread.sleep(3000);
		return this;

	}

	//Choose diagnosis codes
	public ConditionPage ClickDiagnosisCodes2() throws InterruptedException{
		clickByXpath("(//*[@class='code-name'])[7]");
		Thread.sleep(3000);
		return this;

	}


	//Click done
	public ConditionPage ClickDone() throws InterruptedException{
		clickByXpath("//button[@class='btn-submit']");
		Thread.sleep(2000);
		return this;

	}

	//Click disability 'NO'
	public ConditionPage ClickDisabilityTemporary() throws InterruptedException{
		clickByXpath("//*[@for='permanentDisabilityLabel_no']");
		Thread.sleep(2000);
		return this;

	}

	//Click disability 'YES'
	public ConditionPage ClickDisabilityPermanent() throws InterruptedException{
		clickByXpath("//*[@for='permanentDisabilityLabel_yes']");
		Thread.sleep(2000);
		return this;

	}

	//Click penalty option one
	public ConditionPage ClickPenaltyOneOption() throws InterruptedException{
		clickByXpath("(//*[@class='checkmark'])[1]");
		Thread.sleep(2000);
		return this;

	}

	//Click penalty option two
	public ConditionPage ClickPenaltyTwoOption() throws InterruptedException{
		clickByXpath("(//*[@class='checkmark'])[2]");
		Thread.sleep(2000);
		return this;

	}

	//Click penalty option three
	public ConditionPage ClickPenaltyThreeOption() throws InterruptedException{
		clickByXpath("(//*[@class='checkmark'])[3]");
		Thread.sleep(2000);
		return this;

	}

	//Click save changes
	public ConditionPage ClickConditionSaveChangesButton() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Save Changes')]]");
		Thread.sleep(10000);
		return this;

	}

	//Verify Edit Condition Confirmation Screen
	public ConditionPage VerifyConditionConfirmation() throws InterruptedException{
		verifyTextById("takeoverTitle", "Got it");
		Thread.sleep(2000);
		return this;

	}

	//Click Continue in Edit Condition confirmation screen
	public EditAccountInformationPage ClickContinue() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Continue')]]");
		Thread.sleep(2000);
		return new EditAccountInformationPage(driver,test);

	}




}
