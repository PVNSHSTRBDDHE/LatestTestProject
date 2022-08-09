package MainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage extends BaseClass{
	
	@FindBy(xpath="//*[text()='Welcome Paul']")
	WebElement ClickWelcomebtn;

	@FindBy(xpath="//*[text()='Logout']")
	WebElement ClickLogoutbtn;
	
	
	public LogOutPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LogoutMethod(){
      	ClickWelcomebtn.click();
		ClickLogoutbtn.click();
	}

}
