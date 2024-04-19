package Testcases;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pageobjects.AccountRegistrationPage;
import Pageobjects.HomePage;
import TestBase.Baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_AcoountRegistration extends Baseclass {

	public WebDriver driver;
	
    @Test
	public void Verify_Account_Registration() throws InterruptedException {
			try {
	     HomePage hp = new HomePage(driver);
	     //Thread.sleep(2000);
         hp.ClickMyaccount();
		hp.ClickRegister();
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		//regpage.setFirstName("adsjdsdjs");
		regpage.setFirstName(RandomString().toUpperCase());
		regpage.setLastName(RandomString().toUpperCase());
		regpage.setEmail(RandomString() + "gmail.com");
		String password= RandomAlphanumeric();
		regpage.setpassword(password);
		regpage.setCheckpolicy();
		regpage.ClickContinue();
			}
		catch(Exception e)
			{
			e.printStackTrace();
			}
	}

}
