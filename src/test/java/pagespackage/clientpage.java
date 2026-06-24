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
	
	public void cliagainsignUp() throws InterruptedException {

		cm.Againsignuppage(cliuser);

	}

	public void cliagainemailPages() {

		cm.Againemailpage(cliemailid, "sivasakthi26082000@gmail.com");

	}

	public void cliagainpassbutton() {

		cm.Againpasswordbuttonclick(clipwdbut);
	}

	public void cliagainpassword() {

		cm.Againpassword(clipwd, clieye, "111111");

	}

	public void cliagainloginbtn() {

		cm.Againloginbutton(clilogin);
	}

	
	public void clichats() {

		cm.chat(cliepname);

	}
	
   public void movetoclient() {
		
		cm.changetoClient(clienttab);
		
	}
	
	public void clientmsg()
	{
		
		cm.clientmsgchats(clientchatmsg, "Hi This is client from client tab");
		
	}
	
	public void clientmsgsend() {
		
		cm.clientsend(clientsend);
		
	}
	

}
