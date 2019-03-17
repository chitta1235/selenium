package selenium6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SOFTWARE/chromedriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();//click on go btn
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();//handle  javascripts popup
		System.out.println(alert.getText());
		//validation
		String Text=alert.getText();
		if(Text.equals("Please enter a valid user name")){
			System.out.println("correct alert message");
		}
		else{
			System.out.println("incorrect alert message");
		}
		alert.accept();//click on ok btn
//		alert.dismiss();
		//driver.close();
		

	}

}
