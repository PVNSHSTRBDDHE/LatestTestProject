package TestJava;

import org.testng.Assert;
import org.testng.annotations.Test;

import MainJava.BaseClass;
import MainJava.DashboardPage;
import MainJava.LoginePage;

public class LoginePageTest extends BaseTest {
	
	@Test(priority=1)
	public void VerifyLogineFunctionality(){
	LoginePage Login = new LoginePage(driver);
	Login.LogineMethod("Admin","admin123");
//	DashboardPage db = new DashboardPage(driver); //at instance of driver
//	boolean verifyLoginIsSucessful = dashboardpage.titleofPage();
//	Assert.assertEquals(verifyLoginIsSucessful, true);
	}
	
    @Test(priority=0)
    public void verifyTitleOfPage(){
    	LoginePage login =new LoginePage(driver);
    boolean titlePageIsVerified = login.titleOfLoginePage();
    Assert.assertEquals(titlePageIsVerified, true);
    	
    }
    @Test(priority=-1)
    public void verifyurlOfPage(){
    boolean urlOfWebPageIsVerified = login.urlOfLoginPage();
    Assert.assertEquals(urlOfWebPageIsVerified, true);
    
    }
    
}
//  package = TestSuite 
//  testcases = testclass
//  @Test= Test Steps