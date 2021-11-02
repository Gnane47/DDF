package com.test;

import org.testng.annotations.Test;

public class TimeOut
{
	@Test(timeOut = 3000)
	private void open() throws Throwable 
	{
		Thread.sleep(1000);
		System.out.println("open url");
		Thread.sleep(1500);
		System.out.println("homepage");
	}
}
