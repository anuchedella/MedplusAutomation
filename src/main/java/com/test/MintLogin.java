package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MintLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mint.intuit.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ius-identifier")).sendKeys("anu123");
		driver.findElement(By.id("ius-sign-in-submit-btn-text")).click();
		Thread.sleep(3000);
		//driver.findElement(By.className("ius-text-input.ius-input-error")).sendKeys("1234567897");
		driver.findElement(By.id("ius-sign-in-mfa-password-collection-current-password")).sendKeys("12345876876");
		driver.findElement(By.id("ius-sign-in-mfa-password-collection-continue-btn")).click();
	}

}
