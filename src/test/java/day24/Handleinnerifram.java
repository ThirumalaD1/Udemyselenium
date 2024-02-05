package day24;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleinnerifram {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	
	//frame1
	WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Mama");
	driver.switchTo().defaultContent();
	
	//Frame2
	WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Ramji");
	driver.switchTo().defaultContent();
	//Frame3
	WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Swami");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']")).click();
	List<WebElement> checks = driver.findElements(By.xpath("//span[@class='aDTYNe snByac n5vBHf OIC90c']"));
	for (int i = 0; i < checks.size(); i++) {
		if (checks.get(i).getText().equals("Form Autofilling")) {
			checks.get(i).click();
		}
		
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
    //Scroll down till the bottom of the page
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	driver.findElement(By.xpath("//span[text()='Choose']")).click();
 List<WebElement> drp = driver.findElements(By.xpath("//span[@class='vRMGwf oJeWuf']"));
 System.out.println(drp.size());
	
	for (WebElement we : drp) {
		System.out.println(we.getText());
	}
	
}
}


