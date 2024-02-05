package day21;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemetho {
public static void main(String[] args) throws MalformedURLException {
	WebDriver driver = new ChromeDriver();
//	URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//driver.navigate().to(myurl);
	
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().to("https://www.flipkart.com/");
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	
	
	
}
}
