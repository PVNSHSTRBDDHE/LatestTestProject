package TestJava;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import MainJava.BaseClass;
import MainJava.DashboardPage;

public class DashboardPageTest extends BaseClass {
	
	
	@Test(priority=5)
	public void verifyLogoutFunctionality(){
	login.LogineMethod("Admin", "admin123");
	//dashboardpage.logoutMethods();
	 boolean verifySucessfullyLogout= login.btnloginDisplayed();
	 AssertJUnit.assertEquals(verifySucessfullyLogout, true);
	 
	 
	 
	}
}