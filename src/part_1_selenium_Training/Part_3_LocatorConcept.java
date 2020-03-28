package part_1_selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Part_3_LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Software\\webdrivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.freecrm.com");
		dr.manage().window().maximize();
		
		//1. Xpath 
		
		dr.findElement(By.xpath("//input[@type='text'][@name = 'username']")).sendKeys("Tajamul");
		dr.findElement(By.xpath("//input[@type='password'][@name = 'password']")).sendKeys("test@123");
		dr.findElement(By.xpath("//input[@type='submit'][@class = 'btn btn-small']")).click();
	

		//2. id
		     //dr.findElement(By.id("XXXX")).sendKeys("XXXX");
		
		//3. name
		     //dr.findElement(By.name("XXXX")).click();
		
		//4. Link Test  - only applicable for links
		     //dr.findElement(By.linkText("Upgrade your account")).click();
		
		//5. Partial link text -- not recommended . if link name is long then we can use partial link name.
			 //dr.findElement(By.partialLinkText("Abc def")).click();
		
		//6 CSS Selector
		//7 Class name ..  not recommended as this can be dublicate
		
		//Selecting value from dropdown.
		


	}

}
