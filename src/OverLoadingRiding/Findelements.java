package OverLoadingRiding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Findelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayank\\eclipse-workspace\\Practice\\chromedriver.exe");
		
		Map<String,Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options =new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		for(String winHandle:driver.getWindowHandles()) {
			
			
			 driver.switchTo().window(winHandle);
		
			System.out.println("Window Switch");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='mc-closeModal']")).click();
		}
	
	
		List <WebElement> links =driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		
		for(int i=1;i<=links.size();i=+1) {
			
			System.out.println(links.get(i).getText()); 
			
			
		}
		Thread.sleep(2000);
		
	driver.close();
	}

}
