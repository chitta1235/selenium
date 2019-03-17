package selenium6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchBrower {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		

	}

}
