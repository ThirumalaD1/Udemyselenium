package day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Purchasetickete2e {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://blazedemo.com/");
	
	WebElement frompo = driver.findElement(By.xpath("//select[@name='fromPort']"));
	
	Select sel = new Select(frompo);
	sel.selectByVisibleText("Boston");
	
	WebElement topo = driver.findElement(By.xpath("//select[@name='toPort']"));
	Select toport = new Select(topo);
	toport.selectByValue("Berlin");
	
	driver.findElement(By.xpath("//input[@value='Find Flights'][@type='submit']")).click();
	int columns = driver.findElements(By.xpath("//table/thead/tr/th")).size();
	int rows = driver.findElements(By.xpath("//table/tbody/tr")).size();
     String lop[]=new String[rows];
	for (int r = 1; r <=rows; r++) {
			String price = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[6]")).getText().replace("$", "");
			System.out.println(price);
			
				lop[r-1]= price;	
		}
	Arrays.sort(lop);
	String Lowprice="$"+lop[0];
	System.out.println("Lowest price: "+Lowprice);

	for (int r = 1; r <=rows; r++) {
		String price = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[6]")).getText();
		if (price.equals(Lowprice))
		{
			driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[1]")).click();
			break;
		
		}
	}
	//From
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Ramja");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Icehouse");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Tamilnadu");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("60007");
		WebElement cardtype = driver.findElement(By.xpath("//select[@id='cardType']"));
	Select selcard = new Select(cardtype);
	selcard.selectByVisibleText("Diner's Club");
	driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("50078669966666");
	driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("11");
	driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
	driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Ramja");
	driver.findElement(By.xpath("//input[@name='rememberMe'][@type='checkbox']")).click();
	driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	
	String Expected_text="Thank you for your purchase today!";
	String Actual_text = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
	if (Actual_text.equals(Expected_text)) {
		System.out.println("Test is passed");
	} else {
System.out.println("Test is failed");
	}
}
}
