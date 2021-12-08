package com.Learn_Build;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Runner extends Base_Class {

	public static WebDriver driver;// --null

	public static void main(String[] args) throws InterruptedException {
		
		getbrowser("chrome");
		
		getlink("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("(//a[@class='login'])"));

		clickonele(signin);

		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		inputvalue(email, "kumaran@gmail.com");

		WebElement pswd = driver.findElement(By.xpath("(//input[@type='password'])"));
		inputvalue(pswd, "jandhi10");

		WebElement btn = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));

		clickonele(btn);

		driver.close();

	}

}
