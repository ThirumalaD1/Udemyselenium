package day34;

import org.testng.annotations.Test;

public class Groupings {
	
	/*
	loginByEmail  - sanity & regression
	loginByfacebook - sanity
	loginBytwitter  - sanity

	signupbyemail - sanity & regression
	signupbyfacebook  - regression
	signupbytwitter  - regression

	paymentinrupees - sanity & regression
	paymentindollar - sanity  
	paymentReturnbyBank  - regression
	*/
	@Test(groups = {"sanity","regression"})
	void loginByEmail() {
		System.out.println("this is loginByEmail");
		
	}
	@Test(groups = {"sanity"})
	void loginByfacebook() {
		System.out.println("This is loginByfacebook");
	}
	@Test(groups={"sanity"})
	void loginBytwitter() {
		System.out.println("This is loginBytwitter");
	}
	@Test(groups={"sanity","regression"})
	void signupbyemail() {
		System.out.println("This is signupbyemail");
	}
	@Test(groups = {"regression"})
	void signupbyfacebook() {
		
		System.out.println("This is signupbyfacebook");
	}
	@Test(groups={"regression"})
	void signupbytwitter() {
		System.out.println("This is signupbytwitter");
	}
	@Test(groups={"sanity","regression"})
	void paymentinrupees() {
		System.out.println("This is paymentinrupees");
	}
	@Test(groups = {"sanity"})
	void paymentindollar() {
		System.out.println("This is paymentindollar");
	}
	@Test(groups = {"regression"})
	void paymentReturnbyBank() {
		System.out.println("This is paymentReturnbyBank");
	}
	

}
