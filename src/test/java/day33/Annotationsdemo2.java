package day33;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationsdemo2 {
	@BeforeClass
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
@AfterClass
void logout() {
	System.out.println("logout");
}

}
