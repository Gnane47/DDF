package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Test 
{
	@Test
	@Parameters({"username", "password"})
	private void details(String username, String password) 
	{
		System.out.println("Username : " +username);
		System.out.println("Password : " +password);
	}
}
