 package PageClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class TestFrame {
	public TestFrame() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[@class='demo-frame']")
	public WebElement iframeElement;
	
	
	@FindBy(xpath="")
	public List<WebElement> roller;
	
	
	
	
	public void blabla() {
		
		
		for(WebElement eachItem:roller) {
			
		}
		
		
	}
	
	
	
	
	
	
}
