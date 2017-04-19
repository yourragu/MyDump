package testng3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {

	@Test	
	public void calenderTable()
	{
		System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Workspace//sel//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		
		WebElement frmsrc = driver.findElementByXPath("//*[@class='demo-frame']");
		driver.switchTo().frame(frmsrc);
		WebElement droppable = driver.findElementByLinkText("Droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(droppable, 100, 200);
		
		
		

}
}
