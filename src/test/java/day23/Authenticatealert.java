package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticatealert {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	String act_title = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
	String exp_tite = "Congratulations! You must have the proper credentials.";
	if (exp_tite.equals(act_title)) {
		System.out.println("Test is passed");
	}else {
		System.out.println("Test is failed");
	}
	
}
}
