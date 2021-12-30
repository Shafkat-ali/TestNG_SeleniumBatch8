package Utilities;

import PageClass.AmazonHomePage;
import PageClass.CommenElementPage;
import PageClass.DashboardPage;
import PageClass.HomePage;
import PageClass.TestFrame;

public class PageInitializer extends Driver{
	
	
	public static HomePage homepage;
	public static TestFrame test;
	public static DashboardPage dashPage;
	public static CommenElementPage comElPage;
	public static AmazonHomePage amazonHomePage;
	public static ExcelMethods excelMethods;
	
	
	public static void initialize() {
		homepage = new HomePage();
		test = new TestFrame();
		dashPage = new DashboardPage();
		comElPage = new CommenElementPage();
		amazonHomePage = new AmazonHomePage();
		excelMethods = new ExcelMethods();
	}
	
	
	
	
	
	
	
	

}
