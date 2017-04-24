package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class AccountDashboardPage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public AccountDashboardPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Account Dashboard")){
			reportStep("This is not Account Dashboard Page", "FAIL");
		}
	}

	//Click Account tile in the Dashboard
	public AccountOverViewPage Dashboardtile() throws InterruptedException{
		clickByXpath("(//a[@class='tile-content clearfix pointer'])[1]");
		Thread.sleep(5000);
		return new AccountOverViewPage(driver,test);
	}

	//Click (Footer) SelectOne
	public AccountDashboardPage ClickSelectOne() throws InterruptedException{
		clickByXpath("//a[text()[contains(.,'Select one')]]");
		Thread.sleep(2000);
		return this;
	}

	//Choose Savings Plan (Footer)
	public AccountDashboardPage ClickOregonAble() throws InterruptedException{
		clickByXpath("//a[text()[contains(.,'Oregon ABLE Savings Plan')]]");
		Thread.sleep(2000);
		return this;
	}

	//Choose ABLE for ALL (Footer)
	public AccountDashboardPage ClickAbleForAll() throws InterruptedException{
		clickByXpath("//a[text()[contains(.,'ABLE For ALL Savings Plan')]]");
		Thread.sleep(2000);
		return this;
	}


	//Open Savings Plan URL
	public AccountDashboardPage ClickOregonPlanLink() throws InterruptedException{
		clickByXpath("(//a[@href='http://www.oregonablesavings.com/'])[2]");
		Thread.sleep(2000);
		switchToLastWindow();
		Thread.sleep(2000);
		driver.close();
		switchToLastWindow();
		return this;
	}

	//Open ABLE for ALL URL
	public AccountDashboardPage ClickABLEforAllLink() throws InterruptedException{
		clickByXpath("(//a[@href='http://www.ableforall.com/'])[2]");
		Thread.sleep(2000);
		switchToLastWindow();
		Thread.sleep(2000);
		driver.close();
		switchToLastWindow();
		return this;
	}


	//Click Participation Agreement(Savings Plan -Left)
	public AccountDashboardPage ClickSavingsPlanAgreement_Left() throws InterruptedException{
		clickByXpath("(//a[@href='http://www.oregonablesavings.com/participation-agreement'])[1]");
		Thread.sleep(5000);
		switchToLastWindow();
		Thread.sleep(2000);
		driver.close();
		switchToLastWindow();
		return this;
	}

	//Click Participation Agreement(Able for All - Left)
	public AccountDashboardPage ClickAbleForAllAgreement_Left() throws InterruptedException{
		clickByXpath("(//a[@href='http://www.ableforall.com/participation-agreement'])[1]");
		Thread.sleep(5000);
		switchToLastWindow();
		Thread.sleep(2000);
		driver.close();
		switchToLastWindow();
		return this;
	}
	//Click Disclosure Plan (Savings Plan -Left)
	public AccountDashboardPage ClickSavingsDisclosureBooklet_Left() throws InterruptedException{
		clickByXpath("(//a[@href='http://www.oregonablesavings.com/assets/docs/oregon-able-plan-disclosure-booklet.pdf'])[1]");
		Thread.sleep(5000);
		switchToLastWindow();
		Thread.sleep(2000);
		driver.close();
		switchToLastWindow();
		return this;
	}

	//Click Disclosure Plan (Able For All -Left)
	public AccountDashboardPage ClickAbleForAllDisclosureBooklet_Left() throws InterruptedException{
		clickByXpath("(//a[@href='http://www.ableforall.com/assets/docs/able-for-all-plan-disclosure-booklet.pdf'])[1]");
		Thread.sleep(5000);
		switchToLastWindow();
		Thread.sleep(2000);
		driver.close();
		switchToLastWindow();
		return this;
	}
	//Click Participation Agreement(Savings Plan-Middle)
	public AccountDashboardPage ClickParticipationAgreementSavings_Middle() throws InterruptedException{
		clickByXpath("(//a[@href='http://www.oregonablesavings.com/participation-agreement'])[2]");
		Thread.sleep(5000);
		switchToLastWindow();
		Thread.sleep(2000);
		driver.close();
		switchToLastWindow();
		return this;
	}
	//Click Disclosure Booklet(Savings Plan -Middle)
	public AccountDashboardPage ClickDisclosureBookletSavings_Middle() throws InterruptedException{
		clickByXpath("(//a[@href='http://www.oregonablesavings.com/assets/docs/oregon-able-plan-disclosure-booklet.pdf'])[2]");
		Thread.sleep(5000);
		switchToLastWindow();
		Thread.sleep(2000);
		driver.close();
		switchToLastWindow();
		return this;
	}

	//Click Participation Agreement(ABLE Plan-Middle)
	public AccountDashboardPage ClickParticipationAgreementAble_Middle() throws InterruptedException{
		clickByXpath("(//a[@href='http://www.ableforall.com/participation-agreement'])[2]");
		Thread.sleep(5000);
		switchToLastWindow();
		Thread.sleep(2000);
		driver.close();
		switchToLastWindow();
		return this;
	}
	//Click Disclosure Booklet(ABLE Plan -Middle)
	public AccountDashboardPage ClickDisclosureBookletAble_Middle() throws InterruptedException{
		clickByXpath("(//a[@href='http://www.ableforall.com/assets/docs/able-for-all-plan-disclosure-booklet.pdf'])[2]");
		Thread.sleep(5000);
		switchToLastWindow();
		Thread.sleep(2000);
		driver.close();
		switchToLastWindow();
		return this;
	}

	//Click Online Privacy Statement
	public AccountDashboardPage ClickOnlinePrivacy() throws InterruptedException{
		Actions builder = new Actions(driver);
		WebElement privacy= driver.findElementByXPath("//*[@href='/privacy']");
		builder.clickAndHold(privacy).click(privacy).build().perform();
		switchToLastWindow();
		verifyTextContainsByXpath("(//*[@class='container'])[1]/h1", "Online Privacy Statement");
		Thread.sleep(5000);
		System.out.println("Online privacy statment verified");
		//driver.close();
		switchToLastWindow();
		return this;
	}


	//Click Site Terms of Use
	public AccountDashboardPage ClickSiteTermsOfUse() throws InterruptedException{
		Actions builder = new Actions(driver);
		WebElement site= driver.findElementByXPath("//*[@href='/terms']");
		builder.clickAndHold(site).click(site).build().perform();
		Thread.sleep(3000);
		switchToLastWindow();
		return this;
	}

	//Click Browser Compatibility
	public AccountDashboardPage ClickBrowserCompatibility() throws InterruptedException{
		Actions builder = new Actions(driver);
		WebElement bc= driver.findElementByXPath("//*[@href='/browser-compatibility']");
		builder.clickAndHold(bc).click(bc).build().perform();
		Thread.sleep(3000);
		switchToLastWindow();
		return this;
	}

	//Verify Balance
	public AccountDashboardPage GetBalance() throws InterruptedException{
		Balance = driver.findElementByXPath("//div[@class='balance'][1]").getText();
		System.out.println("Balance at Dashboard"+Balance);
		return this;
	}

	//Click Prepaid card Promo Link
	public AboutPrepaidCardPage ClickPromoLink() throws InterruptedException{
		clickByXpath("(//*[@class='notifications'])[2]");
		Thread.sleep(3000);
		return new AboutPrepaidCardPage(driver, test);

	}

	//Click my profile link
	public MyProfilePage ClickMyProfile() throws InterruptedException{
		clickByLink("my profile");
		Thread.sleep(10000);
		return new MyProfilePage(driver, test);

	}


}
