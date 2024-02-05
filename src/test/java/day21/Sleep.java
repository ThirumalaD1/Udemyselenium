package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleep {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	

}
}
