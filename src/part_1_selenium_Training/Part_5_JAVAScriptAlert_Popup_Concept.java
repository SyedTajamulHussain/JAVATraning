package part_1_selenium_Training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part_5_JAVAScriptAlert_Popup_Concept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Software\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();

		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		String str = alert.getText();
		System.out.println(str);
		if (str.equals("Please enter a valid user name")) {
			System.out.println("Correct alert");
		} else {
			System.out.println("incorrect alert");
		}

		alert.accept(); // click on okay
		// alert.dismiss(); // to click on cancel button

	}
}
