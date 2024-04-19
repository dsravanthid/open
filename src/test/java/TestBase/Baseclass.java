package TestBase;

import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	WebDriver driver;
	public Logger logger;
	public Properties p;
	
	//@Parameters({"os","browser"})

	//(@Optional("os")String os,@Optional("browser")String browser
	
	@BeforeClass
	public void setup() 
	{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			//driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://demo.opencart.com/");
		    driver.manage().window().maximize();
			//return;
		/*else   
		if(browser.equalsIgnoreCase("edge"))
		     {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com/");
			//driver.get("https://demo.opencart.com/");
			//driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
			driver.manage().window().maximize();
			//return ;
		
		}*/
			
		}
		

	/*@AfterClass
	public void TearDown() {
		driver.close();

	}*/

	public String RandomString() {
		String str = RandomStringUtils.randomAlphabetic(5);
		return str;
	}

	public String RandomNumber() {
		String str = RandomStringUtils.randomNumeric(5);
		return str;
	}

	public String RandomAlphanumeric() {
		String str = RandomStringUtils.randomAlphabetic(3);
		String num = RandomStringUtils.randomNumeric(3);
		return (str + "@" + num);
	}

}
