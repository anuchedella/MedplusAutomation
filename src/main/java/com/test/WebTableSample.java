package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		driver.getTitle();
		WebElement table = driver.findElement(By.xpath("//table[@id='webtable']"));
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		for(int i=2;i<rows.size();i++)
		{
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			//System.out.println(cells.size());
			for(int j=0;j<cells.size();j++)
			{
				String name= cells.get(j).getText();
				if(name.equalsIgnoreCase("Google"))
				{
					System.out.println(cells.get(2).getText());
				}
			}
		}
		//List<WebElement> columns = driver.findElements(By.tagName("td"));
		//System.out.println(columns.size());
	}

}
