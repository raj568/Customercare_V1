package adactinHotels;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertpopuphandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		//wd.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS );
		wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		wd.manage().window().maximize();
		
		
		
		wd.findElement(By.name("proceed")).click();
		new WebDriverWait(wd,30).until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		 Alert alert=wd.switchTo().alert();
		
		//by using alert Api using switchTo.alert()method we can access the alert.
		
		System.out.println(alert.getText());  //by using alert.getText() we can read text from alert.
		
		String text =alert.getText();
		
		if(text.equals("Please enter a valid user name"))
		System.out.println("correct alert msg");
		else
			System.out.println("invalid alert");
		alert.accept();
		Thread.sleep(5000);
		wd.quit();// click on ok button
		//alert.dismiss() to cancel the alert
			
		
	}

}
