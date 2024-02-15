package day31;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Writedataintoapp {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	driver.manage().window().maximize();
String fi = "C:\\Users\\justi\\eclipse-workspace\\Udemyselenium\\src\\test\\resources\\screenshot\\caldata.xlsx";
String fil = "C:\\Users\\justi\\eclipse-workspace\\Udemyselenium\\src\\test\\resources\\screenshot\\caldata.xlsx";
	int rows = Fileutils.rowcount(fi, "Sheet1");
	System.out.println(rows);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	for (int i = 1; i <=rows; i++) {
		String price = Fileutils.getdata(fi, "Sheet1", i, 0);
		String roi = Fileutils.getdata(fi, "Sheet1", i, 1);
		String period1 = Fileutils.getdata(fi, "Sheet1", i, 2);
		String period2 = Fileutils.getdata(fi, "Sheet1", i, 3);
		String freq = Fileutils.getdata(fi, "Sheet1", i, 4);
		String exp_value = Fileutils.getdata(fi, "Sheet1", i, 5);
		
		//set data into in the app
		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(price);
		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
		
		Select tenurep = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		tenurep.selectByVisibleText(period2);
		
		Select freq1 = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		freq1.selectByVisibleText(freq);
		
		WebElement calb = driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
		js.executeScript("arguments[0].click();", calb);
		
		String act_value = driver.findElement(By.xpath("//span[@id='resp_matval']/Strong")).getText();
		
		if (Double.parseDouble(act_value)==Double.parseDouble(exp_value)) {
			System.out.println("Test is passed");
			Fileutils.setCellData(fil, "Sheet1", i, 7, "Passed");
			
			
		}else {
			Fileutils.setCellData(fil, "Sheet1", i, 7, "Fail");
		}
		
		WebElement clear = driver.findElement(By.cssSelector("img[class='PL5']"));
		js.executeScript("arguments[0].click();",clear);
	}
	
	
	
}
}
