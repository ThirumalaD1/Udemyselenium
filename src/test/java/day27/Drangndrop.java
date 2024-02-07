package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drangndrop {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	WebElement rome = driver.findElement(By.xpath("//div[text()='Rome'][@id='box6']"));
	WebElement italy = driver.findElement(By.xpath("//div[text()='Italy'][@class='dragableBoxRight']"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(rome, italy).perform();



WebElement washington = driver.findElement(By.xpath("//div[text()='Washington'][@id='box3']"));
WebElement us = driver.findElement(By.xpath("//div[text()='United States'][@id='box103']"));

act.dragAndDrop(washington, us).perform();

WebElement madrid = driver.findElement(By.xpath("//div[text()='Madrid'][@id='box7']"));
WebElement spain = driver.findElement(By.xpath("//div[text()='Spain'][@id='box107']"));
act.dragAndDrop(madrid, spain).perform();


WebElement copen = driver.findElement(By.xpath("//div[text()='Copenhagen'][@id='box4']"));
WebElement denmark = driver.findElement(By.xpath("//div[text()='Denmark'][@id='box104']"));
act.dragAndDrop(copen, denmark).perform();

WebElement oslo = driver.findElement(By.xpath("//div[text()='Oslo'][@id='box1']"));
WebElement nor = driver.findElement(By.xpath("//div[text()='Norway'][@id='box101']"));

act.dragAndDrop(oslo, nor).perform();










}
}
