package testPackage;

import org.testng.annotations.Test;
import basepackage.BaseClass;


public class logintest extends BaseClass{

	@Test(priority = -2)
	public void login() throws InterruptedException {
		
		Thread.sleep(3000);
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
		cp.clickcliOnPage2();
		cp.clickNextOnPage2();
		cp.clickempOnPage2();
		cp.clickNextOnPage3();
        cp.clickfreeOnPage2();
		cp.clickNextOnPage4();
		cp.clickNextOnPage5();
		ch.chats();
		Thread.sleep(3000);
		ch.msg();
		ch.send();
		ch.movetoclient();
		ch.clientmsg();
		ch.clientmsgsend();
		ch.back();
		ch.menu();
		ch.signouts();
		
	}
	
	@Test(dependsOnMethods = "creation", priority = 0)
	public void againlogin() throws InterruptedException {
		
		Thread.sleep(3000);
		ch.againsignUp();
		ch.againemailPages();
		ch.againpassbutton();
		ch.againpassword();
		ch.againloginbtn();
		ch.againchats();
		ch.againmsg();
		ch.againsend();
		ch.empback();
		ch.empmenu();
		ch.empsignouts();
		
	}
	
	@Test(dependsOnMethods = "againlogin", priority = 1)
	public void againfreelogin() throws InterruptedException {
		
		fp.freeagainsignUp();
		fp.againemailPages();
		fp.againpassbutton();
		fp.againpassword();
		fp.againloginbtn();
		fp.freechats();
		fp.freemsg();
		fp.freesend();
		fp.freeback();
		fp.freemenu();
		fp.freesignouts();
		
	}

}
