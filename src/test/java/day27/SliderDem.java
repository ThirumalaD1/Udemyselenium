package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDem {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	driver.manage().window().maximize();

	
	Actions act = new Actions(driver);
	WebElement min = driver.findElement(By.xpath("//span[1]"));
	
	System.out.println("The current location before moving"+min.getLocation());
	
	act.dragAndDropBy(min, 100, 250).perform();
	System.out.println("The current location after moving"+min.getLocation());
	
	WebElement max = driver.findElement(By.xpath("//span[2]"));
	System.out.println("The current location before moving"+max.getLocation());
	
	act.dragAndDropBy(max, -300, 250).perform();
	System.out.println("The current location after moving"+max.getLocation());
}
}
