package PageClass;

import java.util.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;
import Utilities.testDataReader;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "txtUsername")
	public WebElement userName;

	@FindBy(id = "txtPassword")
	public WebElement passWord;

	@FindBy(id = "btnLogin")
	public WebElement loginButton;

	public void login() {
		userName.sendKeys(testDataReader.getProperty("orangeUsername"));
		passWord.sendKeys(testDataReader.getProperty("orangePassword"));
		loginButton.click();
	}

}
