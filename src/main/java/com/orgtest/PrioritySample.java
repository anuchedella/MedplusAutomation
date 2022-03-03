package com.orgtest;

import org.testng.annotations.Test;

public class PrioritySample {
	@Test(priority=1)
	public void orange()
	{
		System.out.println("orange");
	}
	@Test(priority=2)
	public void banana()
	{
		System.out.println("yellow");
	}
	@Test(priority = 0)
	public void grapes()
	{
		System.out.println("black");
	}

}
