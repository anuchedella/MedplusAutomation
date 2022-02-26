package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {
	public static String facebook,twitter,parent,explorethebenifits;
	public static Set<String> all;
	public static Iterator<String> it;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("anu");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("chedella");
		driver.findElement(By.xpath("(//a[@class='pEight'])[3]")).click();
		all = driver.getWindowHandles();
		it = all.iterator();
		while(it.hasNext())
		{
			explorethebenifits = it.next();
			if(!parent.equals(explorethebenifits))
			{
				driver.switchTo().window(explorethebenifits);
			}
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//img[@alt='Facebook']")).click();
		all = driver.getWindowHandles();
		it = all.iterator();
		while(it.hasNext())
		{
			facebook = it.next();
			if(!parent.equals(facebook))
			{
				driver.switchTo().window(facebook);
			}
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(explorethebenifits);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//a[@title='Twitter']"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		//Thread.sleep(500);
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,500)");
		element.click();
		//driver.findElement(By.xpath("//img[starts-with(@alt,'Twitter')]")).click();
		all = driver.getWindowHandles();
		it = all.iterator();
		while(it.hasNext())
		{
			twitter = it.next();
			if(!parent.equals(twitter))
			{
				driver.switchTo().window(twitter);
			}
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
	}

}
