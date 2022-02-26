package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutorSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//hit the url using javascript executor
		
	      String s = "https://opensource-demo.orangehrmlive.com/";
	      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //  String scrpt = "window.location = \'"+s+"\'";
	      // String scrpt = "window.location = 'https://opensource-demo.orangehrmlive.com'";
	      js.executeScript("window.location = 'https://opensource-demo.orangehrmlive.com'");
	      // js.executeScript("alert('hello anu')");
	      System.out.println("Page navigated to:" + driver.getTitle());
	     // driver.close();
	      
	      //how to scroll upto webelement
	      // WebElement facebook = driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[2]"));
	      // js.executeScript("arguments[0].scrollIntoView();", facebook);
	      
	      //how to scroll window upto down
	      //js.executeScript("window.scrollTo(0, 500)");
	      
	      // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //Thread.sleep(5000);
	      //how to scroll window down to top
	      //js.executeScript("window.scrollTo(0, 0)");
	      
	     //how to scroll vertically down
	     //js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
	      
	      //how to scroll vertically up
	     //js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	     
	     //how to scroll horizontally to right
	     js.executeScript("window.scrollBy(500,0)");
	     Thread.sleep(5000);
	     //how to scroll horizontally to left
	     js.executeScript("window.scrollBy(0,0)");
	     
	      
	      
	      
	}

}
