package Generic;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void launchApplication()
	{
		 driver=new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/V4/");
	}
	
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
			
	}
	
	
	
	
	
	
	
}
