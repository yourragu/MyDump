package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MonthlyTransferPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public MonthlyTransferPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Monthly Transfers")){
			reportStep("This is not Monthly Transfers Page", "FAIL");
		}
	}

	

	
	//Monthly Transfer - Select From Account
	public MonthlyTransferPage MonthlyTransferAccount() throws InterruptedException{
		clickById("sourceAccount");
		clickByXpath("(//*[@role='option'])[1]");
		Thread.sleep(5000);
		return this;

	}
	//Monthly Transfer - PickAmtToTransfer
		public MonthlyTransferPage PickMonthlyAmtToTransfer() throws InterruptedException{
			clickByXpath("(//*[@class='info-group'])[1]");
			Thread.sleep(2000);
			clickByXpath("(//*[@class='tabs tabs-justified'])/div[1]");
			Thread.sleep(2000);
			return this;

		}
		
		
		//Monthly Transfer - PickAmtToTransfer
				public MonthlyTransferPage ss() throws InterruptedException{
					clickByXpath("(//*[@class='info-group'])[1]");
					Thread.sleep(2000);
					clickByXpath("(//*[@class='tabs tabs-justified'])/div[1]");
					Thread.sleep(2000);
					return this;

				}
				
				//Click Monthly Transfer Done
				public MonthlyTransferPage ClickDone() throws InterruptedException{
					clickByXpath("//button[@class='btn-submit']");
					Thread.sleep(15000);
					return this;

				}
				
				//Click Monthly transfer day
				public MonthlyTransferPage MonthlyTransferDay() throws InterruptedException{
					clickByXpath("(//*[@class='info-group'])[2]");
					Thread.sleep(15000);
					return this;

				}
				
				//Click Monthly transfer Date
				public MonthlyTransferPage MonthlyTransferDate() throws InterruptedException{
					clickByXpath("(//span[text()[contains(.,'27')]])[2]");
					Thread.sleep(3000);
					return this;

				}
				
				//Click Monthly transfer Done
				public MonthlyTransferPage MonthlyTransferDone() throws InterruptedException{
					clickByXpath("(//button[@class='btn-submit'])[2]");
					Thread.sleep(3000);
					return this;

				}
				
				//Click Monthly  Make it Happen
				public MonthlyTransferPage ClickMakeItHappenLink() throws InterruptedException{
					clickByXpath("//button[text()[contains(.,'Make it happen')]]");
					Thread.sleep(15000);
					return this;

				}
				
				//Verify Monthly Transfer confirmation Screen
				public MonthlyTransferPage VerifyMonthlyTransferConfirmation() throws InterruptedException{
					verifyTextById("takeoverTitle", "Another job well done");
					verifyTextByXpath("//p[@id='takeoverDescription']", "You set up a monthly transfer.");
					Thread.sleep(2000);
					return this;

				}
				
				//Click Continue in Monthly Transfer confirmation screen
				public MonthlyTransferPage ClickContinue() throws InterruptedException{
					clickByXpath("//button[text()[contains(.,'Continue')]]");
					Thread.sleep(2000);
					return this;

				}

				//Click Continue in Monthly Transfer confirmation screen
				public MonthlyTransferPage ClickButtonEdit() throws InterruptedException{
					clickByXpath("//button[text()[contains(.,'Edit')]]");
					Thread.sleep(2000);
					return this;

				}
				
				//Click Go Back how it was
				public MonthlyTransferPage ClickGoBack() throws InterruptedException{
					clickByXpath("//a[text()[contains(.,'Go back to how it was')]]");
					Thread.sleep(2000);
					return this;

				}
				//Click Monthly transfer Date
				public MonthlyTransferPage ChangeMonthlyTransferDate() throws InterruptedException{
					clickByXpath("(//span[text()[contains(.,'2')]])[2]");
					Thread.sleep(3000);
					return this;

				}
				
				//Click Save Changes
				public MonthlyTransferPage ClickSaveChanges() throws InterruptedException{
					clickByXpath("//button[text()[contains(.,'Save changes')]]");
					Thread.sleep(10000);
					return this;

				}
				
				//Verify Monthly Transfer confirmation Screen
				public MonthlyTransferPage VerifyMonthlyEditConfirmation() throws InterruptedException{
					verifyTextById("takeoverTitle", "Change is good");
					verifyTextByXpath("//p[@id='takeoverDescription']", "You updated your monthly transfers.");
					Thread.sleep(2000);
					return this;

				}
				
				//Stop Monthly Transfers
				public MonthlyTransferPage StopMonthlyTransfer() throws InterruptedException{
					clickByXpath("//button[text()[contains(.,'Stop Monthly Transfers')]]");
					Thread.sleep(2000);
					return this;

				}
				//Enter Excess Monthly transfer Amount
				public MonthlyTransferPage EnterMonthlyTransferAmount(String data2)throws InterruptedException{
					clickByXpath("(//*[@class='info-group'])[1]");
					Thread.sleep(2000);
					enterByXpath("//input[@class='ng-untouched ng-pristine ng-valid']", data2);
					Thread.sleep(2000);
					return this;

				}
				//Verify excess amount error 
				public MonthlyTransferPage ExcessAmountError(String text) throws InterruptedException{
					verifyTextContainsByXpath("//div[@class='picker validation']", text);
					Thread.sleep(2000);
					return this;

				}
				//Click Cancel 
				public MonthlyTransferPage ClickCancel()throws InterruptedException{
					clickByXpath("(//div[@class='mobile-modal-navbar cancel'])/a");
					Thread.sleep(2000);
					return this;

				}
}
