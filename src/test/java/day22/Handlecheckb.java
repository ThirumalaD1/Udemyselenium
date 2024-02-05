package day22;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckb {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	List<WebElement> check = driver.findElements(By.xpath("//input[@class='form-check-input'and@type='checkbox']"));
	System.out.println(check.size());
	/*for (int i = 0; i < check.size(); i++) {
		check.get(i).click();
	}
	
	for (WebElement chec : check) {
		chec.click();
	}
	
	//select first two checkbox
	
	for (int i = 0; i < 2; i++) {
		check.get(i).click();
	}
	//Last two checkbox
	for (int i = 5; i < check.size(); i++) {
		check.get(i).click();
	}
	//Using condition do the last two checkbox
	for (int i = 0; i < check.size(); i++) {
	if (i>4) {
		check.get(i).click();
	}*/
	
	for (int i = 0; i < 3; i++) {
		check.get(i).click();
	}
	Thread.sleep(7000);
/*	//Unclear/uncheck the selected checkbox
	for (int i = 0; i < check.size(); i++) {
		if (check.get(i).isSelected()) {
			check.get(i).click();
		}
	}
	*/
	for (WebElement ch : check) {
		if (ch.isSelected()) {
			ch.click();
		}
	}
	
	
	
		
}

	
	
	
}

