package pagespackage;

import org.openqa.selenium.By;

import Utilities.common;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class chatpage {

	AppiumDriver driver;
	common cm;

	public chatpage(AppiumDriver driver, common cm) {
		this.driver = driver;
		this.cm = cm;
	}

	By pname = By.xpath("//android.widget.TextView[contains(@text,'Test Project')]");
	By chatmsg = By.xpath("//android.widget.EditText[contains(@hint,'Type a message')]");
	By send = By.xpath("//android.widget.Button[@text='Send message']");
	By clienttab = By.xpath("//android.widget.Button[@text='Client']");
	By clientchatmsg = By.xpath("//android.widget.EditText[contains(@hint,'Type a message')]");
	By clientsend = By.xpath("//android.widget.Button[@text='Send message']");
	By back1 = By.xpath("(//android.widget.Button)[1]");
	By menu = By.xpath("(//android.widget.Button)[1]");
	By signout = By.xpath("//android.widget.Button[@text='Sign out']");

	//Again login to emp
	By user = By.xpath("//*[@text='Already have an account? Log in']");
	By emailid = By.className("android.widget.EditText");
	By pwdbut = By.xpath("//*[@text='Enter password']");
	By pwd = AppiumBy.xpath("//android.widget.EditText");
	By eye = By.xpath("//android.widget.EditText/following-sibling::android.widget.Button");
	By login = By.xpath("//android.widget.Button[@text='Login']");

	//From home page in employee
	By pname1 = By.xpath("//android.widget.TextView[contains(@text,'Test Project')]");
	By chatmsg1 = By.xpath("//android.widget.EditText[contains(@hint,'Type a message')]");
	By send1 = By.xpath("//android.widget.Button[@text='Send message']");
	
	By backemp = By.xpath("(//android.widget.Button)[1]");
	By menuemp = By.xpath("(//android.widget.Button)[1]");
	By signoutemp = By.xpath("//android.widget.Button[@text='Sign out']");


	public void chats() {

		cm.chat(pname);

	}

	public void msg() {

		cm.msgchats(chatmsg, "Hi From admin here in internal tab");

	}

	public void send() {

		cm.send(send);

	}
	
	public void movetoclient() {
		
		cm.changetoClient(clienttab);
		
	}
	
	public void clientmsg()
	{
		
		cm.clientmsgchats(clientchatmsg, "Hi Client from admin here in client tab");
		
	}
	
	public void clientmsgsend() {
		
		cm.clientsend(clientsend);
		
	}
	
	public void back() throws InterruptedException {

		cm.backbutton(back1);

	}

	public void menu() throws InterruptedException {

		cm.menubutton(menu);

	}

	public void signouts() {

		cm.signouts(signout);

	}

	public void againsignUp() throws InterruptedException {

		cm.Againsignuppage(user);

	}

	public void againemailPages() {

		cm.Againemailpage(emailid, "sakthisudalai23062002@gmail.com");

	}

	public void againpassbutton() {

		cm.Againpasswordbuttonclick(pwdbut);
	}

	public void againpassword() {

		cm.Againpassword(pwd, eye, "111111");

	}

	public void againloginbtn() {

		cm.Againloginbutton(login);
	}

	public void againchats() {

		cm.chat(pname1);

	}

	public void againmsg() {

		cm.msgchats(chatmsg1, "Hi Employee here from internal tab");

	}

	public void againsend() {

		cm.send(send1);

	}
	
	public void empback() throws InterruptedException {

		cm.empbackbutton(backemp);

	}

	public void empmenu() throws InterruptedException {

		cm.empmenubutton(menuemp);

	}

	public void empsignouts() {

		cm.empsignouts(signoutemp);

	}

}
