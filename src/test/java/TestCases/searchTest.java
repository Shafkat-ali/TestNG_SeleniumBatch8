//package TestCases;
//
//import org.testng.annotations.Test;
//import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import PageClass.HomePage;
//import Utilities.CommonMethods;
//import Utilities.Driver;
//import Utilities.testDataReader;
//
//public class searchTest extends CommonMethods {
//	
//		
//	@Test
//	public void task1() {
//		Driver.getDriver();
//		
//		
//		//1st one is taking the searchItem Method from HomePage class and passing the value from properties file
//		//homePage.searchItem(testDataReader.getProperty("searchKeyWord"));
//		
//		//2nd one, we are getting the searchBox Element and passing the String Key ourself
//		//homepage.searchBox.sendKeys("macbook");
//		
//	}
//	
//	@Test
//	public void usingCommonMethods() {
//		
//		CommonMethods.sendText(homepage.searchBox, testDataReader.getProperty("searchKeyWord"));
//		
//	
//		CommonMethods.getWaitObject().until(ExpectedConditions.visibilityOf(homepage.searchBox));
//		
//		CommonMethods.getJSObject().executeScript("window.scrollBy(0,600)");
//		
//
//		CommonMethods.wait(3);
//		
//		
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
