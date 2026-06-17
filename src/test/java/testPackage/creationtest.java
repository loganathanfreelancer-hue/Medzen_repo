package testPackage;

import org.testng.annotations.Test;

import basepackage.BaseClass;

public class creationtest extends BaseClass{
	
	@Test
	public void creation() throws InterruptedException {
		
		cp.addbtn();
		
	}

}
