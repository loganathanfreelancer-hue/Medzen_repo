package testPackage;

import org.testng.annotations.Test;
import basepackage.BaseClass;


public class logintest extends BaseClass{

	@Test(priority = -2)
	public void login() throws InterruptedException {
		
		lp.signUp();
		lp.emailPages();
		lp.passbutton();
		lp.password();
		lp.loginbtn();   	
	}
	
	@Test(dependsOnMethods= "login", priority = -1)
	public void creation() throws InterruptedException {
		
		cp.addbtn();
		cp.pnames();
		cp.pdescs();
		cp.clickNextOnPage1();
		Thread.sleep(5000);
		cp.clickNextOnPage2();
		Thread.sleep(5000);
		cp.clickNextOnPage3();
		Thread.sleep(5000);
		cp.clickNextOnPage4();

		
	}

}
