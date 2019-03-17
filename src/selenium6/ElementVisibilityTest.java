package selenium6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/register/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean b1=driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1);//true
		//2.isEnabled();
		boolean b2=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);
		//3.how enabled just click on check box;
		driver.findElement(By.name("agreeTerms")).click();
		boolean b3=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);
		//4.isSelected -method only applicable for check box,radio buttons and drop drown
		boolean b4=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);
		
		
		
		
		

	}

}
