package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_testNG 
{
	@BeforeMethod
	private void login() 
	{
		System.out.println("Sign in");
	}
	@Test (enabled = false)
	private void hoodie() 
	{
		System.out.println("Hoodie");
	}
	@Test
	private void shirts() 
	{
		System.out.println("Shirts");
	}
	@Test
	private void jeans() 
	{
		System.out.println("jeans");
	}
	@Ignore
	@Test
	private void pant() 
	{
		System.out.println("pants");
	}
	@Test
	private void belt() 
	{
		System.out.println("Belt");
	}
	@Test
	private void shoes()
	{
		System.out.println("shoes");
	}
	@AfterMethod
	private void logout() 
	{
		System.out.println("sign out");
	}
}
