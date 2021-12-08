package com.Learn_Build;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public static WebDriver driver;//-->null
	
	public static WebDriver getbrowser(String name) throws InterruptedException {

		if (name.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//driver//chromedriver.exe");	
			
			 driver = new ChromeDriver();
		}
		else if (name.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("//driver//firefox.exe"));
			
			 driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		return driver;
	}
	
	public static void getlink(String url) {
	
		getlink(url);
		
	}
	public static void clickonele(WebElement element) {

		element.click();
		
	}
	public static void getclose() {
		
		driver.close();
	}
	public static void inputvalue(WebElement element , String value) {
		
		element.sendKeys(value);
		
	}
		

}
