package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Actions a = new Actions(driver);
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		a.moveToElement(rightclick).contextClick().build().perform();
		a.doubleClick(doubleclick).click().build().perform();
		Alert alert = driver.switchTo().alert();
		alert.accept();
				
	}

}
