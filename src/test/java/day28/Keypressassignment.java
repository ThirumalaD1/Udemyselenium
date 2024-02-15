package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keypressassignment {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/key_presses");
	WebElement textfi = driver.findElement(By.xpath("//input[@id='target']"));
	
	//Actions act = new Actions(driver);
	textfi.sendKeys(Keys.ALT);
	Thread.sleep(5000);
	textfi.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	textfi.sendKeys(Keys.ESCAPE);
	Thread.sleep(5000);
	textfi.sendKeys(Keys.SHIFT);
	Thread.sleep(5000);
	textfi.sendKeys(Keys.SPACE);
	Thread.sleep(5000);
	textfi.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(5000);
	textfi.sendKeys(Keys.CONTROL);



}


}
