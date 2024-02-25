package day33;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertionss {
    @Test
	void hardasser() {
		System.out.println("Testing1");
		System.out.println("Testing2");
		System.out.println("Testing3");
		
		Assert.assertEquals(2, 1);
		System.out.println("Test4");
		Assert.assertEquals(1, 1);
		System.out.println("HardAssertcompletion");
	}
	@Test
	void softassert(){
		System.out.println("Test1");
		System.out.println("Test2");
		System.out.println("Test3");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);
		System.out.println("Softassertcompleted");
		sa.assertAll();
		
	}
	
}
