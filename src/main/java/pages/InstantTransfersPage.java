package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class InstantTransfersPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public InstantTransfersPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Instant Transfers")){
			reportStep("This is not Instant Transfers Page", "FAIL");
		}
	}

	//AnyTime Transfer - From Account
	public InstantTransfersPage TransferFromLink() throws InterruptedException{
		clickById("selectedSourceAccount");
		clickByXpath("(//*[@role='option'])[1]");
		Thread.sleep(5000);
		return this;

	}

	//AnyTime Transfer - PickAmtToTransfer
	public InstantTransfersPage PickAmtToTransfer() throws InterruptedException{
		clickByXpath("//*[@class='info-group']");
		Thread.sleep(2000);
		clickByXpath("//li[@class='tab'][2]");
		Thread.sleep(2000);
		return this;

	}

	//Click done
	public InstantTransfersPage ClickDone() throws InterruptedException{
		clickByXpath("//button[@class='btn-submit']");
		Thread.sleep(15000);
		return this;

	}

	//Click Make it Happen
	public InstantTransfersPage ClickMakeItHappenLink() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Make it happen')]]");
		Thread.sleep(15000);
		return this;

	}

	//Verify AnyTime Transfer confirmation Screen
	public InstantTransfersPage VerifyInstantTransferConfirmation() throws InterruptedException{
		verifyTextById("takeoverTitle", "Your contribution is in the works");
		verifyTextByXpath("//p[@id='takeoverDescription']", "It should be complete in 2-7 business days. We'll send you an email when it's done.");
		Thread.sleep(2000);
		return this;

	}

	//Click Continue in Instant Transfer (AnyTime Transfer) confirmation screen
	public AccountOverViewPage ClickContinue() throws InterruptedException{
		clickByXpath("//button[text()[contains(.,'Continue')]]");
		Thread.sleep(2000);
		return new AccountOverViewPage(driver,test);

	}
	//Click Monthly Transfer Link
	public MonthlyTransferPage ClickMonthlyTransferLink() throws InterruptedException{
		clickByXpath("//a[text()[contains(.,'Monthly Transfer')]]");
		Thread.sleep(5000);
		return new MonthlyTransferPage(driver, test);
	}

	//AnyTime Transfer - From Account (Withdrawal)
	public InstantTransfersPage ClickFromAccount() throws InterruptedException{
		clickByXpath("(//button[@id='selectedSourceAccount'])[1]");
		String WithdrawalAcct = driver.findElementById("selectedSourceAccountOptions").getText();
		if(WithdrawalAcct.contains("ABLE Account")|| (WithdrawalAcct.contains("Able")))
			clickById("a10");
		Thread.sleep(5000);
		return this;
	}

	//AnyTime Transfer - To Account (Withdrawal)
	public InstantTransfersPage ToAccount() throws InterruptedException{
		clickByXpath("(//button[@id='selectedSourceAccount'])[2]");
		clickByXpath("(//*[@role='option'])[8]");
		Thread.sleep(2000);
		return this;
	}

	//AnyTime Transfer - Enter Amount TextBox (Withdrawal)
	public InstantTransfersPage ClickAmountTextBox() throws InterruptedException{
		clickByXpath("//*[@class='info-group']");
		Thread.sleep(2000);
		return this;
	}

	//AnyTime Transfer - Enter Partial Withdrawal
	public InstantTransfersPage EnterPartialWithdrawal(String data) throws InterruptedException{
		enterById("withdrawAmount", data);
		Thread.sleep(2000);
		return this;

	}

	//Verify AnyTime Transfer Partial Withdrawal confirmation Screen
	public InstantTransfersPage VerifyWithdrawalConfirmationScreen() throws InterruptedException{
		verifyTextById("takeoverTitle", "Your withdrawal is in the works");
		verifyTextByXpath("//p[@id='takeoverDescription']", "It should be complete in 2-7 business days. We'll send you an email when it's done.");
		Thread.sleep(2000);
		return this;

	}


	//Click Full Withdrawal
	public InstantTransfersPage ClickFullWithdrawal() throws InterruptedException{
		clickByXpath("(//button[@type='button'])[4]");
		Thread.sleep(2000);
		return this;

	}

	//Enter Excess deposit Amount 
	public InstantTransfersPage EnterExcessDepositAmount(String data) throws InterruptedException{
		clickByXpath("//*[@class='info-group']");
		Thread.sleep(2000);
		enterById("depositAmount", data);
		Thread.sleep(2000);
		return this;

	}

	//Verify excess amount error 
	public InstantTransfersPage ExcessAmountError(String text) throws InterruptedException{
		verifyTextContainsByXpath("//div[@class='picker validation']", text);
		Thread.sleep(2000);
		return this;

	}

	//Click Cancel 
	public InstantTransfersPage ClickCancel()throws InterruptedException{
		clickByXpath("(//div[@class='mobile-modal-navbar cancel'])/a");
		Thread.sleep(2000);
		return this;

	}

	//Click validation Error Message
	public InstantTransfersPage ClickValidation()throws InterruptedException{
		verifyTextContainsByXpath("(//div[@class='validation']/div)/p","Your withdrawal is in the works");
		
		Thread.sleep(2000);
		return this;

	}

	
}


