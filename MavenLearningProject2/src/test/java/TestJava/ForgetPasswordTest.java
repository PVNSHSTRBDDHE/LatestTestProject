package TestJava;

import org.testng.annotations.Test;

import MainJava.ForgotPassword;

public class ForgetPasswordTest extends BaseTest {
	
	@Test
	
	public void VerifyForgotPasswordFunctionality(){
		ForgotPassword fp = new ForgotPassword(driver);
		fp.ClickOnForgotPassword("12345");
		
//		@Test
//		
//		public void verifyTitleOfPage(){
//			titleOfForgotPage TLP = new titleOfForgotPage(driver);
//			 boolean titlePageIsVerified = TLP.titleOfForgotPage();
//					 Assert.assertEquals(titlePageIsVerified, true);
//		}
		
		
		
		
		
		
	}
	
}
