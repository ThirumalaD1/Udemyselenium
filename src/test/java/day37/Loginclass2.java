package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginclass2 {
	public WebDriver driver;
	
	Loginclass2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	
		//Locators
	@FindBy(xpath="//input[@placeholder='Username']") WebElement usernl;
	
    @FindBy(xpath="//input[@placeholder='Password']") WebElement passl;
    @FindBy(xpath = "//button[normalize-space()='Login']") WebElement sub_b;
    @FindBy(xpath = "//img[@alt='company-branding']") WebElement logo;
	
	    
	    
	    //Actions
	    public void setusernam(String username) {
	    	usernl.sendKeys(username);
	    }
	public void setpass(String password) {
		passl.sendKeys(password);
	    }
	public void clicksub() {
		sub_b.click();
	}
	public boolean checklogpresence() {
		boolean status = logo.isDisplayed();
	return status;
	}	
}
