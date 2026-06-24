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
		
		public void freeagainsignUp() throws InterruptedException {

			cm.Againsignuppage(freeuser);

		}

		public void againemailPages() {

			cm.Againemailpage(freeemailid, "sivasakthi26082000@gmail.com");

		}

		public void againpassbutton() {

			cm.Againpasswordbuttonclick(freepwdbut);
		}

		public void againpassword() {

			cm.Againpassword(freepwd, freeeye, "111111");

		}

		public void againloginbtn() {

			cm.Againloginbutton(freelogin);
		}

		
		public void freechats() {

			cm.chat(freepname);

		}

		public void freemsg() {

			cm.msgchats(freechatmsg, "Hi From Freelancer here from internal tab");

		}

		public void freesend() {

			cm.send(freesend);

		}
		
		public void freeback() throws InterruptedException {

			cm.backbutton(freeback1);

		}

		public void freemenu() throws InterruptedException {

			cm.menubutton(freemenu);

		}

		public void freesignouts() {

			cm.signouts(freesignout);

		}
}
