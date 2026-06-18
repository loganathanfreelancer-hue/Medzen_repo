package pagespackage;

import java.time.Duration;

import org.openqa.selenium.By;
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

	By plus = By.xpath("//android.widget.Button[@bounds='[868,2189][1018,2338]']");
	By pname = By.xpath("//android.widget.EditText[@hint='Eg. Project A']");
	By pdesc = By.xpath("//android.widget.EditText[@hint='Eg. This project A includes everything...']");
	//By pfile = By.xpath("//android.widget.EditText[@text='Drag and drop or add files']");
	By nextPage1 = By.xpath("//android.widget.Button[@text='Next']");
	By nextPage2 = By.xpath("//android.widget.Button[@text='Next']");
	By addemp = By.xpath("//android.widget.TextView[contains(@text,'Sakthi')]");
	By nextPage3 = By.xpath("//android.widget.Button[@text='Next']");
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
