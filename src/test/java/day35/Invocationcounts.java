package day35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocationcounts {
    @Test(invocationCount = 15)
	void openapp() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login");
		driver.close();
		
	}
	
	
	
	
}
