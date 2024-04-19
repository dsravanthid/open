package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	public WebDriver driver;
	
public AccountRegistrationPage(WebDriver driver)
{
	super(driver);
}



@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtFirstName;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtLastName;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtEmail;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;

@FindBy(xpath="//input[@type='checkbox']")
WebElement checkpolicy;

@FindBy(xpath="//button[@type='submit']")
WebElement btnSubmit;

public void setFirstName(String Fname)
{
	txtFirstName.sendKeys(Fname);
}
public void setLastName(String Lname)
{
	txtLastName.sendKeys(Lname);
}
public void setEmail(String Email)
{
	txtEmail.sendKeys(Email);
}
public void setpassword(String pswd)
{
	txtPassword.sendKeys(pswd);
}

public void setCheckpolicy()
{
	checkpolicy.click();
}

public void ClickContinue()
{
	btnSubmit.click();
}
}
