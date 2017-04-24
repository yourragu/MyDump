package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class OregonAbleSavingsPlanPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public OregonAbleSavingsPlanPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan")){
			reportStep("This is not Oregon Able savings plan page", "FAIL");
		}
	}

	


}
