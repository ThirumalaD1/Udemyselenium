package day24;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserwindows {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
Set<String> winids = driver.getWindowHandles();
/*	List<String> listwin = new ArrayList(winids);
	 String parent = listwin.get(0);
	 String child = listwin.get(1);
	driver.switchTo().window(child);
	System.out.println(driver.getTitle());
	driver.switchTo().window((parent));
	System.out.println(driver.getTitle());
	*/

for ( String setids : winids) {
	String ac_title = driver.switchTo().window(setids).getTitle();
	if (ac_title.equals("OrangeHRM HR Software | OrangeHRM")) {
		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_EmailHomePage\"]")).sendKeys("Ramesh");
	}
}
	
	
	
	
}	
}
