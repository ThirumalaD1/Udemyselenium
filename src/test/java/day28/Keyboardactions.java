package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://text-compare.com/");
	driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("Ramkumar");
	Actions act = new Actions(driver);
	//Control a to select all
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	//Control c to copy text
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	//move to next field using tab
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	//act.sendKeys(Keys.TAB).perform();
	//control v to paste
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	
	
	
	
	
}
}
