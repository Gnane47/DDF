package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsset 
{
	@Test
	private void check() 
	{
		String expected = "Gnane";
		String actual = "NS";
		Assert.assertNotNull(expected);
		System.out.println("output");
	}
}
