package com.orgtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSample {
	
	@Test
	public void sample()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		WebElement signin = driver.findElement(By.xpath("//*[@id='nav-signin-tooltip']/a/span"));
		Actions a = new Actions(driver);
		a.moveToElement(signin).click().build().perform();
		WebElement email =driver.findElement(By.xpath("//input[@name='email']"));
		WebElement button = driver.findElement(By.xpath("//input[@id='continue']"));
		a.sendKeys(email,"radhachedella@gmail.com").build().perform();
		a.moveToElement(button).click().build().perform();
		
		
	}

}
