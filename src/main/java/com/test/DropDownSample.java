package com.test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		
		// switch to model popup dialog
		
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("anuradha");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("chedella");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("anu123");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("12345");
		
		// dropdown
		
		WebElement birthDayMonthDropDown = driver.findElement(By.id("month"));
		Select selectForBirthDayMonth = new Select(birthDayMonthDropDown);
		selectForBirthDayMonth.selectByIndex(10);
		List<WebElement> list1 = selectForBirthDayMonth.getOptions();
		Iterator<WebElement> iterator = list1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().getText());
		}
		
		
		WebElement birthDayDayDropDown = driver.findElement(By.id("day"));
		Select selectForBirthDayDay = new Select(birthDayDayDropDown);
		selectForBirthDayDay.selectByValue("7"); 
		/*List<WebElement> opt = selectForBirthDayDay.getOptions();
		System.out.println(opt.size());
		Iterator<WebElement> it = opt.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next().getText());	
		}
		
		for(WebElement each:opt)
		{
		System.out.println(each.getText());	
		}
		*/

		
		WebElement birthDayYearDropDown = driver.findElement(By.id("year"));
		Select selectForBirthDayYear = new Select(birthDayYearDropDown);
		selectForBirthDayYear.selectByVisibleText("1988");
		/*List<WebElement> list = selectForBirthDayYear.getOptions();
		Iterator<WebElement> it1 = list.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next().getText());
		}*/
		
		// radiobuttons
				
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		
		
		
		
		
	}

}
