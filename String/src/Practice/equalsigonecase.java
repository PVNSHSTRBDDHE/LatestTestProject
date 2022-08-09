package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class equalsigonecase {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	     driver = new ChromeDriver();
	     
	
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     
	     WebElement signupbtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	     signupbtn.click();
	     
	     Thread.sleep(2000);
	     
    WebElement date = driver.findElement(By.id("day"));
	     WebElement month = driver.findElement(By.id("month"));
	     WebElement year = driver.findElement(By.id("year"));
	     
	     
	     
	     Select selday = new Select(date);
	     Select selmonth = new Select(month);
	     Select selyear = new Select(year);
	     
	     selday.selectByIndex(11);
	     selmonth.selectByVisibleText("Mar");
	     selyear .selectByValue("1996");
	     
	}
	}
	

	

	
	
	


