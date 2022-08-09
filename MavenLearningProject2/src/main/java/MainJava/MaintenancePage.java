package MainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaintenancePage extends BaseClass {
	
	@FindBy(xpath="//*[text()='Maintenance']")
	WebElement maintenance;
	
	@FindBy(xpath="//*[@id='confirm_password']")
	WebElement Clickinfield;
	
	public MaintenancePage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void maintenanceMethod(String PasswardData){
		maintenance.click();
		Clickinfield.click();
		Clickinfield.sendKeys(PasswardData);
		
		
	}

}
