package PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


import Utilities.Driver;
import Utilities.testDataReader;

public class AmazonHomePage {

	
	public AmazonHomePage(){
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement signInLink;

    @FindBy(id = "ap_email")
    public WebElement emailInput;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "ap_password")
    public WebElement passwordInput;

    @FindBy(id = "signInSubmit")
    public WebElement signInSubmit;
    
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	public WebElement searchBox;

	@FindBy(xpath = "//*[@id='nav-search-submit-button']")
	public WebElement searchButton;
	
    
    
    public void signIn() {

        signInLink.click();
        emailInput.sendKeys(testDataReader.getProperty("emailAmazon"));
        continueButton.click();
        passwordInput.sendKeys(testDataReader.getProperty("passwordAmazon"));
        signInSubmit.click();

    }
    
    
	public void searchItem(String item) {
		searchBox.clear();
		searchBox.sendKeys(item);
	}
	
}
