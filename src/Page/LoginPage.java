package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath="//input[@type='text']")
	public WebElement username;
	
	@FindBy (xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy (xpath="//input[@name='btnLogin']")
	public WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	
	public void enterUsername(String Usn)
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("mngr555392");
		
	}
	
	public void enterPassword(String psw)
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("hupEjum");
	}
	
	public void clickLogin()
	{
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		loginBtn.click();
	}
	
	
	
	
	
	
	
}
