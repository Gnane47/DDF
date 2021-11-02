package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{
	@Test(dataProvider = "data")
	private void details(String username, String password) 
	{
		System.out.println("Username : " +username);
		System.out.println("Password : " +password);
	}
	@DataProvider
	private Object[][] data() 
	{
		return new Object [][] 
		{
			{"gnane" , "1234"}, {"Gnanesh", "1234"}
		};
	}
}
