package com.orgtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MedPlusSample extends MintSample{
	@Test(dependsOnMethods = "mint")
	public void medplus()
	{
		System.setProperty("webdriver.edge.driver", ".//drivers//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
