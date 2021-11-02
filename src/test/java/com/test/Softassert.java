package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert 
{
	@Test
	private void check() 
	{
		String expected = "Gnane";
		String actual = "NS";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected);
		System.out.println("output");
	}
}
