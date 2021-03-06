package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

	public static void main(String[] args) throws InterruptedException {

		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();

		// Wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Load the URL :: get ->
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		/*// Click on the link that has content 'am'
		driver.findElementByPartialLinkText("am-Babu").click();
		
		// Title
		String title = driver.getTitle();
		System.out.println(title);*/
		
		WebElement eleH2 = driver.findElementByTagName("h2");
		String text = eleH2.getText();
		System.out.println(text);
		
		String attribute = driver.findElementById("login").getAttribute("method");
		System.out.println(attribute);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
