package day28;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollwebpage {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	
	JavascriptExecutor js=driver;
	js.executeScript("window.scrollBy(0,5000)","");
	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	
	
	
}
}
