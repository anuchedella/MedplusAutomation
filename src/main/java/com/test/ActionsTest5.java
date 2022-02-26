package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//drag by using co-ordinates
		driver.get("https://jqueryui.com/draggable/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		Thread.sleep(1000);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(drag, 100, 100).build().perform();
		
		
		//drag and drop
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		Thread.sleep(1000);
		WebElement drag1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(drag1, drop).build().perform();
		
		//Resizable
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		a.clickAndHold(element).moveByOffset(150,100).release().build().perform();
		
		//sortable
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		Thread.sleep(1000);
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='ui-icon ui-icon-arrowthick-2-n-s']"));
		for (int i = 0; i <= 6; i++) {
			a.dragAndDrop(elements.get(0), elements.get(i)).build().perform();
		}
		
	}

}
