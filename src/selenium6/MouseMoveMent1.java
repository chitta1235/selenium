package selenium6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseMoveMent1 {

	public static void main(String[] args) throws InterruptedException {
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
		Select sel=new Select(driver.findElement(By.xpath("//select[@name='title']")));
		sel.selectByVisibleText("Mr.");
		driver.findElement(By.id("first_name")).sendKeys("binay");
		driver.findElement(By.id("surname")).sendKeys("muduli");
		driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		

	}

}
