package com.orgtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleTest {
	@BeforeSuite
	public void one()
	{
		System.out.println("Hello i am one");
	}
	
	@AfterSuite
	public void two()
	{
		System.out.println("Hello i am two");
	}
	@BeforeTest
	public void three()
	{
		System.out.println("Hello i am three");
	}
	@AfterTest
	public void four()
	{
		System.out.println("Hello i am four");
	}
	@BeforeClass
	public void five()
	{
		System.out.println("Hello i am five");
	}
	@AfterClass
	public void six()
	{
		System.out.println("Hello i am six");
	}
	@BeforeMethod
	public void seven()
	{
		System.out.println("Hello i am seven");
	}
	@AfterMethod
	public void eight()
	{
		System.out.println("Hello i am eight");
	}
	@Test
	public void nine()
	{
		System.out.println("Hello i am nine");
	}
	
	

}
