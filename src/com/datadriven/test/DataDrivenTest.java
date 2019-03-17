package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		Xls_Reader reader= new Xls_Reader("C:/Users/chittaranjan/workspace/Chitta6/src/com/testdata/CRMPRO.xlsx");
	    String  FirstName= reader.getCellData("RegTest","FirstName" , 2);
	    System.out.println(FirstName);
	    String  MiddleName= reader.getCellData("RegTest","MiddleName" , 2);
	    System.out.println(MiddleName);
	    String  LastName= reader.getCellData("RegTest","LastName" , 2);
	    System.out.println(LastName);
	    String  Nickname= reader.getCellData("RegTest","Nickname" , 2);
	    System.out.println(Nickname);
	    String  Company= reader.getCellData("RegTest","Company" , 2);
	    System.out.println(Company);
	    System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/"
				+ "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("chitta123");
		driver.findElement(By.name("password")).sendKeys("ranjan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		driver.switchTo().frame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@href='https://classic.crmpro.com/system/index.cfm?action=contact']")))
		.build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		driver.findElement(By.id("first_name")).sendKeys("FirstName");
		driver.findElement(By.id("middle_initial")).sendKeys("middleName");
		driver.findElement(By.id("surname")).sendKeys("lastName");
		driver.findElement(By.name("nickname")).sendKeys("nickname");
		driver.findElement(By.name("client_lookup")).sendKeys("Companyname");
	    
	}

}
