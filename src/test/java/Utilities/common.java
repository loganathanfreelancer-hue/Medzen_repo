package Utilities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class common {

	private AndroidDriver driver;

	public common(AppiumDriver driver) {
		this.driver = (AndroidDriver) driver;
	}

	public void signuppage(By loc) throws InterruptedException {

		long start = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		Thread.sleep(5000);
		WebElement loginpage = wait.until(ExpectedConditions.elementToBeClickable(loc));
		loginpage.click();
		long end = System.currentTimeMillis();
		System.out.println("Click and redirects to login page: " + (end - start) + " ms");

	}

	public void emailpage(By loc, String email) {

		long start = System.currentTimeMillis();
		//System.out.println(driver.getPageSource());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		element.sendKeys(email);
		long end = System.currentTimeMillis();
		System.out.println("Email entered: " + (end - start) + " ms");	

	}

	public void passwordbuttonclick(By loc) {

		long start = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(loc));
		login.click();
		long end = System.currentTimeMillis();
		System.out.println("Click enter pwd button: " + (end - start) + " ms");

	}

	public void password(By loc, By loc1, String pass) {

		long start = System.currentTimeMillis();

		WebDriverWait wait =
				new WebDriverWait(driver, Duration.ofSeconds(20));

		try {
			Thread.sleep(3000); // wait page load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement element =
				wait.until(ExpectedConditions.visibilityOfElementLocated(loc));

		element.sendKeys(pass);

		System.out.println("Before eye icon");

		WebElement eyeicon =
				wait.until(ExpectedConditions.elementToBeClickable(loc1));

		System.out.println("Eye icon found");
		eyeicon.click();
		System.out.println("Eye icon clicked");

		long end = System.currentTimeMillis();

		System.out.println("Password entered and click eye icon : "
				+ (end - start) + " ms");
	}

	public void loginbutton(By loc) {

		long start = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginbtn = wait.until(ExpectedConditions.elementToBeClickable(loc));
		System.out.println("Login button found");
		loginbtn.click();
		System.out.println("Login button clicked");
		long end = System.currentTimeMillis();
		System.out.println("Click login button: " + (end - start) + " ms");

	}

	public void addbutton(By loc) throws InterruptedException {

		long start = System.currentTimeMillis();

		System.out.println("Waiting for home page...");
		Thread.sleep(5000);

		WebDriverWait wait =
				new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement plusbtn =
				wait.until(ExpectedConditions.elementToBeClickable(loc));

		plusbtn.click();

		long end = System.currentTimeMillis();

		System.out.println("Clicked plus icon: " + (end - start) + " ms");
	}

	public void pnames(By loc, String name) throws InterruptedException {

		long start = System.currentTimeMillis();
		//System.out.println(driver.getPageSource());
		System.out.println("Project name sending keys");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement pname = wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		pname.sendKeys(name);
		long end = System.currentTimeMillis();
		System.out.println("Project name entered: " + (end - start) + " ms");

	}

	public void pdesc(By loc, String desc) {

		long start = System.currentTimeMillis();
		//System.out.println(driver.getPageSource());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement pdesc = wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		pdesc.sendKeys(desc);
		long end = System.currentTimeMillis();
		System.out.println("Desc entered: " + (end - start) + " ms");

	}

	//   public void pfile(By loc, String file) {
	//	   
	//	    long start = System.currentTimeMillis();
	//		//System.out.println(driver.getPageSource());
	//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	    WebElement pfile = wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	//	    pfile.sendKeys(file);
	//	    long end = System.currentTimeMillis();
	//	    System.out.println("Email entered: " + (end - start) + " ms");
	//	   
	// }


	public void clickNext(By locator) {
		long start = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(locator));
		System.out.println("Next button found");
		nextBtn.click();
		System.out.println("Next button clicked");
		long end = System.currentTimeMillis();
		System.out.println("Created entered: " + (end - start) + " ms");
	}
	

	public void chat(By loc) {
		long start = System.currentTimeMillis();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement goto1 = wait.until(ExpectedConditions.elementToBeClickable(loc));
        System.out.println("Creation found");
        goto1.click();
        System.out.println("Inside chat box");
		long end = System.currentTimeMillis();
		System.out.println("Chatbox entered: " + (end - start) + " ms");

	}
	
	public void msgchats(By loc, String chatmsg) {

		long start = System.currentTimeMillis();
		//System.out.println(driver.getPageSource());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement msgs = wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		msgs.sendKeys(chatmsg);
		long end = System.currentTimeMillis();
		System.out.println("Msg entered: " + (end - start) + " ms");

	}

	public void send(By loc) {
		long start = System.currentTimeMillis();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement sendmsg = wait.until(ExpectedConditions.elementToBeClickable(loc));
        System.out.println("Creation found");
        sendmsg.click();
        System.out.println("Inside chat box");
		long end = System.currentTimeMillis();
		System.out.println("Message send to employee: " + (end - start) + " ms");

	}
	
	public void backbutton(By loc) throws InterruptedException {

		long start = System.currentTimeMillis();

		System.out.println("Pressing back button");
		Thread.sleep(5000);

		WebDriverWait wait =
				new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement plusbtn =
				wait.until(ExpectedConditions.elementToBeClickable(loc));

		plusbtn.click();

		long end = System.currentTimeMillis();

		System.out.println("Clicked back icon: " + (end - start) + " ms");
	}

	public void menubutton(By loc) throws InterruptedException {

		long start = System.currentTimeMillis();

		System.out.println("Opened menu page");
		Thread.sleep(5000);

		WebDriverWait wait =
				new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement plusbtn =
				wait.until(ExpectedConditions.elementToBeClickable(loc));

		plusbtn.click();

		long end = System.currentTimeMillis();

		System.out.println("Clicked menu icon: " + (end - start) + " ms");
	}
	
	public void signouts(By loc) {
		long start = System.currentTimeMillis();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement sendmsg = wait.until(ExpectedConditions.elementToBeClickable(loc));
        System.out.println("Signout button found");
        sendmsg.click();
        System.out.println("Signout button clicked");
		long end = System.currentTimeMillis();
		System.out.println("Sign out successfully: " + (end - start) + " ms");

	}
	
	//Again login
	
	public void Againsignuppage(By loc) throws InterruptedException {

		long start = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		Thread.sleep(5000);
		WebElement loginpage = wait.until(ExpectedConditions.elementToBeClickable(loc));
		loginpage.click();
		long end = System.currentTimeMillis();
		System.out.println("Click and redirects to login page: " + (end - start) + " ms");

	}

	public void Againemailpage(By loc, String email) {

		long start = System.currentTimeMillis();
		//System.out.println(driver.getPageSource());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		element.sendKeys(email);
		long end = System.currentTimeMillis();
		System.out.println("Email entered: " + (end - start) + " ms");	

	}

	public void Againpasswordbuttonclick(By loc) {

		long start = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(loc));
		login.click();
		long end = System.currentTimeMillis();
		System.out.println("Click enter pwd button: " + (end - start) + " ms");

	}

	public void Againpassword(By loc, By loc1, String pass) {

		long start = System.currentTimeMillis();

		WebDriverWait wait =
				new WebDriverWait(driver, Duration.ofSeconds(20));

		try {
			Thread.sleep(3000); // wait page load
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement element =
				wait.until(ExpectedConditions.visibilityOfElementLocated(loc));

		element.sendKeys(pass);

		System.out.println("Before eye icon");

		WebElement eyeicon =
				wait.until(ExpectedConditions.elementToBeClickable(loc1));

		System.out.println("Eye icon found");
		eyeicon.click();
		System.out.println("Eye icon clicked");

		long end = System.currentTimeMillis();

		System.out.println("Password entered and click eye icon : "
				+ (end - start) + " ms");
	}

	public void Againloginbutton(By loc) {

		long start = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginbtn = wait.until(ExpectedConditions.elementToBeClickable(loc));
		System.out.println("Login button found");
		loginbtn.click();
		System.out.println("Login button clicked");
		long end = System.currentTimeMillis();
		System.out.println("Click login button: " + (end - start) + " ms");

	}


	public void Againchat(By loc) {
		long start = System.currentTimeMillis();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement goto1 = wait.until(ExpectedConditions.elementToBeClickable(loc));
        System.out.println("Creation found");
        goto1.click();
        System.out.println("Inside chat box");
		long end = System.currentTimeMillis();
		System.out.println("Chatbox entered: " + (end - start) + " ms");

	}
	
	public void Againmsgchats(By loc, String chatmsg) {

		long start = System.currentTimeMillis();
		//System.out.println(driver.getPageSource());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement msgs = wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		msgs.sendKeys(chatmsg);
		long end = System.currentTimeMillis();
		System.out.println("Msg entered: " + (end - start) + " ms");

	}

	public void Againsend(By loc) {
		long start = System.currentTimeMillis();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement sendmsg = wait.until(ExpectedConditions.elementToBeClickable(loc));
        System.out.println("Creation found");
        sendmsg.click();
        System.out.println("Inside chat box");
		long end = System.currentTimeMillis();
		System.out.println("Message send to employee: " + (end - start) + " ms");

	}



}
