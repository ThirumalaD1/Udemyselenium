package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/");
	WebElement lap = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
	WebElement win = driver.findElement(By.xpath("//a[text()='Windows (0)']"));
	Actions act = new Actions(driver);
	act.moveToElement(lap).moveToElement(win).perform();
	
	
	
}
}
