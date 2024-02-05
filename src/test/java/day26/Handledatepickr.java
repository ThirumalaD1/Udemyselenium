package day26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handledatepickr {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	//First approach
	//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/13/2024");
	
	//2nd approach
	
	String month="October";
	String year="2024";
	String date="10";
	
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	while (true) {
		String mon = driver.findElement(By.xpath("//div/span[@class='ui-datepicker-month']")).getText();
		String yr = driver.findElement(By.xpath("//div/span[@class='ui-datepicker-year']")).getText();
		if (mon.equals(month)&&yr.equals(year))
		{
		break;	
		}
		driver.findElement(By.xpath("//div//a/span[@class='ui-icon ui-icon-circle-triangle-e'][text()='Next']")).click();
	}
	
	
	
	
	List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	for (int i = 0; i < alldates.size(); i++) {
		if (alldates.get(i).getText().equals(date)) {
			alldates.get(i).click();
			break;
		}
		
	}
	
	
	
	
	
}
}
