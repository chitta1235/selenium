package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures1 {
	@Test
	public void loginTest(){
		System.out.println("login Test");
	}
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest(){
		System.out.println("home page Test");
	}

}
