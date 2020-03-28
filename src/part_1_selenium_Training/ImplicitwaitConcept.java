package part_1_selenium_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Software\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait Global wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);  // this is for page load
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // this is for all page elements.

	}

}
