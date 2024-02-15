package day28;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsandtab {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.manage().window().maximize();

//to open other url in new tab
driver.get("https://text-compare.com/");
//to open other url in new tab
//driver.switchTo().newWindow(WindowType.TAB);
//to open other url in new window
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");




}


}
