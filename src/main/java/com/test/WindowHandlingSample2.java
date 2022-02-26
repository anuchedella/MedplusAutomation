package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingSample2 {
	public static String parent,linkedin,facebook,twitter;
	public static Set<String> all;
	public static Iterator<String> it;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		all = driver.getWindowHandles();
		it = all.iterator();
		while(it.hasNext())
		{
			linkedin = it.next();
			if(!parent.equals(linkedin))
			{
				driver.switchTo().window(linkedin);
			}
			
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anu@gmail.com");
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		all = driver.getWindowHandles();
		it = all.iterator();
		while(it.hasNext())
		{
			facebook=it.next();
			if(!parent.equals(facebook))
			{
				driver.switchTo().window(facebook);
			}
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(linkedin);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.switchTo().window(facebook);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("facebookuser");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("anu");
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		
		
		

	}

}
