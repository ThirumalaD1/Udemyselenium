package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locofelement {
public static void main(String[] args) {
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
	Actions act = new Actions(driver);
	System.out.println("Get location of logo before maximize"+logo.getLocation());
	
	driver.manage().window().maximize();
	System.out.println("Get location of logo after maximize"+logo.getLocation());
	
	driver.manage().window().minimize();
	System.out.println("Get location of logo Ater minimize"+logo.getLocation());

	driver.manage().window().fullscreen();
	System.out.println("Get location of logo Ater fullscreen"+logo.getLocation());
	
	Point p = new Point(100, 100);
	driver.manage().window().setPosition(p);
	System.out.println("Get location of logo Ater setting position"+logo.getLocation());
	
	
}
}
