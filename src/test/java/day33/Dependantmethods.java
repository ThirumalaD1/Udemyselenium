package day33;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Dependantmethods {
    @Test(priority = 1)
	void openapp() {
		System.out.println("open app");
		Assert.assertTrue(true);
	}
	@Test(priority = 2,dependsOnMethods = {"openapp"})
	void login() {
		//Assert.assertTrue(true);
		System.out.println("login");
	}
	@Test(priority = 3,dependsOnMethods = {"login"})
	void search() {
		Assert.assertTrue(false);
		System.out.println("search");
	}
    @Test(priority=4,dependsOnMethods = {"search"})
	void search1() {
		System.out.println("search1");
	}
	
	
	@Test(priority = 5,dependsOnMethods = {"login","search1"})
	void advsearch() {
		System.out.println("adv search");
	}
	@Test(priority = 6, dependsOnMethods = "login")
	void logout() {
		System.out.println("logout");
	}
	
	
	
	
}
