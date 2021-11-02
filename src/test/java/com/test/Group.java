package com.test;

import org.testng.annotations.Test;

public class Group 
{
	@Test (groups = "mobiles")
	private void samsung() 
	{
		System.out.println("samsung s21 ultra");
	}
	@Test (groups = "mobiles")
	private void oppo() 
	{
		System.out.println("Find x3 pro");
	}
	@Test (groups = "mobiles")
	private void vivo() 
	{
		System.out.println("x70 pro plus");
	}

	@Test (groups = "Camera")
	private void canon() 
	{
		System.out.println("Canon EOS R5");
	}
	@Test (groups = "Camera")
	private void nikon() 
	{
		System.out.println("Nikon D780");
	}
	@Test (groups = "Camera")
	private void sony() 
	{
		System.out.println("Sony alpha");
	}
	
	@Test (groups = "Laptops")
	private void Lenevo() 
	{
		System.out.println("Thinkpad");
	}
	@Test (groups = "Laptops")
	private void dell() 
	{
		System.out.println("alienware");
	}
	@Test (groups = "Laptops")
	private void Apple() 
	{
		System.out.println("Macbook pro");
	}
}
