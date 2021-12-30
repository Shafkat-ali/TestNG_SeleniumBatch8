package TestCases;

import java.util.Set;

import org.testng.annotations.*;

import Utilities.CommonMethods;
import Utilities.Driver;
import Utilities.testDataReader;

public class amazonTest123 extends CommonMethods {

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		Driver.getDriver();

	}

	@Test
	public void amazonTest() {

		
		
		amazonHomePage.signIn();
		
		
		CommonMethods.waitForVisibility(amazonHomePage.searchBox);
		
		amazonHomePage.searchItem(testDataReader.getProperty("item"));
	}

}
