package part_1_selenium_Training;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Software\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		
	List <WebElement> str = driver.findElements(By.tagName("a"));
	
	//size of links
	System.out.println(str.size());
	
	//display name of links
	for(int i=0; i<str.size();i++) {
		String link =str.get(i).getText();
		System.out.println(link);
		
	}
	
		
	

	}

}
