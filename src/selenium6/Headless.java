package selenium6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Headless {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("window-size=1400,800");
		 options.addArguments("headless");
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.get("https://www.google.com/");
				System.out.println("page title is:"+driver.getTitle());
		

	}

}
