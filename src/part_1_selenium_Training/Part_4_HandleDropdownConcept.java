package part_1_selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Part_4_HandleDropdownConcept {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Software\\webdrivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.freecrm.com");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//input[@type='text'][@name = 'username']")).sendKeys("Tajamul");
		dr.findElement(By.xpath("//input[@type='password'][@name = 'password']")).sendKeys("test@123");
		dr.findElement(By.xpath("//input[@type='submit'][@class = 'btn btn-small']")).click();
	
		
		//Handling Dropdown.
		//Create object select class available in selenium
		Select select = new Select(dr.findElement(By.xpath("//select[@name='search_target'][@class='select']")));
		//select.selectByVisibleText("WEB");
		//select.selectByIndex(1);
		select.selectByValue("WEB");

	}

}
