package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class InvestmentOptionPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public InvestmentOptionPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Edit Investment Options")){
			reportStep("This is not Investment option Page", "FAIL");
		}
	}

	//Choose Investment option
	public InvestmentOptionPage ClickInvestmentoption(String Option) throws InterruptedException{
		
		if(Option.equals("CONSERVATIVE"))
				{
			clickByXpath("(//div[@class='radio'])[2]");
				}
		else if(Option.equals("MODERATE"))
		{
			clickByXpath("(//div[@class='radio'])[3]");
		}
		else if(Option.equals("AGGRESSIVE"))
		{
			clickByXpath("(//div[@class='radio'])[1]");
		}
		return this;

	}
	
	//Click Investment Save changes button
			public InvestmentOptionPage ClickInvestmentsavechanges() throws InterruptedException{
				clickByXpath("//button[text()[contains(.,'Save Changes')]]");
				Thread.sleep(10000);
				return new InvestmentOptionPage(driver,test);

			}
			
			//Verify Investment confirmation Screen
			public InvestmentOptionPage VerifyInvestmentConfirmation() throws InterruptedException{
				verifyTextById("takeoverTitle", "You're all set");
				verifyTextByXpath("//p[@id='takeoverDescription']", "We updated your investment choice.");
				Thread.sleep(2000);
				return this;

			}
			//Click Continue Investment confirmation screen
			public EditAccountInformationPage ClickContinue() throws InterruptedException{
				clickByXpath("//button[text()[contains(.,'Continue')]]");
				Thread.sleep(2000);
				return new EditAccountInformationPage(driver,test);

			}

	}
