package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static WebDriver driver;

	public static WebDriver getDriver() {

		if (driver == null) {
//hello, change me
			switch (testDataReader.getProperty("browser")) {

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.get(testDataReader.getProperty("url"));
				// Using get() method to open a webpage
				driver.manage().window().maximize();

				break;
			case "chrome":
				// WebdriverManager is the dependency coming from POM.xml
				WebDriverManager.chromedriver().setup();
				// we declare the driver to Chrome driver (Poly.)
				driver = new ChromeDriver();
				// Test Data reader ( property file reader ) -- the "url" is coming from
				// property file
				Driver.getDriver().get(testDataReader.getProperty("urlamazon"));
				Driver.getDriver().manage().window().maximize();
				// initializes the pages by calling the method
				PageInitializer.initialize();

				break;
			case "ie/safari":
				// code

				break;
			case "headless":
				// code

				break;
			} // switch

			
			
		} // if else
		
		

		return driver;
	} // end of getDriver method

	public static void quitDriver() {
		if (driver != null) {
			driver.close();
			driver = null;
		}
	}

} // end of class
