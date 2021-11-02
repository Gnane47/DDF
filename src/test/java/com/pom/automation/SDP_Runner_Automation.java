package com.pom.automation;

import java.io.IOException;
import javax.swing.JSeparator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SDP_Runner_Automation extends Base_Class
{
	public static WebDriver driver = Base_Class.getdriver("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@BeforeMethod
	private void login() throws IOException 
	{
//		geturl("http://automationpractice.com/index.php"); 
//		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl(); geturl(url); 
//		System.out.println(url);
		String url = specific_data("F:\\Course\\1. UserData\\details_automation_practice.xlsx", 1, 0);
		geturl(url);
		click(pom.getInstancemp().getSignin());
		
//		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		String username = specific_data("F:\\Course\\1. UserData\\details_automation_practice.xlsx", 1, 1);
		login_details(pom.getInstancelp().getUsername(), username); System.out.println(username);
		
//		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpassword();
		String password = specific_data("F:\\Course\\1. UserData\\details_automation_practice.xlsx", 1, 2);
		login_details(pom.getInstancelp().getPassword(), password); System.out.println(password);
		click(pom.getInstancelp().getlogin());
	}
	@Test
	private void purchase_1() throws Exception 
	{
		click(pom.getInstanceds().getDresses());
		click(pom.getInstanceds().getEvening()); 
		click(pom.getInstancepd().getPrinted()); thread(2000);
		framebyIndex(0); 
		for(int i=0; i<=8; i++)
		{
			click(pom.getInstancepd().getQuantity());
		}
		dropdown(pom.getInstancepd().getSize(), "byindex", "1");
		click(pom.getInstancepd().getColor());
		click(pom.getInstancepd().getAddto()); 
		frameout(); thread(2000);
		js(pom.getInstancepd().getProceed());
		click(pom.getInstancesum().getCheckout());
		click(pom.getInstanceadd().getAddress());
		click(pom.getInstancesh().getCheckbox());
		click(pom.getInstancesh().getProceed());
		click(pom.getInstancep().getPay());
		click(pom.getInstancepc().getPay_con());
		click(pom.getInstancepc().getLogo());
		
		click(pom.getInstancets().getTshirts()); implicit(10);
		click(pom.getInstancetsp().getTshirt()); 
		js(pom.getInstancetsp().getQuick()); thread(2000);
		framebyIndex(0); 
		for(int i=0; i<=8 ; i++)
		{
			click(pom.getInstancetsp().getQuantity());
		}
		dropdown(pom.getInstancetsp().getSize(), "byindex", "2");
		click(pom.getInstancetsp().getColor());
		click(pom.getInstancetsp().getAddto());
		frameout(); thread(2000);
		js(pom.getInstancetsp().getProceed());
		click(pom.getInstancesum2().getCheckout());
		click(pom.getInstanceadd2().getAddress());
		click(pom.getInstancesh2().getCheckbox());
		click(pom.getInstancesh2().getProceed());
		click(pom.getInstancep2().getPay());
		click(pom.getInstancepc2().getPay_con());
		scroll(pom.getInstancepc2().getBackto()); thread(3000);
		click(pom.getInstancepc2().getOrders());
		scroll(pom.getInstancepc2().getTracking());
	}
	@AfterMethod
	private void out()
	{
		close();
	}
	
}
