package pagespackage;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.common;
import io.appium.java_client.AppiumDriver;

public class Creationpage {

	AppiumDriver driver;
	common cm;

	public Creationpage(AppiumDriver driver, common cm) {
		this.driver = driver;
		this.cm = cm;
	}

	By plus = By.xpath("(//android.widget.Button)[last()]");
	By pname = By.xpath("//android.widget.EditText[@hint='Eg. Project A']");
	By pdesc = By.xpath("//android.widget.EditText[@hint='Eg. This project A includes everything...']");
	//By pfile = By.xpath("//android.widget.EditText[@text='Drag and drop or add files']");
	By nextPage1 = By.xpath("//android.widget.Button[@text='Next']");
	By addcli = By.xpath("//android.widget.TextView[contains(@text,'sakthi-Client')]");
	By nextPage2 = By.xpath("//android.widget.Button[@text='Next']");
	By addemp = By.xpath("//android.widget.TextView[contains(@text,'Sakthi')]");
	By nextPage3 = By.xpath("//android.widget.Button[@text='Next']");
	By addfree = By.xpath("//android.widget.TextView[contains(@text,'sakthi - Freelancer')]");
	By nextPage4 = By.xpath("//android.widget.Button[@text='Next']");
	By nextPage5 = By.xpath("//android.widget.Button[@text='Create']");


	public void addbtn() throws InterruptedException {

		cm.addbutton(plus);

	}

	public void pnames() throws InterruptedException {

		cm.pnames(pname, "Test Project");

	}

	public void pdescs() {

		cm.pdesc(pdesc, "This is a Test Description");
	}

	//	public void pfiles() {
	//		
	//		cm.pfile(pfile, "");
	//		
	//	}

	public void clickNextOnPage1() {
		cm.clickNext(nextPage1); 
	}
	
	public void clickcliOnPage2() throws InterruptedException {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//android.widget.TextView[@text='Create Ticket']")));

	    for (int i = 0; i < 15; i++) {

	        List<WebElement> clients = driver.findElements(
	                By.xpath("//android.widget.TextView[@text='sakthi-Client']"));

	        if (!clients.isEmpty()) {

	            WebElement client = clients.get(0);

	            client.click();

	            System.out.println("sakthi-Client clicked once");

	            Thread.sleep(2000);
	            
	            for (int j = 0; j < 50; j++) {

	                driver.executeScript("mobile: swipeGesture", Map.of(
	                        "left", 100,
	                        "top", 500,
	                        "width", 800,
	                        "height", 1000,
	                        "direction", "down",
	                        "percent", 0.20
	                ));

	                Thread.sleep(500);
	            }

	            // Stop the method here after one click
	            break;
	        }

	        driver.executeScript("mobile: swipeGesture", Map.of(
	                "left", 100,
	                "top", 1200,
	                "width", 800,
	                "height", 600,
	                "direction", "up",
	                "percent", 0.15
	        ));

	        Thread.sleep(1000);
	    }

	    //wait.until(ExpectedConditions.elementToBeClickable(addcli));
	    //cm.clickNext(addcli);
	}
	
	public void clickNextOnPage2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Wait until the "Create Ticket" heading is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.TextView[@text='Create Ticket']")
				));

		// Wait until the Next button is visible (not just clickable)
		wait.until(ExpectedConditions.visibilityOfElementLocated(nextPage2));

		// Now click using your common class
		cm.clickNext(nextPage2);
	}

	public void clickempOnPage2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Wait until the "Create Ticket" heading is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.TextView[@text='Create Ticket']")
				));

		// Wait until the Next button is visible (not just clickable)
		wait.until(ExpectedConditions.visibilityOfElementLocated(addemp));

		// Now click using your common class
		cm.clickNext(addemp);
	}




	public void clickNextOnPage3() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Wait until the "Create Ticket" heading is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.TextView[@text='Create Ticket']")
				));

		// Wait until the Next button is visible (not just clickable)
		wait.until(ExpectedConditions.visibilityOfElementLocated(nextPage3));

		// Now click using your common class
		cm.clickNext(nextPage3);
	}
	
	public void clickfreeOnPage2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Wait until the "Create Ticket" heading is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.TextView[@text='Create Ticket']")
				));

		// Wait until the Next button is visible (not just clickable)
		wait.until(ExpectedConditions.visibilityOfElementLocated(addfree));

		// Now click using your common class
		cm.clickNext(addfree);
	}


	public void clickNextOnPage4() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Wait until the "Create Ticket" heading is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.TextView[@text='Create Ticket']")
				));

		// Wait until the Next button is visible (not just clickable)
		wait.until(ExpectedConditions.visibilityOfElementLocated(nextPage4));

		// Now click using your common class
		cm.clickNext(nextPage4);
	}

	public void clickNextOnPage5() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Wait until the "Create Ticket" heading is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.TextView[@text='Create Ticket']")
				));

		// Wait until the Next button is visible (not just clickable)
		wait.until(ExpectedConditions.visibilityOfElementLocated(nextPage5));

		// Now click using your common class
		cm.clickNext(nextPage5);
	}



}
