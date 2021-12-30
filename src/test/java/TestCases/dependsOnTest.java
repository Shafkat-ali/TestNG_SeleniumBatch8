package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnTest {
	
	
	
	@Test(dependsOnMethods = { "initEnvironmentTest" })
	public void test1() {
		
	 System.out.println("this is test1 -- depends on initEnvironmentTest");
	}
	
	@Test
	public void test2() {
		 System.out.println("this is test2 -- independent");

	}
	
	@Test
	   public void initEnvironmentTest() {
	      System.out.println("This is initEnvironmentTest");
	      Assert.assertTrue(false);
	   }
	
	
	//  dependsOnMethods = { "initEnvironmentTest" }

}
