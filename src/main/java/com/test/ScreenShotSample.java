package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotSample {
	int i = 0;
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		ScreenShotSample login = new ScreenShotSample();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		login.snap();
		/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(".//images//pic"+".png");
		FileUtils.copyFile(src, dest);*/
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		login.snap();
		driver.findElement(By.className("button")).click();
		login.snap();
		//String screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		//System.out.println(screenshotAs);
	}
	public void snap() throws IOException
	{
		//Random r = new Random();
		//if(r.nextInt()!=0)
	//{
			i = i+1;
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File(".//images//pic"+i+".png");
			FileUtils.copyFile(src, dest);
		//}
	}

}
