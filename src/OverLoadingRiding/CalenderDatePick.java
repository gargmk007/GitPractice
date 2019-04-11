package OverLoadingRiding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDatePick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayank\\eclipse-workspace\\Practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/");
		Thread.sleep(1000);
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		
		dateBox.sendKeys("19052001");
		dateBox.sendKeys(Keys.TAB);
		//dateBox.sendKeys("0245PM");
		
		//driver.findElement(By.linkText("LOGIN")).click();
		//Thread.sleep(3000);
		//driver 	.close();
	}


	}


