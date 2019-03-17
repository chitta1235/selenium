package selenium6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileLoadUpload {

	public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
	    driver.findElement(By.xpath("//a[@id='login_Layer']//div[contains(text(),'Login')]")).click();
	    driver.findElement(By.name("email")).sendKeys("chitta.kuthar12@gmail.com");
	    driver.findElement(By.name("PASSWORD")).sendKeys("ranjan@123a");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	 
	    
		//driver.findElement(By.id("uploadLink")).sendKeys("C:/Users/chittaranjan/Desktop");

	

}
}
