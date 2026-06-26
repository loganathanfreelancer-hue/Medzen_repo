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


	// Going to chat which created
	public void chats() {

		cm.chat(pname);

	}

	// Sending text in  from admin in internal tab
	public void msg() {

		cm.msgchats(chatmsg, "Hi From admin here in internal tab");

	}

	// Click send from admin in internal tab
	public void send() {

		cm.send(send);

	}
	
	//In chat switch to client tab
	public void movetoclient() {
		
		cm.changetoClient(clienttab);
		
	}
	
	// In client tab sending msg to client from admin
	public void clientmsg()
	{
		
		cm.clientmsgchats(clientchatmsg, "Hi Client from admin here in client tab");
		
	}
	
	// In client tab sent msg from admin login
	public void clientmsgsend() {
		
		cm.clientsend(clientsend);
		
	}
	
	//Going back to menu page in admin
	public void back() throws InterruptedException {

		cm.backbutton(back1);

	}

	//Clicks menu in admin
	public void menu() throws InterruptedException {

		cm.menubutton(menu);

	}

	//Clicks signout in admin and logout from admin
	public void signouts() {

		cm.signouts(signout);

	}

	//Again clicks signup from employee
	public void againsignUp() throws InterruptedException {

		cm.Againsignuppage(user);

	}

	//Enter employee emailid
	public void againemailPages() {

		cm.Againemailpage(emailid, "sakthisudalai23062002@gmail.com");

	}

	//Click employee password button
	public void againpassbutton() {

		cm.Againpasswordbuttonclick(pwdbut);
	}

	//Enter employee password button
	public void againpassword() {

		cm.Againpassword(pwd, eye, "111111");

	}

	//Logged into employee 
	public void againloginbtn() {

		cm.Againloginbutton(login);
	}

	//Entered into chats which created in admin login from employee
	public void againchats() {

		cm.chat(pname1);

	}

	//Send msg from employee in internal tab
	public void againmsg() {

		cm.msgchats(chatmsg1, "Hi Employee here from internal tab");

	}

	//Clicks send in internal tab from employee login
	public void againsend() {

		cm.send(send1);

	}
	
	//Clicks back from chat in employee login
	public void empback() throws InterruptedException {

		cm.empbackbutton(backemp);

	}

	//Clicks menu from employee login
	public void empmenu() throws InterruptedException {

		cm.empmenubutton(menuemp);

	}

	//Clicks signout from employee login and loggedout from employee login
	public void empsignouts() {

		cm.empsignouts(signoutemp);

	}

}
