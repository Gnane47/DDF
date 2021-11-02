package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel 
{
	public WebDriver driver;
	@FindBy (xpath="//input[@id='radiobutton_0']")
	private WebElement radio;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement go;
	
	public Select_Hotel(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}
	public WebElement getRadio()
	{
		return radio;
	}
	public WebElement getGo()
	{
		return go;
	}
}
