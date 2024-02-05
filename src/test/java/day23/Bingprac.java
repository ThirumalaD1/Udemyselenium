package day23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bingprac {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.bing.com/%3Fcc%3Din");
	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
	List<WebElement> lis = driver.findElements(By.xpath("//li[contains(@class,'sa_sg')]//span"));
	System.out.println(lis.size());
	for (int i = 0; i < lis.size(); i++) {
		String li = lis.get(i).getText();
		System.out.println(li);
		if (li.equals("selenium download")) {
			lis.get(i).click();	
			break;
		}
	}
}
}
