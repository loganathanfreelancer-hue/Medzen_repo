package pagespackage;

import org.openqa.selenium.By;

import Utilities.common;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Freepage {
	
	AppiumDriver driver;
	common cm;

	public Freepage(AndroidDriver driver, common cm) {
		this.driver = driver;
		this.cm = cm;	
	}
	
	//Again login to free
		By freeuser = By.xpath("//*[@text='Already have an account? Log in']");
		By freeemailid = By.className("android.widget.EditText");
		By freepwdbut = By.xpath("//*[@text='Enter password']");
		By freepwd = AppiumBy.xpath("//android.widget.EditText");
		By freeeye = By.xpath("//android.widget.EditText/following-sibling::android.widget.Button");
		By freelogin = By.xpath("//android.widget.Button[@text='Login']");
		By freepname = By.xpath("//android.widget.TextView[contains(@text,'Test Project')]");
		By freechatmsg = By.xpath("//android.widget.EditText[contains(@hint,'Type a message')]");
		By freesend = By.xpath("//android.widget.Button[@text='Send message']");
		By freeback1 = By.xpath("(//android.widget.Button)[1]");
		By freemenu = By.xpath("(//android.widget.Button)[1]");
		By freesignout = By.xpath("//android.widget.Button[@text='Sign out']");
		
		
		//Clicks signup from freelancer
		public void freeagainsignUp() throws InterruptedException {

			cm.Againsignuppage(freeuser);

		}

		//Enter mail id for freelancer
		public void againemailPages() {

			cm.Againemailpage(freeemailid, "sivasakthi26082000@gmail.com");

		}

		//Click password button for freelancer
		public void againpassbutton() {

			cm.Againpasswordbuttonclick(freepwdbut);
		}

		//Enter password from freelancer
		public void againpassword() {

			cm.Againpassword(freepwd, freeeye, "111111");

		}

		//Click login button and loggedin for freelancer
		public void againloginbtn() {

			cm.Againloginbutton(freelogin);
		}

		
		//Enter into freelancer chats
		public void freechats() {

			cm.chat(freepname);

		}

		//Sending msg in internal tab from freelancer
		public void freemsg() {

			cm.msgchats(freechatmsg, "Hi From Freelancer here from internal tab");

		}

		//Clicks send button from freelancer in internal tab
		public void freesend() {

			cm.send(freesend);

		}
		
		//Clicks back button from freelancer chat
		public void freeback() throws InterruptedException {

			cm.backbutton(freeback1);

		}

		//Clicks menu from freelancer
		public void freemenu() throws InterruptedException {

			cm.menubutton(freemenu);

		}

		//Clicks signout from freelancer and loggeout from freelancer
		public void freesignouts() {

			cm.signouts(freesignout);

		}
}
