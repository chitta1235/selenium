package selenium6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PageCount {
	public static void main(String[] args){

    WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("pabitra");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("btnK")).click();
		

     List<WebElement> links = driver.findElements(By.tagName("a"));

     System.out.println(links.size());

       for (int i = 1; i<=links.size(); i=i+1){



System.out.println(links.get(i).getText());
}
		 
// System.out.println(getPageInnerText(driver));
//System.out.println(getScrollPageDown(driver));
	//}
	//public static String getPageInnerText(WebDriver driver){
		//JavascriptExecutor js=((JavascriptExecutor)driver);
		//String pageText=js.executeScript("return document.documentElement.innerText;").toString();
		//return pageText;
		
		
	//}
	//public static void getScrollPageDown(WebDriver driver){
		//JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
 

