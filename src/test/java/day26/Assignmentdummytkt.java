package day26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentdummytkt {
	
	
	
	public static void selectdate(WebDriver driver,String Month,String Year, String Date) {
		WebElement mon = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select se = new Select(mon);
		se.selectByVisibleText(Month);
		WebElement yr = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select se2 = new Select(yr);
		se2.selectByVisibleText(Year);
		List<WebElement> dat = driver.findElements(By.xpath("//td/a"));
		for (int i = 0; i < dat.size(); i++) {
			if (dat.get(i).getText().equals(Date)) {
				dat.get(i).click();
				break;
			}
		}
	}

		
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.dummyticket.com/");
	driver.findElement(By.linkText("Buy Ticket")).click();
	//List<WebElement> applica = driver.findElements(By.xpath("//li[contains(@class,'product-item')]"));
	driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Ramuji");
	driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("l");
	WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
	dob.click();
	selectdate(driver, "Mar", "1997", "10");	
driver.findElement(By.xpath("//label[@for='sex_1']")).click();
driver.findElement(By.xpath("//input[@name='addmorepax']")).click();
driver.findElement(By.xpath("//span[@id='select2-addpaxno-container']")).click();
/*List<WebElement> addi = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));
for (int i = 0; i < addi.size(); i++) {
	if (addi.get(i).getText().equals("add 3 more passengers (300%)")) {
		addi.get(i).click();
		break;
	}
}*/
driver.findElement(By.xpath("//label[normalize-space()='Round trip']")).click();
driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Chennai");
driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Bangalore");
WebElement depato = driver.findElement(By.xpath("//input[@id='departon']"));
depato.click();
selectdate(driver, "Feb", "2024", "15");

WebElement returns = driver.findElement(By.xpath("//input[@id='returndate']"));
returns.click();
selectdate(driver, "Feb", "2024", "20");
driver.findElement(By.xpath("//a[normalize-space()='7']")).click();
driver.findElement(By.xpath("//label[normalize-space()='WhatsApp']")).click();
driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("Raju exports");
driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("9940458719");
driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("abcde@gmail.com");
//driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();
driver.findElement(By.name("billing_address_1")).sendKeys("13646 ABC");
driver.findElement(By.name("billing_city")).sendKeys("HYD");

//driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click();


WebElement state = driver.findElement(By.xpath("//select[@name='billing_state']"));
Select sel5 = new Select(state);
sel5.selectByVisibleText("Tamil Nadu");
driver.findElement(By.id("billing_postcode")).sendKeys("500090");
driver.findElement(By.xpath("//button[text()='Place order']")).click();
Thread.sleep(5000);
String act_title = driver.getTitle();
System.out.println(act_title);
if (act_title.equals("Payment Page")) {
 System.out.println("Test is passed");
}else {
	System.out.println("Test is failed");
}


}



}
