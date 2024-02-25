package day33;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionss {
  @Test
  public void hardf() {
	  int x=10;
	  int y=11;
	  
	  if (x==y) {
		System.out.println("Test passed");
	} else {
System.out.println("Test failed");
	}
	  //Assert.assertTrue(false);
	  //Assert.assertEquals(x,y);
	  
	  int a=10;
	  int b=11;
	  //Assert.assertEquals(actual,expected,"description");
	//Assert.assertEquals(a>b,true,"a is not greater than b");
	  
	  
	  
	  String c="Thiru";
	  String d="Thirud1";
	  
	  //Assert.assertEquals(c,d,"string not equal");
	 // Assert.assertEquals(c!=d, true);
	  
	 if (false) {
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(false);
		
	}
	  
	  
	  
	  
	  
	  
	  
  }
}
