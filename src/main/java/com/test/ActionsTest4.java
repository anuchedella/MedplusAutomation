package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		Thread.sleep(2000);
		WebElement item1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		Actions a = new Actions(driver);
		//a.moveToElement(item1).keyDown(Keys.CONTROL).moveToElement(item2).moveToElement(item3).moveToElement(item4).build().perform();
		a.click(item1).keyDown(Keys.CONTROL).click(item2).click(item3).click(item4).build().perform();
		
	}

}
