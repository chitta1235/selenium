package selenium6;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOfPage {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/"
      		+ "chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.get("https://www.google.com/");
      driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("binay");
      Thread.sleep(5000);
      driver.findElement(By.name("btnK")).click();
      List<WebElement> linklist= driver.findElements(By.tagName("a"));
      linklist.addAll(driver.findElements(By.tagName("img")));
      System.out.println("size of the all links and images----->"+linklist.size());
      List<WebElement> activelinks=new ArrayList<WebElement>();
      for(int i=0;i<linklist.size();i++){
    	  System.out.println(linklist.get(i).getAttribute("href"));
    	  if(linklist.get(i).getAttribute("href")!=null&&(!linklist.get(i).getAttribute("href").contains("javascript"))){
    	activelinks.add(linklist.get(i));
    	System.out.println("size of activeliks and imagees------> "+activelinks.size());
    	for(int j=0;j<activelinks.size();j++){
    		HttpURLConnection connection=(HttpsURLConnection ) new URL(activelinks.get(j).getAttribute("href")).openConnection();
    		connection.connect();
    		String response=connection.getResponseMessage();
    		connection.disconnect();
    		System.out.println(activelinks.get(j).getAttribute("href")+"------>"+response);
    	}
    		  
    		  
    	  }
      }
     
    	  
    	  
      }
      
      
	}


