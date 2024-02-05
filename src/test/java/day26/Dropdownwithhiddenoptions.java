package day26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownwithhiddenoptions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][text()='PIM']")).click();

	//Dropwdown
	driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
	List<WebElement> list = driver.findElements(By.xpath("//div[@role='listbox']//span"));
	/*for (int i = 0; i < list.size(); i++) {
		if (list.get(i).getText().equals("QA Engineer")) {
			list.get(i).click();
			break;
		}
	}*/
	for (WebElement opt : list) {
		if (opt.getText().equals("QA Engineer")) {
			opt.click();
		}
	}
}
}
