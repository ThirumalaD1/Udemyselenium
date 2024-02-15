package day32;

import org.testng.annotations.Test;

public class Firsttestngk {
  @Test(priority=1)
  public void openapp() {
	System.out.println("Testing1");  
	  
	  
  }
  @Test(priority=2)
public void login() {
	  
	  System.out.println("testing2");
	  
  }
 @Test (priority = 3)
public void logout() {
	  
	  System.out.println("Testing3");
	  
}
  
  
  
}
