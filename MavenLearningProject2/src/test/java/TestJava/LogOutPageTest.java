package TestJava;

import org.testng.annotations.Test;

import MainJava.BaseClass;
import MainJava.LogOutPage;

public class LogOutPageTest extends BaseTest {
	
	@Test
	
	public void verifyLogoutpage(){
		LogOutPage LogP = new LogOutPage(driver);
		LogP.LogoutMethod();
	}

}
