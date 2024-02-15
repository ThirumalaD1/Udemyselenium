package day29;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broklinks {

	public static void main(String[] args) throws IOException  {
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("http://www.deadlinkcity.com/");
int brokenliks=0;
List<WebElement> links = driver.findElements(By.tagName("a"));

for (int i = 0; i < links.size(); i++) {
	
	String href = links.get(i).getAttribute("href");
	
	if (href==null || href.isEmpty()) {
		System.out.println("href is empty");
		continue;
	}
	
 URL lik=new URL(href);
	
	HttpURLConnection htt = (HttpURLConnection) lik.openConnection();
	htt.connect();
	
	if (htt.getResponseCode()>=400) {
		System.out.println(href+"Its an broken link");
	brokenliks++;
	}
	else {
		System.out.println(href+"Its an working link");
	}
	
}



 System.out.println(brokenliks);
	}
	
	
}
