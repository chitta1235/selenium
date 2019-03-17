package selenium6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowerWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Modeless Window')]")).click();
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentwindowid=it.next();
		System.out.println("parentwindowid:"+parentwindowid);
		String childwindowid=it.next();
		System.out.println("childwindowid:"+childwindowid);
		driver.switchTo().window(childwindowid);
		Thread.sleep(2000);
		System.out.println("childwindow popup title"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowid);
		Thread.sleep(20000);
		System.out.println("parentwindow title"+driver.getTitle());
		
		
	}

}
