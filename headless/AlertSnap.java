package headless;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertSnap {

	@Test
	public void takeSnap() throws HeadlessException, AWTException, IOException, InterruptedException{
		//Step 1: Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


		//Step2: Call Java Class to another Class
		//ClassName obj = new ClassName();		
		ChromeDriver driver = new ChromeDriver();	

		// Maximize
		driver.manage().window().maximize();

		//Step 3: Load URL		
		driver.get("https://www.irctc.co.in/eticketing/forgotPassword.jsf");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("forgot_passwrd:checkDetails1").click();
		Thread.sleep(1000);
		
		// take snap
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File("./snaps/Alert.png"));

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
