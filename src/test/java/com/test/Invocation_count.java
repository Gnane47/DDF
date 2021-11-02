package com.test;

import org.testng.annotations.Test;

public class Invocation_count 
{
	@Test (priority = -2)
	private void Dress() 
	{
		System.out.println("Dresses");
	}
	@Test (priority = -1)
	private void Mens() 
	{
		System.out.println("Mens");
	}
	@Test(invocationCount = 3 , priority = 0)
	private void tshirt_add() 
	{
		System.out.println("add");
	}
	@Test (priority = 1)
	private void checkout() 
	{
		System.out.println("checkout");
	}
}
