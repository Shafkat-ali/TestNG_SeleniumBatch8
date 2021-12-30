package PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class CommenElementPage {
	
	
	public CommenElementPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement adminTab;
	
	@FindBy(id="menu_admin_nationality")
	public WebElement nationalitiesTab;
	
	
	
	
	

}
