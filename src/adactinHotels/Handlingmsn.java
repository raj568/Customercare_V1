package adactinHotels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingmsn {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		driver.get("https://www.msn.com/en-us");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Amazon.com");
		Thread.sleep(3000);
		driver.quit();


	}

}
