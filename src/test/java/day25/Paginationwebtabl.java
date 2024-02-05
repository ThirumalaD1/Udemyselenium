package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paginationwebtabl {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.opencart.com/admin/index.php");
	driver.manage().window().maximize();
	
	//Login
	
	WebElement username=driver.findElement(By.id("input-username"));
	username.clear();
	username.sendKeys("demo");  //demo
			
	WebElement password=driver.findElement(By.id("input-password"));
	password.clear();
	password.sendKeys("demo"); //demo
			
	driver.findElement(By.xpath("//button[text()=' Login']")).click();
	
	if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
	{
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
	}
	driver.findElement(By.xpath("//a[@class='parent collapsed'][text()=' Customers']")).click();
	driver.findElement(By.xpath("//li[5]/a[text()='Custom Fields']")).click();
	String pagenum = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
	String expage = pagenum.substring(pagenum.indexOf("(")+1, pagenum.indexOf("Pages")-1);
	System.out.println(pagenum);
	
}
}
