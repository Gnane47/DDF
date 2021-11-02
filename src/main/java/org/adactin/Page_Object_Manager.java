package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager
{
	public WebDriver driver;
	private Login_Page lp;
	private Search_Hotel sh;
	private Select_Hotel s;
	private Payment p;
	
	public Page_Object_Manager(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public Login_Page getInstancelp()
	{
		lp = new Login_Page(driver);
		return lp;
	}
	public Search_Hotel getInstancesh()
	{
		sh = new Search_Hotel(driver);
		return sh;
	}
	public Select_Hotel getInstances() 
	{
		s = new Select_Hotel(driver);
		return s;
	}
	public Payment getInstancep()
	{
		p = new Payment(driver);
		return p;
	}
}
