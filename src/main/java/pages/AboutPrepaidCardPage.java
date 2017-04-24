package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class AboutPrepaidCardPage extends LeafTapsWrappers  {
	public static String Balance;

	// This is to confirm you are in Login Page
	public AboutPrepaidCardPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - About Prepaid Card")){
			reportStep("This is not About Prepaid Card Page", "FAIL");
		}
	}

	//Click prepaid card sign up
	public AboutPrepaidCardPage ClickSignupTop() throws InterruptedException{
		clickByXpath("//*[@routerlink='../signup'][1]");
		Thread.sleep(5000);
		return this;
	}

	//Click Marqueta (Top) Link
	public AboutPrepaidCardPage ClickMarqueta() throws InterruptedException{
		clickByXpath("//*[@class='logo-marqeta'][1]");
		Thread.sleep(2000);
		switchToLastWindow();
		Thread.sleep(10000);
		if(driver.getCurrentUrl().equals("https://www.marqeta.com/"))
		{
			driver.close();
			switchToLastWindow();
		}
		return this;
	}
	
		//Click CNB Link
		public AboutPrepaidCardPage ClickCNBLink() throws InterruptedException{
			clickByXpath("//*[@href='http://cnb-ok.com/']");
			Thread.sleep(2000);
			switchToLastWindow();
			Thread.sleep(10000);
			if(driver.getCurrentUrl().equals("http://cnb-ok.com/"))
			{
				driver.close();
				switchToLastWindow();
			}
			return this;
	}
		
		//Click Oregon Logo
				public AccountDashboardPage ClickLogo() throws InterruptedException{
					clickByXpath("//img[@alt='Oregon plans powered by Sumday'][2]");
					Thread.sleep(3000);
					return new AccountDashboardPage(driver, test);

				}



}
