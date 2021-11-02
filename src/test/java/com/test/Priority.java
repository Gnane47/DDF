package com.test;

import org.testng.annotations.Test;

public class Priority 
{
	@Test (priority = 2)
	private void hoodie() 
	{
		System.out.println("Hoodie");
	}
	@Test(priority = -2)
	private void shirts() 
	{
		System.out.println("Shirts");
	}
	@Test (priority = 3)
	private void jeans() 
	{
		System.out.println("jeans");
	}
	@Test(priority = -1)
	private void pant() 
	{
		System.out.println("pants");
	}
	@Test (priority = 0)
	private void belt() 
	{
		System.out.println("Belt");
	}
	@Test (priority = 1)
	private void shoes()
	{
		System.out.println("shoes");
	}
	@Test (priority = 4)
	private void sneakers() 
	{
		System.out.println("sneakers");
	}
}
