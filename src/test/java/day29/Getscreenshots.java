package day29;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.swing.text.Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getscreenshots {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	/* WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	File logof = logo.getScreenshotAs(OutputType.FILE);
	File trg = new File("C:\\Users\\justi\\eclipse-workspace\\Udemyselenium\\src\\test\\resources\\screenshot\\logo.png");
	FileUtils.copyFile(logof, trg);
	*/
	
	TakesScreenshot tc=(TakesScreenshot)driver;
	File pg = tc.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\justi\\eclipse-workspace\\Udemyselenium\\src\\test\\resources\\screenshot\\logo1.png");
	
	FileUtils.copyFile(pg, dest);
	
	
	
	
}
}
