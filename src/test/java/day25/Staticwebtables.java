package day25;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticwebtables {
	
	
	
	
	
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	// 1) Find total number of rows 
	int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println(rows);
	//2) Find total number of columns
	int column = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	System.out.println(column);
	//3) Read specific row & column data
	for (int c = 1; c <= column; c++) {
		String specrowco = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]/td["+c+"]")).getText();
		//System.out.print(specrowco+"   ");
	}
	
	/*
	//4) Read data from all the rows & columns
	System.out.println("Bookname     Author     Subject   Price");
	for (int r = 2; r<=rows; r++) {
		for (int c = 1; c <=column; c++) {
		 String rowscol = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
		  System.out.print(rowscol+"   ");
			
		}
		System.out.println();
	}
	*/
	//5) Print book names whose author is Amit
	for (int r = 2; r<=rows; r++) {
		String authors = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
		if (authors.equals("Amit")) {
			String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
			//System.out.println(book);
		}
		
	}
	
	//6)Find sum of prices for all the books
	for (int r = 2; r <=rows; r++) {
		String pri = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
		System.out.println(pri);
	}
	
	
	
	
	
	
	
	
	
	
}
}
