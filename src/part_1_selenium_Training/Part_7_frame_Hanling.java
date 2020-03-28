package part_1_selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part_7_frame_Hanling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Software\\webdrivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.freecrm.com");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.findElement(By.xpath("//input[@type='text'][@name = 'username']")).sendKeys("Tajamul");
		dr.findElement(By.xpath("//input[@type='password'][@name = 'password']")).sendKeys("test@123");
		dr.findElement(By.xpath("//input[@type='submit'][@class = 'btn btn-small']")).click();

		//How to handle a frame.
		dr.switchTo().frame("mainpanel");
		dr.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		//dr.switchTo().frame("leftpanel");
		dr.findElement(By.xpath("//a[contains(text(),'Messages')]")).click();
		
		
	}

}
