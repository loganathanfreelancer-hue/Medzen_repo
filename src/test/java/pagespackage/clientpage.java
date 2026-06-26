package pagespackage;

import org.openqa.selenium.By;

import Utilities.common;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class clientpage {
	
	AppiumDriver driver;
	common cm;
	
	public clientpage(AndroidDriver driver, common cm) {
		
		this.driver = driver;
		this.cm = cm;
		
	}
	
	By cliuser = By.xpath("//*[@text='Already have an account? Log in']");
	By cliemailid = By.className("android.widget.EditText");
	By clipwdbut = By.xpath("//*[@text='Enter password']");
	By clipwd = AppiumBy.xpath("//android.widget.EditText");
	By clieye = By.xpath("//android.widget.EditText/following-sibling::android.widget.Button");
	By clilogin = By.xpath("//android.widget.Button[@text='Login']");
	By cliepname = By.xpath("//android.widget.TextView[contains(@text,'Test Project')]");
	By clienttab = By.xpath("//android.widget.Button[@text='Client']");
	By clientchatmsg = By.xpath("//android.widget.EditText[contains(@hint,'Type a message')]");
	By clientsend = By.xpath("//android.widget.Button[@text='Send message']");
	By dotsthree = By.xpath("//android.widget.TextView[@text='Test']/parent::*/android.widget.Button");
	By delete = By.xpath("//android.widget.Button[@text='Delete']");
	By confirm = By.xpath("//android.widget.Button[@text='Yes']");
	
	//Signup for client login
	public void cliagainsignUp() throws InterruptedException {

		cm.Againsignuppage(cliuser);

	}

	//Entered client email for client login
	public void cliagainemailPages() {

		cm.Againemailpage(cliemailid, "sivasakthi26082000@gmail.com");

	}

	//Clicked passbutton for client login
	public void cliagainpassbutton() {

		cm.Againpasswordbuttonclick(clipwdbut);
	}

	//Entered password for client login
	public void cliagainpassword() {

		cm.Againpassword(clipwd, clieye, "111111");

	}

	//Clicked login button and logged into client login
	public void cliagainloginbtn() {

		cm.Againloginbutton(clilogin);
	}

	//Entered into chat which created from admin
	public void clichats() {

		cm.chat(cliepname);

	}
	
	//Move to client tab from internal tab
   public void movetoclient() {
		
		cm.changetoClient(clienttab);
		
	}
	
   //Enter msg in client chat from client tab
	public void clientmsg()
	{
		
		cm.clientmsgchats(clientchatmsg, "Hi This is client from client tab");
		
	}
	
	//Send message from client in client tab
	public void clientmsgsend() {
		
		cm.clientsend(clientsend);
		
	}
	
	//Clicking three dots
	public void dots() {
		
		cm.clickTestAction(dotsthree);
		
	}
	
	//Clicks delete button and deleted the ticket
	public void deletee() {
		
		cm.delete(delete);
		
	}
	
	//Clicks yes for alert
	public void confirmm() {
		
		cm.alert(confirm);
		
	}
	

}
