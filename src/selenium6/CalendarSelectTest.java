package selenium6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("chitta123");
		driver.findElement(By.name("password")).sendKeys("ranjan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		driver.switchTo().frame("mainpanel");
		String date="15-February-2019";
		String dateArr[]=date.split("-");
		String day= dateArr[0];
		String month= dateArr[1];
		String year= dateArr[2];
		
		Select select =new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		Select select1=new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		
		//Break xpath
		
		String beforeXpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXapth="]/td[";
		
		final int totalWeekdays=7;
		boolean flag=false;
		for(int rowNum=2;rowNum<=6;rowNum++){
			for(int colNum=1;colNum<=totalWeekdays;colNum++){
				String dayVal=driver.findElement(By.xpath(beforeXpath+rowNum+afterXapth+colNum+"]")).getText();
				System.out.println(dayVal);
				if(dayVal.equals(day)){
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXapth+colNum+"]")).click();
					flag=true;
					break;
					
				}
			}
			if(flag){
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
