package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
//	@Test
//	public void googleTitleTest(){
//		String title=driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals(title, "Google");
//	}
//	@Test()
//	public void googleLogoTest(){
//		boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
//		Assert.assertTrue(b);
//	}
////	@Test(priority=1)
////	public void mailLinkTest(){
////		boolean b=driver.findElement(By.linkText("Mail")).isDisplayed();
////	}
//	@AfterMethod
//	public void tearDown(){
//		driver.quit();
//	}

}
