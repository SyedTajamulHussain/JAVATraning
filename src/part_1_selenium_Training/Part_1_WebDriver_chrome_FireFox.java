package part_1_selenium_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Part_1_WebDriver_chrome_FireFox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Automation Software\\webdrivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		// WebDriver is an interface and FIrefoxDriver is the class.
		// We have created object of firefoxDriver.
		 driver.get("https://www.google.com");

		//System.setProperty("webdriver.chrome.driver", "C:\\Automation Software\\webdrivers\\chromedriver.exe");
		//WebDriver dr = new ChromeDriver();
		//dr.get("https://www.google.com");
		//String title = dr.getTitle();
		//System.out.println(title);
		//if (title.equals("Google")) {
		//	System.out.println("Pass -Title is correct");
		//} else {
		//	System.out.println("Fail -Title is incorrect");
	//	}
		//System.out.println(dr.getCurrentUrl());

		// System.out.println(dr.getPageSource());

		//dr.quit();
	}

}
