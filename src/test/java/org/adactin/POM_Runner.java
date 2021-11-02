package org.adactin;

import org.openqa.selenium.WebDriver;

public class POM_Runner extends Base_Class_adactin
{
	public static WebDriver driver = Base_Class_adactin.getdriver("firefox");
	public static Login_Page lp = new Login_Page(driver);
	public static Search_Hotel sh = new Search_Hotel(driver);
	public static Select_Hotel s = new Select_Hotel(driver);
	public static Payment pay = new Payment(driver);
	
	public static void main(String[] args) throws Exception 
	{
		geturl("http://adactinhotelapp.com/index.php");
		input(lp.getUsername(), "Gnane4797");
		input(lp.getPassword(), "J5Q6KE");
		click(lp.getLogin());
		dropdown(sh.getLocation(), "byindex", "2"); 
		dropdown(sh.getHotels(), "byvisibletext", "Hotel Creek");
		dropdown(sh.getRooms(), "byvalue" ,"Deluxe");
		dropdown(sh.getRoom_count(), "byvisibletext", "2 - Two");
		clear(sh.getIn()); input(sh.getIn(), "17/10/2021"); thread(500);
		clear(sh.getOut()); input(sh.getOut(), "19/10/2021"); thread(500);
		dropdown(sh.getAdult_count(), "byvalue", "3");
		dropdown(sh.getChild_count(), "byindex", "2"); thread(600);
		click(sh.getSubmit());
		click(s.getRadio()); click(s.getGo());
		input(pay.getFirstname(), "Gnane");
		input(pay.getLastname(), "NS");
		input(pay.getAddress(), "Chennai");
		input(pay.getCardnum(), "1234567812345678");
		dropdown(pay.getCardtype(), "byvalue", "AMEX"); dropdown(pay.getMonth(), "byvalue", "4");
		dropdown(pay.getYear(), "byvalue", "2021"); input(pay.getCvv(), "123");
		click(pay.getBook()); 
		implicit(20); click(pay.getIte()); thread(1500); 
		click(pay.getLogout()); thread(800); click(pay.getAgain());
	}
}
