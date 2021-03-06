package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment2 
{
	public static WebDriver driver;
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement pay;
	
	public Payment2(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getPay()
	{
		return pay;
	}
}
