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
	By back1 = By.xpath("//android.widget.Button[@bounds='[42,147][141,249]']");
	By menu = By.xpath("//android.widget.Button[@bounds='[49,115][168,236]']");
	By signout = By.xpath("//android.widget.Button[@text='Sign out']");

	//Again login
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


	public void chats() {

		cm.chat(pname);

	}

	public void msg() {

		cm.msgchats(chatmsg, "Hi Sakthi! From admin here");

	}

	public void send() {

		cm.send(send);

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

	public void againsignUp() {

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

		cm.msgchats(chatmsg1, "Hi Admin! Sakthi here");

	}

	public void againsend() {

		cm.send(send1);

	}
}
