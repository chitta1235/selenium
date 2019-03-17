package selenium6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("http://jqueryui.com/droppable/");
		driver.get("https://www.cognizant.com/");
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//img[@class='cog-logo']")))
		.moveToElement(driver.findElement(By.xpath("//a[@id='Industries']")))
		.release()
		.build().perform();
		

	}

}
