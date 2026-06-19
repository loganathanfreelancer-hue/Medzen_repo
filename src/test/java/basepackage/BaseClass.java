package basepackage;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Utilities.common;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import pagespackage.Creationpage;
import pagespackage.Loginpage;
import pagespackage.chatpage;
import testPackage.logintest;

public class BaseClass {
	
	private static ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();
	public AndroidDriver getDriver() {
	    return driver.get();
	}
	public common cm;
	public Loginpage lp;
	public logintest lt;
	public Creationpage cp;
	public chatpage ch;
	
	@BeforeClass
	@Parameters("device")
	public void setup(String device) throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("platformName", "Android");
	    caps.setCapability("appium:automationName", "UiAutomator2");
	    caps.setCapability("appium:appPackage", "com.medzen.app");
	    caps.setCapability("appium:appActivity", "com.medzen.app.MainActivity");
	    caps.setCapability("appium:uiautomator2ServerLaunchTimeout", 60000);
	    caps.setCapability("appium:autoGrantPermissions", true);
	    
	    if(device.equalsIgnoreCase("emulator")) {

            caps.setCapability("appium:deviceName","emulator-5554");
            caps.setCapability("appium:udid", "emulator-5554");
            caps.setCapability("appium:systemPort", 8201);
            driver.set(new AndroidDriver(new URL("http://127.0.0.1:4723"), caps));
        }
        
        // =========================
        // REAL DEVICE
        // =========================

        else if(device.equalsIgnoreCase("mobile")) {

            caps.setCapability("appium:deviceName", "Redmi note 12 pro");
            caps.setCapability("appium:udid","v4kbnzf6w8hynfaa");
            caps.setCapability("appium:systemPort", 8202);
            caps.setCapability("appium:ignoreHiddenApiPolicyError", true);
            caps.setCapability("appium:enforceXPath1", true);
            driver.set(new AndroidDriver(new URL("http://127.0.0.1:4725"), caps));
        }   



	    //Server setup
	    //URL url = new URL("http://<REMOTE_SERVER_IP>:4723/wd/hub"); --> For remote server
	    //URL url = new URL("https://hub.browserstack.com/wd/hub"); --> For using in BrowserStack, Sauce Labs

	    cm = new common(getDriver());
	    lp = new Loginpage(getDriver(), cm);
	    cp = new Creationpage(getDriver(), cm);
	    ch = new chatpage(getDriver(),cm);
	}
	
	@AfterClass
	public void teardown() {
		
		//driver.quit();
		
	}
	

}
