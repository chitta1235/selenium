package selenium6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NakuriLogin {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/"
				+ "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[@id='login_Layer']/div")).click();
		driver.findElement(By.xpath("//input[@id='eLoginNew']"))
		.sendKeys("chitta.kuthar12@gmail.com");
		driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys("ranjan@123a");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'More')]")))
		.build().perform();
		
		

	}

}
