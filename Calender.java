package testng3;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {

	@Test	
	public void calenderTable()
	{
		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Workspace//sel//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		String n="10";
		driver.findElementById("datepicker").click();

		List<WebElement> cal = driver.findElementsByXPath("//*[@class='ui-state-default']");
		System.out.println("Total Size="+cal.size());
		for (WebElement webElement : cal) {
			if(webElement.getText().equalsIgnoreCase(n))
			{
				webElement.clear();
				System.out.println(webElement.getText());
				
			}

			
		}




	}

}
