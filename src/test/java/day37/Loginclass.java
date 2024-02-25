package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginclass {
public WebDriver driver;
	
Loginclass(WebDriver driver) {
	this.driver=driver;
}
	//Locators
By usename = By.xpath("//input[@placeholder='Username']");
By passw = By.xpath("//input[@placeholder='Password']");
By sub_btn = By.xpath("//button[normalize-space()='Login']");
    By logos=By.xpath("//img[@alt='company-branding']");
    
    
    //Actions
    public void setusernam(String username) {
    	driver.findElement(usename).sendKeys(username);
    }
public void setpass(String password) {
	driver.findElement(passw).sendKeys(password);
    }
public void clicksub() {
	driver.findElement(sub_btn).click();
}
public boolean checklogpresence() {
	boolean status = driver.findElement(logos).isDisplayed();
return status;
}	
	
}
