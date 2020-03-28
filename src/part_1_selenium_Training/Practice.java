package part_1_selenium_Training;

import java.awt.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Software\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Category')]"))).build().perform();
		Thread.sleep(1000);

		action.moveToElement(driver.findElement(By.xpath(
				"//div[@class='nav-template nav-flyout-content nav-tpl-itemList']/span[1]/span[contains(text(),'Echo & Alexa')]")))
				.build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[contains(text(),'All-new Echo Dot')]")).click();
		

		Select selec = new Select(driver.findElement(By.id("quantity")));
		selec.selectByIndex(1);
		driver.findElement(By.id("add-to-cart-button")).click();

		// getting text

		String str = driver.findElement(By.className("hlb-item-quantity")).getText();

		if (str.equals("Quantity added:2")) {
			System.out.println("Correct Quantity");
			System.out.println(str);
		} else {
			System.out.println("Incorrect Quantity");
		}
	}
}
