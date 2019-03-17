package selenium6;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.WrapsElement;

public class CrmProPageCheck {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/"
			+ "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("charu");
	Thread.sleep(3000);
	driver.findElement(By.name("btnK")).click();
	List<WebElement> linklist=driver.findElements(By.tagName("a"));
	linklist.addAll(driver.findElements(By.tagName("img")));
	System.out.println("size of full linka and image---->"+linklist.size());
	List<WebElement> activelinks=new ArrayList<WebElement>();
	for(int i=0;i<linklist.size();i++){
		System.out.println(linklist.get(i).getAttribute("href"));
		if(linklist.get(i).getAttribute("href")!=null &&(linklist.get(i).getAttribute("href").contains("javascript")));
		activelinks.add(linklist.get(i));
	}
	System.out.println("size of the activelinks and image----->"+activelinks.size());
	for(int j=0;j<activelinks.size();j++){
		HttpURLConnection connection=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response=connection.getResponseMessage();
		System.out.println(activelinks.get(j).getAttribute("href")+"------>"+response);
	}
	
	
}
	
	

	}
	


