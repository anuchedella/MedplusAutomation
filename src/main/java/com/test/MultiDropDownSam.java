package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDownSam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement multiDropDown = driver.findElement(By.xpath("//select[@id='second']"));
		Select s1 = new Select(multiDropDown);
		s1.selectByValue("pizza");
		s1.selectByVisibleText("Burger");
		s1.selectByIndex(1);
		//s1.selectByValue("")
		s1.deselectByValue("burger");
		
		
		

	}

}
