package pagespackage;

import org.openqa.selenium.By;

import Utilities.common;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class Loginpage {

	AppiumDriver driver;
	common cm;

	public Loginpage(AppiumDriver driver, common cm) {
		this.driver = driver;
		this.cm = cm;
	}


	By user = By.xpath("//*[@text='Already have an account? Log in']");
	By emailid = By.className("android.widget.EditText");
	By pwdbut = By.xpath("//*[@text='Enter password']");
	By pwd = AppiumBy.xpath("//android.widget.EditText");
	By eye = By.xpath("//android.widget.EditText/following-sibling::android.widget.Button");
	By login = By.xpath("//android.widget.Button[@text='Login']");

	public void signUp() {

		cm.signuppage(user);

	}

	public void emailPages() {

		cm.emailpage(emailid, "shilpakumarii23051@gmail.com");

	}

	public void passbutton() {

		cm.passwordbuttonclick(pwdbut);
	}

	public void password() {

		cm.password(pwd, eye, "@Shilpa12");

	}

	public void loginbtn() {

		cm.loginbutton(login);
	}


}
