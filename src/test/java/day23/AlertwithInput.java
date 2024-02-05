package day23;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertwithInput {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	WebDriverWait waita = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert prinput = waita.until(ExpectedConditions.alertIsPresent());
	System.out.println(prinput.getText());
	prinput.sendKeys("Thiru");
	prinput.accept();
	String exp_re = "You entered: Thiru";
	String re = driver.findElement(By.xpath("//p[@id='result']")).getText();
	
	
	if (re.equals(exp_re)) {
		System.out.println("Test is passed");
	}
	else {
	System.out.println("Test is failed");
	}
	}
}

