package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	@BeforeSuite
	public void setup(){
		System.out.println("setup property for chrome");
	}
	@BeforeTest
	public void launchBrower(){
		System.out.println("launchBrower");
	}
	@BeforeClass
	public void login(){
		System.out.println("login");
	}
	@BeforeMethod
	public void enterURL(){
		System.out.println("enterURL");
	}
	@Test
	public void googleTitleTest(){
		System.out.println("googleTitleTest");
	}
	@AfterMethod
	public void logout(){
		System.out.println("logout");
	}
	@AfterClass
	public void closeBrowser(){
		System.out.println("closeBrowser");
	}
	@AfterTest
	public void deleteAllcookies(){
		System.out.println("deleteAllcookies");
	}

}
