package selenium6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
	List<WebElement> list=	driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
	System.out.println("total number of suggestion:"+list.size());
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("java tutorial")){
			list.get(i).click();
			break;
		}
		

	}

	}
}

