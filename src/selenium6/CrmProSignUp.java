package selenium6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CrmProSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/index.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		Select select=new Select(driver.findElement(By.xpath("//select[@id='payment_plan_id']")));
		select.selectByVisibleText("Free Edition");
		driver.findElement(By.name("first_name")).sendKeys("z");
		driver.findElement(By.name("surname")).sendKeys("q");
		driver.findElement(By.name("email")).sendKeys("chitta1234@gmail.com");
		driver.findElement(By.name("email_confirm")).sendKeys("chitta1234@gmail.com");
		driver.findElement(By.name("username")).sendKeys("baga1234");
		driver.findElement(By.name("password")).sendKeys("baga1234");
		driver.findElement(By.name("passwordconfirm")).sendKeys("baga1234");
		driver.findElement(By.name("agreeTerms")).click();
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.name("company_name")).sendKeys("TCS");
		driver.findElement(By.name("phone")).sendKeys("9674944159");
		driver.findElement(By.name("company_email")).sendKeys("chitta1234@gmail.com");
		Select select1=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		select1.selectByVisibleText("India");
		driver.findElement(By.name("btnSubmit")).click();
		
	
	}

}
