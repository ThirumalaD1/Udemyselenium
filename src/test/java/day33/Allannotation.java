package day33;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Allannotation {
  @Test
  public void search() {
	  System.out.println("searchmethod");
  }
  @Test(priority = 1)
  public void Advsearch() {
	  System.out.println("advsearchmethod");
  }
  @BeforeMethod
  public void bm() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void aM() {
	  System.out.println("After method");
  }

  @BeforeClass
  public void bc() {
	  System.out.println("before class");
  }

  @AfterClass
  public void ac() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void bt() {
	  System.out.println("before test");
  }

  @AfterTest
  public void at() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void bS() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void aS() {
	  System.out.println("after suite");
  }

}
