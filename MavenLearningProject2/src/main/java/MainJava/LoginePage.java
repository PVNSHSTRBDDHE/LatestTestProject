package MainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginePage extends BaseClass {
	
	//all the locators are at top
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	//initiation of the page variables (Locators)
	
	public LoginePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//steps
	public void LogineMethod(String userNameData,String passwordData ){
		username.sendKeys(userNameData);	
		password.sendKeys(passwordData);
		btnLogin.click();
	}
	public boolean titleOfLoginePage(){
		String title = driver.getTitle();
		if(title.equals("OrangeHRM"));
		return true;
		
	}
	public boolean urlOfLoginPage(){
	String url = driver.getCurrentUrl();
	if(url.equals("https://opensource-demo.orangehrmlive.com/"))
	return true;
	else
		return false;

	}
	public boolean btnloginDisplayed(){
	boolean btnPresence= btnLogin.isDisplayed();
	return btnPresence;
		
		
	}

	public boolean titleOfForgotPage() {
		// TODO Auto-generated method stub
		return false;
	}

}
