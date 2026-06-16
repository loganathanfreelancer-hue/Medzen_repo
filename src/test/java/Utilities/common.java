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
	
	public void signuppage(By loc) {
		
		long start = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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

        driver.navigate().back();

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
	
	

}
