package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment 
{
	public WebDriver driver;
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	@FindBy (xpath="//input[@name='last_name']")
	private WebElement lastname;
	@FindBy (xpath="//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement cardnum;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement month;
	@FindBy (xpath="//select[@name='cc_exp_year']")
	private WebElement year;
	@FindBy (xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy (xpath="//input[@name='book_now']")
	private WebElement book;
	@FindBy (xpath="//input[@id='my_itinerary']")
	private WebElement ite;
	@FindBy (xpath="//input[@id='logout']")
	private WebElement logout;
	@FindBy (xpath="//a[text()='Click here to login again']")
	private WebElement again; 
	
	public Payment(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstname()
	{
		return firstname;
	}
	public WebElement getLastname()
	{
		return lastname;
	}
	public WebElement getAddress()
	{
		return address;
	}
	public WebElement getCardnum()
	{
		return cardnum;
	}
	public WebElement getCardtype()
	{
		return cardtype;
	}
	public WebElement getMonth()
	{
		return month;
	}
	public WebElement getYear()
	{
		return year;
	}
	public WebElement getCvv()
	{
		return cvv;
	}
	public WebElement getBook()
	{
		return book;
	}
	public WebElement getIte()
	{
		return ite;
	}
	public WebElement getLogout()
	{
		return logout;
	}
	public WebElement getAgain()
	{
		return again;
	}
}
