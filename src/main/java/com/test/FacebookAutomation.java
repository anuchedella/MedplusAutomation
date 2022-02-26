package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("anuradha");
		driver.findElement(By.xpath("//input[@id='pass' and @name='pass']")).sendKeys("anu123");
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email or mobile number']")).sendKeys("12345");
		
	}

}
