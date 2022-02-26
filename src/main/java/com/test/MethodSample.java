package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		//WebElement choosefile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		//System.out.println(choosefile.isDisplayed());
		
		WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
		System.out.println(radiobutton.isDisplayed());
		System.out.println(radiobutton.isEnabled());
		System.out.println(radiobutton.isSelected());
		
		//WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]"));
		//System.out.println(checkbox.isSelected());
		
		
	}

}
