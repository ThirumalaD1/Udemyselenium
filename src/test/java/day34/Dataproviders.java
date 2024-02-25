package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {
  WebDriver driver;
	@BeforeClass
void openbrowser(){
		 driver = new ChromeDriver();
	}
	
	
	
	
	
	@Test(dataProvider = "dp")
	void logintest(String email, String pass) {
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		String act_ti = driver.getTitle();
		String exp_ti="nopCommerce demo store";
		
		Assert.assertEquals(act_ti, exp_ti);		
		
	}
	@DataProvider(name="dp")
	String[][] testd() {
	
		String data[][]= {{ "valentineb@gmail.com", "Testing1" }, 
				{ "pavanol@gmail.com", "test@123" },
				{ "valentineb@gmail.com.com", "test3" },
				{ "valentine@gmail.com", "Testing1" },
				{ "pavanoltraining@gmail.com", "test@123" }};
		return data;
		
	}
	
	
	
	
	@AfterClass
	void closeapp() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
