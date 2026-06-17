package Utilities;

import java.time.Duration;
import java.util.List;

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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
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
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(locator));
    System.out.println("Next button found");
    nextBtn.click();
    System.out.println("Next button clicked");
     }

     public void clickNextByIndex(int step) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("(//android.widget.Button[@text='Next'])[" + step + "]")
    ));
    System.out.println("Next button " + step + " found in second page");
    nextBtn.click();
    System.out.println("Next button " + step + " clicked in second page");
     }
     
     public void clickNextByIndex1(int step) {
    	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	    WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(
    	        By.xpath("(//android.widget.Button[@text='Next'])[" + step + "]")
    	    ));
    	    System.out.println("Next button " + step + " found in third page");
    	    nextBtn.click();
    	    System.out.println("Next button " + step + " clicked in third page");
    	     }
     
     public void clickNextByIndex2(int step) {
 	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 	    WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(
 	        By.xpath("(//android.widget.Button[@text='Create'])[" + step + "]")
 	    ));
 	    System.out.println("Create button " + step + " found in last page");
 	    nextBtn.click();
 	    System.out.println("Create button " + step + " clicked in last page");
 	     }



   
}
