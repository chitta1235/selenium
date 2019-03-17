package selenium6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ReadProfile {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
       Properties prop=new Properties();
       FileInputStream ip=new FileInputStream("C:/Users/chittaranjan/workspace/Chitta6/src/selenium6/config.properties");
       prop.load(ip);
       System.out.println(prop.getProperty("name"));
       System.out.println(prop.getProperty("age"));
       
      String url= prop.getProperty("url");
      System.out.println(url);
     String browserName= prop.getProperty("browser");
     System.out.println(browserName);
     if(browserName.equals("chrome")){
    	 System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/chromedriver.exe");
 		 driver=new ChromeDriver();
     }
     else if(browserName.equals("FF")){
    	 driver=new FirefoxDriver();
    	 
     }
     driver.get(url);
     driver.findElement(By.xpath(prop.getProperty("Username_xpath"))).sendKeys(prop.getProperty("username"));
     driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("password"));
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    // driver.findElement(By.xpath(prop.getProperty("Enteryourpassword_xpath"))).sendKeys("Enteryourpassword");
     driver.findElement(By.xpath(prop.getProperty("Loginbtn_xpath"))).click();
     driver.switchTo().frame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(prop.getProperty("Contacts_xpath"))))
		.build().perform();
		driver.findElement(By.xpath(prop.getProperty("NewContacts_xapth"))).click();
		Select sel=new Select(driver.findElement(By.xpath(prop.getProperty("Title_xpath"))));
		sel.selectByVisibleText(prop.getProperty("Titlename"));
		driver.findElement(By.id(prop.getProperty("Firstname_id"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.id(prop.getProperty("Surname_id"))).sendKeys(prop.getProperty("surname"));
		driver.findElement(By.xpath(prop.getProperty("Savebtn_xpath"))).click();
		driver.close();
      
       

	}
	
		
	}


