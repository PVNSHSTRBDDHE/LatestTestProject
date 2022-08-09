package TestJava;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import MainJava.BaseClass;
import MainJava.DashboardPage;
import MainJava.ForgotPassword;
import MainJava.LogOutPage;
import MainJava.LoginePage;
import MainJava.MaintenancePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends BaseClass{
     @BeforeClass
	public void WebBrowserLaunching() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
     @BeforeMethod
     public void allPageObject(){
    	 login = new LoginePage(driver);
    	 fp= new ForgotPassword(driver);
    	 Mn= new MaintenancePage(driver);
    	 LogP= new LogOutPage(driver);
    	 
     }
     
     @AfterMethod
     public void tearDown() {
    	 
     }
     
    }
