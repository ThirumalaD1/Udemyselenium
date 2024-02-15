package day31;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import day21.Explicitlywait;

public class Assignmentcddatadriven {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

	driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
	driver.manage().window().maximize();
	String fi = System.getProperty("user.dir")+"\\src\\test\\resources\\screenshot\\caldata2.xlsx";
	JavascriptExecutor js=(JavascriptExecutor)driver;
	int row = Fileutils.rowcount(fi, "Sheet1");
	
	WebElement dpf = driver.findElement(By.cssSelector("#mat-input-0"));
	WebElement mon = driver.findElement(By.cssSelector("#mat-input-1"));
	WebElement roi = driver.findElement(By.cssSelector("#mat-input-2"));
	WebElement calbutton = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']"));
	
	
	for (int i = 1; i <=row; i++) {
		String initdepo = Fileutils.getdata(fi, "Sheet1", i, 0);
		String len = Fileutils.getdata(fi, "Sheet1", i, 2);
		String ri = Fileutils.getdata(fi, "Sheet1", i, 1);
		String comp = Fileutils.getdata(fi, "Sheet1", i, 3);
		String exp_v = Fileutils.getdata(fi, "Sheet1", i, 4);
	
	
	dpf.clear();
	mon.clear();
	roi.clear();
	
	Thread.sleep(3000);
	
	dpf.sendKeys(initdepo);
	mon.sendKeys(len);
	roi.sendKeys(ri);
	
 driver.findElement(By.xpath("//mat-select")).click();

 //js.executeScript("arguments[0].click();", dpbut);
	List<WebElement> options = driver.findElements(By.xpath("//mat-option/span"));
	for (int j = 0; j < options.size(); j++) {
		
		if (options.get(j).getText().equals(comp)) {
			options.get(j).click();
		}
		
	}
	
	//mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']"))).click(); 
	//driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
	//js.executeScript("arguments[0].scrollIntoView();", calbutton);
	//js.executeScript("window.scrollBy(0,3000)","");
	
	Thread.sleep(5000);
	calbutton.click();
	String act_v = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
	
	if (act_v.equals(exp_v)) {
		
	System.out.println("Test is passed");
	Fileutils.setCellData(fi, "Sheet1", i, 6, "Passed");
		
	} else {
		Fileutils.setCellData(fi, "Sheet1", i, 6, "Failed");
	}
	
	
	}
	
	
	
	
	
}
}
