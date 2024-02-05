package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Handledropwithoutselecttag {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label[@class='checkbox']"));
	
	options.size();
	
	/*for (int i = 0; i < options.size(); i++) {
	System.out.println(options.get(i).getText());
	}*/
	
	for (int i = 0; i < options.size(); i++) {
		String optext = options.get(i).getText();
		if (optext.equals("Java")||optext.equals("C#")) {
			options.get(i).click();
		}
		
	}
	
	
	
	
}
	
	
	
}
