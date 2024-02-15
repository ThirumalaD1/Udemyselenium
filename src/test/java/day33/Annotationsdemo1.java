package day33;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationsdemo1 {
    @BeforeMethod
	void login() {
		System.out.println("Login");
	}
@Test(priority=1)	
void Search() {
		System.out.println("search");
	}
@Test(priority = 2)	
void Advsearch() {
	System.out.println("advsearch");
}
@AfterMethod
void logout() {
	System.out.println("logout");
}

	
	
	
	
	
}
