package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.PrintStream;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClass.TestFrame;
import Utilities.Driver;

public class iFrame {

	TestFrame testframe = new TestFrame();


	
	@BeforeMethod
	public void setUp() {

		Driver.getDriver();

	}

	@Test(enabled=false)
	public void iframetest1() {

		// This will return the size of the Iframe
		System.out.println(Driver.getDriver().findElements(By.className("demo-frame")).size());
		// This will switch to the index of iframe ( In order to do some action in iframe you have to 
		//switch in it )
		Driver.getDriver().switchTo().frame(0);
		
		Actions action = new Actions(Driver.getDriver());
		
		WebElement source = Driver.getDriver().findElement(By.id("draggable"));
		WebElement target = Driver.getDriver().findElement(By.id("droppable"));
		
		action.dragAndDrop(source, target);
		
		//it will take you out from iframe
		Driver.getDriver().switchTo().defaultContent();
	}
	
	
	@Test(groups = { "smokeTest" })
	public void iframeTest2() {
		System.out.println("This is coming from iFrame");
	}
}
