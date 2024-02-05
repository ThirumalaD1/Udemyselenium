package day22;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handledropdowns {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	driver.manage().window().maximize();
	
	WebElement dropcountry = driver.findElement(By.xpath("//select[@name='country']"));
	
	Select sele = new Select(dropcountry);
	//sele.selectByVisibleText("Brazil");
	//sele.selectByIndex(2);
	sele.selectByValue("3");
	
	List<WebElement> option = sele.getOptions();
	
	/*for (int i = 0; i < option.size(); i++) {
		String text = option.get(i).getText();
		System.out.println(text);
	}*/
	
	for (WebElement tex : option) {
		System.out.println(tex.getText());
	}
	
}
}
