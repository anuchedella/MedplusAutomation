package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement button = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		Actions a = new Actions(driver);
		//a.moveToElement(username).sendKeys("Admin").build().perform();
		a.sendKeys(username, "Admin").build().perform();
		//a.moveToElement(pwd).sendKeys("admin123").build().perform();
		a.sendKeys(pwd, "admin123").build().perform();
		a.moveToElement(button).click().build().perform();
		WebElement time = driver.findElement(By.xpath("//b[text()='Time']"));
		WebElement projects = driver.findElement(By.xpath("//a[text()='Project Info']"));
		WebElement project = driver.findElement(By.xpath("//a[text()='Projects']"));
		a.moveToElement(time).moveToElement(projects).moveToElement(project).click().build().perform();
	}

}
