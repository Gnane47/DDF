package org.adactin;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SDP_adactin extends Base_Class_adactin
{	
	public static WebDriver driver = Base_Class_adactin.getdriver("firefox");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@BeforeMethod
	private void login() throws IOException 
	{
//		String url = File_Reader.getInstanceFRM().getInstanceCR().geturl(); geturl(url); System.out.println("URL is : " +url);
		String url = specific_data("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\details_adactin.xlsx", 1, 0);
		geturl(url); System.out.println(url);
		
//		String username = File_Reader.getInstanceFRM().getInstanceCR().getusername();
		String username = specific_data("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\details_adactin.xlsx", 1, 1);
		input(pom.getInstancelp().getUsername(), username); System.out.println("username :" + username);
		
//		String password = File_Reader.getInstanceFRM().getInstanceCR().getpassword();
		String password = specific_data("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\details_adactin.xlsx", 1, 2);
		input(pom.getInstancelp().getPassword(), password); System.out.println("password : " +password);
		
		click(pom.getInstancelp().getLogin());
	}
	
	@Test
	private void search_hotel() throws Exception 
	{
		dropdown(pom.getInstancesh().getLocation(), "byindex", "2");
		dropdown(pom.getInstancesh().getHotels(), "byvisibletext", "Hotel Creek");
		dropdown(pom.getInstancesh().getRooms(), "byvalue", "Deluxe");
		dropdown(pom.getInstancesh().getRoom_count(), "byvisibletext", "2 - Two");
		clear(pom.getInstancesh().getIn()); 
		input(pom.getInstancesh().getIn(), "23/10/2021");
		clear(pom.getInstancesh().getOut());
		input(pom.getInstancesh().getOut(), "25/10/2021");
		dropdown(pom.getInstancesh().getAdult_count(), "byvalue", "3");
		dropdown(pom.getInstancesh().getChild_count(), "byindex", "2"); thread(600);
		click(pom.getInstancesh().getSubmit());
		
		click(pom.getInstances().getRadio()); click(pom.getInstances().getGo());
		
		input(pom.getInstancep().getFirstname(), "Gnane");
		input(pom.getInstancep().getLastname(), "NS");
		input(pom.getInstancep().getAddress(), "Chennai");
		
//		input(pom.getInstancep().getCardnum(), "1234567812345678");
		
//		String cardnum = File_Reader.getInstanceFRM().getInstanceCR().getcardnum();
		String cardnum = specific_data("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\details_adactin.xlsx", 1, 3);
		input(pom.getInstancep().getCardnum(), cardnum); System.out.println("cardnum is : " +cardnum);
		
//		dropdown(pom.getInstancep().getCardtype(), "byvalue", "AMEX");
//		dropdown(pom.getInstancep().getMonth(), "byvalue", "4");
//		dropdown(pom.getInstancep().getYear(), "byvalue", "2021");
		
//		input(pom.getInstancep().getCvv(), "123");
		
//		String cardtype = File_Reader.getInstanceFRM().getInstanceCR().getcardtype();
		String cardtype = specific_data("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\details_adactin.xlsx", 1, 4);
		input(pom.getInstancep().getCardtype(), cardtype); System.out.println("cardtype : " +cardtype);
		
//		String month = File_Reader.getInstanceFRM().getInstanceCR().getmonth();
		String month = specific_data("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\details_adactin.xlsx", 1, 5);
		input(pom.getInstancep().getMonth(), month); System.out.println("month : " +month);
		
//		String year = File_Reader.getInstanceFRM().getInstanceCR().getyear();
		String year = specific_data("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\details_adactin.xlsx", 1, 6);
		input(pom.getInstancep().getYear(), year); System.out.println("year : " +year);
		
//		String cvv = File_Reader.getInstanceFRM().getInstanceCR().getcvv();
		String cvv = specific_data("C:\\Users\\gnani\\eclipse-workspace\\Maven_Tasks\\Excel\\details_adactin.xlsx", 1, 7);
		input(pom.getInstancep().getCvv(), cvv); System.out.println("cvv is :" + cvv);
		
		click(pom.getInstancep().getBook()); implicit(20);
		click(pom.getInstancep().getIte()); scroll(pom.getInstancep().getLogout()) ;scrsh("2"); thread(1500);
		click(pom.getInstancep().getLogout()); thread(800);
		click(pom.getInstancep().getAgain()); 
	}
	@AfterMethod
	private void out() 
	{
		close();
	}
}
