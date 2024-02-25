package day37;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
//@Listeners(day37.Listenerss.class)
public class NewTest {
	public WebDriver driver;	
	//Loginclass log1;
	Loginclass2 log2;
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
		   driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(5000);
	  }

  @Test(priority = 1)
  public void logint() {
	  log2 = new Loginclass2(driver);
	  log2.setusernam("Admin");
	  log2.setpass("admin123");
	  log2.clicksub();
	  
	  String dash = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
	  Assert.assertEquals(dash,"Dashboard"); 
  }
  @Test()
 public void logosf() {
	 Assert.assertEquals(log2.checklogpresence(),true);;
	
 }
  
  
  @AfterClass
  public void afterClass() {
  driver.quit();
  }

}
