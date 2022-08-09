package MainJava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BaseClass {
	
	@FindBy(xpath="//h1[text()='Dashboard']")
	WebElement titleOfDashboard;
	
	@FindBy(id = "welcome")
	WebElement dropdownWelcome;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement btnLogout;
	
	
	public DashboardPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean titleofPage(){
		String titleDashboard= titleOfDashboard.getText();
		if(titleDashboard.equals("Dashboard"))
			return true;
			else
				return false;
	}
	
	public void logoutMethods( ){
		LoginePage Login = new LoginePage(driver);
		dropdownWelcome.click();
		WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(10));
		explicitWait.until(ExpectedConditions.elementToBeClickable(btnLogout));
		btnLogout.click();
	}
	
	
	
	

}
