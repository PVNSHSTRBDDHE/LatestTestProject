package TestJava;

import org.testng.annotations.Test;

import MainJava.MaintenancePage;

public class MaintenanceTest extends BaseTest {
	
	@Test
	
	public static void verifyManitenancePage(){
		MaintenancePage Mn = new MaintenancePage(driver);
		Mn.maintenanceMethod("Pavan@143");
		
		
	}

}
