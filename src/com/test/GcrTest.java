package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GcrTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
