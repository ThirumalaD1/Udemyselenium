package day35;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Paramtest {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	void loginsetup(String br, String ur) {
		if (br.equals("chrome")) {
			driver = new ChromeDriver();	
		}else if (br.equals("edge")) {
		driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(ur);
		driver.manage().window().maximize();
	}
	@Test
	void logotest() throws IOException  {
		try {
			boolean logos = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")).isDisplayed();
			Assert.assertEquals(logos, true);	
		} catch (Exception e) {
			Assert.fail();
		}	
		
	}
	@Test
	void hmtitle() {
		String act_tit = driver.getTitle();
		Assert.assertEquals(act_tit, "OrangeHRM");
	}
	@AfterClass
	void clo() {
		driver.close();
	}
	
}
