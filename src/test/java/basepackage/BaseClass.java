package basepackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utilities.common;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import pagespackage.Loginpage;
import testPackage.logintest;

public class BaseClass {
	
	public static AppiumDriver driver;
	public common cm;
	public Loginpage lp;
	public logintest lt;
	
	@BeforeMethod
	public void setup() throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("platformName", "Android");
	    caps.setCapability("appium:automationName", "UiAutomator2");
	    caps.setCapability("appium:appPackage", "com.medzen.app");
	    caps.setCapability("appium:appActivity", "com.medzen.app.MainActivity");
	    caps.setCapability("appium:autoGrantPermissions", true);


	    //Server setup
	    //URL url = new URL("http://<REMOTE_SERVER_IP>:4723/wd/hub"); --> For remote server
	    //URL url = new URL("https://hub.browserstack.com/wd/hub"); --> For using in BrowserStack, Sauce Labs

	    URL url = new URL("http://127.0.0.1:4723");
	    driver = new AndroidDriver(url, caps);
	    cm = new common(driver);
	    lp = new Loginpage(driver, cm);
	}
	
	@AfterMethod
	public void teardown() {
		
		//driver.quit();
		
	}
	

}
