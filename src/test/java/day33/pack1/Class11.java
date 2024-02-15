package day33.pack1;

import org.testng.annotations.*;

public class Class11 {
    @Test(priority=1)
	void abc() {
	System.out.println("abc from class1");
	
}
@BeforeTest    
void bt() {
	System.out.println("This is before test");
}
@BeforeSuite
void bs() {
	System.out.println("This is before suit");
}
@AfterSuite
void af() {
	System.out.println("This is after suit");
}


}
