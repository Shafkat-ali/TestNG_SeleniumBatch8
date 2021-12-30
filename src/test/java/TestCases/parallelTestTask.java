package TestCases;

import org.testng.annotations.Test;

import Utilities.Driver;

public class parallelTestTask {

		
	@Test
	public void method1() {
		Driver.getDriver();
		System.out.print("method1");
	}

	@Test
	public void method2() {
		Driver.getDriver();
		System.out.print("method2");
	}

}
