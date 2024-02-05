package day24;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebrowprac {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	
	WebElement search = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
	search.sendKeys("selenium");
	search.submit();
	List<WebElement> seres = driver.findElements(By.xpath("//div[@class='wikipedia-search-results']//a"));
	for (int i = 0; i < seres.size(); i++) {
		seres.get(i).click();
	}
	Set<String> windiss = driver.getWindowHandles();
	List<String> ids = new ArrayList(windiss);
	
	for (int i = 0; i < ids.size(); i++) {
		String act_ti = driver.switchTo().window(ids.get(i)).getTitle();
		if (act_ti.equals("Selenium disulfide - Wikipedia")) {
			String ti = driver.findElement(By.xpath("//h1//span[text()='Selenium disulfide']")).getText();
		System.out.println(ti);
		}else {
			driver.close();
		}
		
	}
	
	
	
	
	
 
 
 
}

}
