package day23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestdropdown {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");;
	List<WebElement> listse = driver.findElements(By.xpath("//li[@jsaction='click:.CLIENT;mouseover:.CLIENT']//div[@class='wM6W7d']//span"));
	
	System.out.println(listse.size());
	
	for (int i = 0; i < listse.size(); i++) {
		String li = listse.get(i).getText();
		System.out.println(li);
		if (li.equals("selenium rich foods")) {
			listse.get(i).click();
			break;
		}
		
	}
	
	
	
}
}
