package com.orgtest;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(dependsOnMethods = "elephant")
	public void lion()
	{
		System.out.println("Hello Lion");
	}
	@Test
	public void tiger()
	{
		System.out.println("Hello Tiger");
	}
	@Test(dependsOnMethods = "tiger")
	public void elephant()
	{
		System.out.println("Hello Elephant");
	}

}
