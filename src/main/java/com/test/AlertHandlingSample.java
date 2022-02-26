package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		//normal alert
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
		//confirmation alert
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(2000);
		a.accept();
		
		//prompt alert
		
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		//Thread.sleep(2000);
		a.sendKeys("anuradha");
		Thread.sleep(2000);
		a.accept();
	}

}
