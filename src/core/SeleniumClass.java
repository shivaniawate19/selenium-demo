package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		
		String currentTitle = "Facebook";

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("abcde");
		driver.findElement(By.name("email")).sendKeys("12345");
		
		String Exptitle =driver.getTitle();
		
		if(Exptitle.equals(currentTitle)) {
			System.out.println("Test Pass");
		}else
		{
			System.out.println("Test Failed");
		}
		
		driver.quit();
		
			

	}

}
