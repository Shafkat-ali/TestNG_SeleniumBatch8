package TestCases;

import org.testng.annotations.*;

public class TestNG_AnnotationTasks {

	/*
	 * @BeforeGroups
	 * 
	 * @AfterGroups
	 * 
	 */
	
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after Suite");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after Method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is after Test");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is after Class");

	}

	
	@Test(priority=1)
	public void Apal() {
		System.out.println("this is Opal");

	}
	
	
	@Test(priority=3, timeOut = 5000)
	public void Darima() {
		System.out.println("this is Darima");

	}
	
	@Test(priority=2)
	public void Ariuna() {
		System.out.println("this is Ariuna");

	}
	
	
	
	@Test(enabled = true, priority=4)
	public void Dina() {
		System.out.println("this is Dina");
	}

	@Test(priority=1)
	public void Hannah() {
		System.out.println("this is Hannah");

	}
	
	
	
	//1. before class
	//2. before method
	//3. before test
	//TEST
	//4. after test 
	//5. after method
	//6. after class

}
