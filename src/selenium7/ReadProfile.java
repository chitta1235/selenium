package selenium7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadProfile {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream ip= new FileInputStream("C:/Users/chittaranjan/workspace/Chitta6/src/selenium7/com.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url=prop.getProperty("url");
		System.out.println(url);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/"
					+ "chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browserName.equals("FF")){
			driver=new FirefoxDriver();
			 
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("username_xapth"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("password_xapth"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("Loginbtn_xpath"))).click();
		driver.switchTo().frame("mainpanel");
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(prop.getProperty("contacts_xpath")))).build().perform();
		driver.findElement(By.xpath(prop.getProperty("newContacts_xpath"))).click();
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(int i=0;i<linklist.size();i++){
			String linktext=linklist.get(i).getText();
			System.out.println(linktext);
			
		}
		

	}

}
