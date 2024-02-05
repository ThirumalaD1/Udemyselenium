package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclickk {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	driver.switchTo().frame("iframeResult");
	WebElement textbox1 = driver.findElement(By.id("field1"));
	textbox1.clear();
	textbox1.sendKeys("Raghuram");
	String value1 = textbox1.getAttribute("value");
	WebElement clicbutton = driver.findElement(By.xpath("//button[text()='Copy Text']"));
	Actions act = new Actions(driver);
	act.doubleClick(clicbutton).build().perform();
	
	WebElement textbox2 = driver.findElement(By.id("field2"));
	String value2 = textbox2.getAttribute("value");
	
	if (value1.equals(value2)) {
		System.out.println("Test is passed");
		
	}else {
		System.out.println("Test is failed");
	}
	
	
	
	
}
}
