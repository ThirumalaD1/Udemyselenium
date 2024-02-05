package day23;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlealert {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	//Alert swa = driver.switchTo().alert();
	Alert ale = waits.until(ExpectedConditions.alertIsPresent());
	//Thread.sleep(5000);
	//swa.accept();
	//swa.dismiss();
	ale.accept();
	Thread.sleep(3000);
	//driver.quit();
	
}
}
