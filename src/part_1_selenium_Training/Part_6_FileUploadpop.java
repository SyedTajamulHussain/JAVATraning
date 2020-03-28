package part_1_selenium_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Part_6_FileUploadpop {
// while uploading file from window pop up..you just need to give element refrence and sendkeys with file path.
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Software\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//ul[@class='midSec menu']/li[6]")).click();
		driver.findElement(By.name("email")).sendKeys("tajamulsyed26@yahoo.com");
		driver.findElement(By.name("PASSWORD")).sendKeys("Zainab@786!");
		driver.findElement(By.xpath("//form[@id='lgnFrmNew']/div[9]/button[@type='submit']")).click();
		
		//Hover
		WebElement element=driver.findElement(By.xpath("//div[@class='headGNB cloneCont wrap']/ul[2]/li[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
		//Clicking from dropdown
		driver.findElement(By.linkText("Edit Profile")).click();
	}

}
