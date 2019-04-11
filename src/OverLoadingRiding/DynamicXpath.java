package OverLoadingRiding;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	// WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
		
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayank\\eclipse-workspace\\Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://phptravels.com/");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("LOGIN")).click();
		//Thread.sleep(3000);
		driver 	.close();
	}
}
