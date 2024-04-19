package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//span[contains(text(),My Account]")
	WebElement Linkmyaccount;
	
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement LinkRegister;
	
	
	public void ClickMyaccount()
	{
	Linkmyaccount.click();
	}
		
	
	public void ClickRegister()
	{
		LinkRegister.click();
	}
	
}

