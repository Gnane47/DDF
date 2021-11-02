package com.test;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Expected_exception 
{
	@Test(expectedExceptions = FileNotFoundException.class)
	private void calc() 
	{
		int a = 10;
		System.out.println(a/0);
		System.out.println("print");
	}
}
