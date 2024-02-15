package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingwithelementsusingJs {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement firstname = driver.findElement(By.xpath("//input[@id='name']"));
	js.executeScript("arguments[0].setAttribute('value','Rajesh')", firstname);
	
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	js.executeScript("arguments[0].setAttribute('value','trd@gmail.com')", email);
	
	WebElement phn = driver.findElement(By.xpath("//input[@id='phone']"));
	js.executeScript("arguments[0].setAttribute('value','9967896554')", phn);
	
	WebElement addres = driver.findElement(By.xpath("//textarea[@id='textarea']"));
	//addres.sendKeys("No.4 swathan");
	js.executeScript("arguments[0].setAttribute('value','Thisssss')", addres);
	
	WebElement male = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
	js.executeScript("arguments[0].click()", male);
	
	WebElement chkmon = driver.findElement(By.xpath("//label[normalize-space()='Monday']"));
	js.executeScript("arguments[0].click()", chkmon);
	
	Thread.sleep(5000);
	driver.quit();
	
	
	
}
}
