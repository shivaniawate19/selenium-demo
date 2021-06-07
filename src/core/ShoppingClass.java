package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingClass {

	public static void main(String[] args) {
		String url = "http://automationpractice.com/index.php";

		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
	
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.quit();
	}

}
