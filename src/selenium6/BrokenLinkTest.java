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

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("chitta123");
		driver.findElement(By.name("password")).sendKeys("ranjan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		driver.switchTo().frame("mainpanel");
		List<WebElement>linkslist=driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of full links and images--->"+linkslist.size());
		List<WebElement>activelinks=new ArrayList<WebElement>();
		for(int i=0;i<linkslist.size();i++){
			System.out.println(linkslist.get(i).getAttribute("href"));
			if(linkslist.get(i).getAttribute("href")!=null &&(!linkslist.get(i).getAttribute("href").contains("javascript"))){
				activelinks.add(linkslist.get(i));
			}
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
