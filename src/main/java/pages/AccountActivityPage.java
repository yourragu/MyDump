package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class AccountActivityPage extends LeafTapsWrappers  {

	// This is to confirm you are in Login Page
	public AccountActivityPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Oregon ABLE Savings Plan - Account Activity")){
			reportStep("This is not Account Activity Page", "FAIL");
		}
	}

	//Click Account tile in the dashboard
	public AccountActivityPage ClickAccountActivity() throws InterruptedException{
		clickByLink("Edit account information");
		Thread.sleep(3000);
		return new AccountActivityPage(driver,test);

	}
	//Check Balance
	public AccountActivityPage VerifyActivityBalance() throws InterruptedException{
		verifyTextByXpath("//span[@class='h2 blue-text']", AccountDashboardPage.Balance);
		System.out.println("Balance at activity page"+AccountDashboardPage.Balance);
		Thread.sleep(5000);
		return this;

	}
	//Check All Activity
	public AccountActivityPage CheckAllActivity() throws InterruptedException{
		Actions builder = new Actions(driver);
		List<WebElement> str = driver.findElementsByXPath("//*[@aria-controls='activityDetailsView']");
		for (WebElement activity : str) {
			builder.click(activity).perform();
			//clickByXpath("//img[@alt='Oregon plans powered by Sumday'][2]");
			Thread.sleep(2000);
		}
		return new AccountActivityPage(driver, test);


	}

}
