package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MintLoginApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mint.intuit.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'ius-identifier')]")).sendKeys("anu123");
		driver.findElement(By.xpath("//span[@id[starts-with(.,'ius-sign-in-submit-btn-text')]]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'ius-sign-in-mfa-password-collection-current-password')]")).sendKeys("1134567828");
		driver.findElement(By.xpath("//input[contains(@class,'ius-btn ius-btn-submit ius-btn-prominent')]")).click();
		
		
		
		
	}

}
