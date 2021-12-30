package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.CommonMethods;
import Utilities.Driver;
import Utilities.testDataReader;

public class orangeHRMTestCase extends CommonMethods {
	
	
	@BeforeMethod(alwaysRun=true)
	public void setUp() {
		Driver.getDriver();
		
	}
	
	
	@Test(groups = { "smokeTest", "functionalTest","Regression" } , description = "This test tests the login functionality of the Orange HRM application" )
	public void loginToHRM() {
		homepage.login();
		
	System.out.println("Login");
				
	}
	
	
	@Test
	public void deleteNationality() {
		homepage.login();
		
		AssertJUnit.assertTrue(dashPage.welcomeText.getText().
				contains(testDataReader.getProperty("verifyWelcomeText")));
		
		comElPage.adminTab.click();
		comElPage.nationalitiesTab.click();
		
		CommonMethods.wait(3);
		
		CommonMethods.scrollDown(600);
		
		CommonMethods.wait(3);

				
	}
	
	

	@Test(groups = { "smokeTest" })
	public void loginToHRM2() {
		System.out.println("login 2");
		homepage.login();
		
		AssertJUnit.assertTrue(dashPage.welcomeText.getText().
				contains(testDataReader.getProperty("verifyWelcomeText")));
				
	}
	
	
	
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		Driver.quitDriver();
	}
	

	@Test
	public void loginToHRM3() {
		System.out.println("login 3");
		homepage.login();
		
		AssertJUnit.assertTrue(dashPage.welcomeText.getText().
				contains(testDataReader.getProperty("verifyWelcomeText")));
				
	}
	
	
	

	@Test(groups = { "smokeTest" })
	public void loginToHRM4() {
		System.out.println("login 4");
		homepage.login();
		
		AssertJUnit.assertTrue(dashPage.welcomeText.getText().
				contains(testDataReader.getProperty("verifyWelcomeText")));
				
	}
	
	
	
	

}
