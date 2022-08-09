package MainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword extends BaseClass{
	
	@FindBy(xpath="//*[text()='Forgot your password?']")
	WebElement forgotPassword;
	
	@FindBy(xpath="//*[@id='securityAuthentication_userName']")
	WebElement PasswordUsername;
	
	@FindBy(xpath="//*[@id='btnSearchValues']")
	WebElement ResetPassword;
	
	public ForgotPassword(WebDriver driver) {
	      this.driver=driver;
	      PageFactory.initElements(driver, this);}
	      
	      
	      
	      public void ClickOnForgotPassword(String userpass) {
	    	  forgotPassword.click();
	    	  PasswordUsername.sendKeys(userpass);
	    	  ResetPassword.click();
	    	 
	      }
	      public boolean titleOfForgotPage(){
	    	  String title = driver.getTitle();
	    			  if(title.equals("Forgot Your Password?"));
	    					  return true;
	    			  
	      }
	


}