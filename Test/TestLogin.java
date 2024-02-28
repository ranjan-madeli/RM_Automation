package Test;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Page.LoginPage;

public class TestLogin extends BaseTest {

	
	@Test
	public void testLogin()  {
		
		LoginPage lP=new LoginPage(driver);
		
		lP.enterUsername("mngr555392");
		lP.enterPassword("hupEjum");
		lP.clickLogin();
	}
	
	
	
	
	
	
	
	
}
