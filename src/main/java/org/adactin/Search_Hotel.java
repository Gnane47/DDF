package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel 
{
	public WebDriver driver;
	@FindBy (xpath="//select[@id='location']")
	private WebElement location;
	@FindBy (xpath="//select[@id='hotels']")
	private WebElement hotels;
	@FindBy (xpath="//select[@id='room_type']")
	private WebElement rooms;
	@FindBy (xpath="//select[@id='room_nos']")
	private WebElement room_count;
	@FindBy (xpath="//input[@name='datepick_in']")
	private WebElement in;
	@FindBy (xpath="//input[@name='datepick_out']")
	private WebElement out;
	@FindBy (xpath="//select[@id='adult_room']")
	private WebElement adult_count;
	@FindBy (xpath="//select[@id='child_room']")
	private WebElement child_count;
	@FindBy (xpath="//input[@type='submit']")
	private WebElement submit;
	
	public Search_Hotel(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation()
	{
		return location;
	}
	public WebElement getHotels()
	{
		return hotels;
	}
	public WebElement getRooms()
	{
		return rooms;
	}
	public WebElement getRoom_count() 
	{
		return room_count;
	}
	public WebElement getIn()
	{
		return in;
	}
	public WebElement getOut()
	{
		return out;
	}
	public WebElement getAdult_count()
	{
		return adult_count;
	}
	public WebElement getChild_count()
	{
		return child_count;
	}
	public WebElement getSubmit()
	{
		return submit;
	}
}
