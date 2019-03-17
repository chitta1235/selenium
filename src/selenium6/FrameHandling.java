package selenium6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("chitta123");
		driver.findElement(By.name("password")).sendKeys("ranjan");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[@href='https://www.freecrm.com/index.cfm?logout=1']")).click();
		driver.close();
	}

}
