package part_1_selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Part_8_MouseMovement_Drag_Drop_Mouseover {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Software\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com");
		
		//mouse over action.
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[@id='smoothmenu1']/ul/li[6]"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("MyFlexiPlan")).click();
		
		action.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
		driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']")).click();	
		
		
		
	}

}
