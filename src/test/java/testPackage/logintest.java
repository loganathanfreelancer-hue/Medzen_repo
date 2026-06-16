package testPackage;

import org.testng.annotations.Test;
import basepackage.BaseClass;


public class logintest extends BaseClass{

	@Test
	public void login() {
		
		lp.signUp();
		lp.emailPages();
		lp.passbutton();
		lp.password();
		lp.loginbtn();
        
		
	}

}
