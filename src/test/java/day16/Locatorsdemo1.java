package day16;

public class Locatorsdemo1 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Open app
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // maximize browser window
		
		//search box
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		//search button
		driver.findElement(By.name("submit_search")).click();
		
		//link text & partial linktext
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Printed Chiffon")).click();
	

}
}
