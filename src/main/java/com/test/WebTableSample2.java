package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		driver.getTitle();
		WebElement table1 = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> totalrows =driver.findElements(By.tagName("tr"));
		System.out.println(totalrows.size());
		
		for(int i=2;i<totalrows.size();i++)
		{
			List<WebElement> cellsdata =totalrows.get(i).findElements(By.tagName("td"));
			System.out.println(cellsdata.size());
			/*for(int j=0;j<cellsdata.size();j++)
			{
				String name = cellsdata.get(j).getText();
				
				
			}*/
		}
		
	}

}
