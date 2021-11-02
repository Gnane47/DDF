package com.test;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@BeforeSuite
	private void setproperty() 
	{
		System.out.println("set property");
	}
	@BeforeTest
	private void type() 
	{
		System.out.println("type");
	}
	@BeforeTest
	private void browser() 
	{
		System.out.println("browser launch");
	}
	@BeforeClass
	private void url() 
	{
		System.out.println("url");
	}
	@BeforeMethod
	private void login() 
	{
		System.out.println("Login");
	}
	@Test
	private void laptop() 
	{
		System.out.println("Macbook pro");
	}
	@Test
	private void mobile() 
	{
		System.out.println("S21 Ultra");
	}
	@Test
	private void earphones() 
	{
		System.out.println("Sony WH1000");
	}
	@AfterMethod
	private void logout() 
	{
		System.out.println("logout");
	}
	@AfterClass
	private void homepage() 
	{
		System.out.println("Home Page");
	}
	@AfterTest
	private void close() 
	{
		System.out.println("close");
	}
	@AfterSuite
	private void history() 
	{
		System.out.println("delete");
	}
}
