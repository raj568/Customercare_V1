package adactinHotels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlinbingsearch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		String val=driver.findElement(By.id("sb_form_q")).getAttribute("title");
		String val1=driver.findElement(By.id("sb_form_q")).getAttribute("class");
		
		System.out.println("tooltip is"+val);
		System.out.println("tooltip is"+val1);
		
		Thread.sleep(3000);
		driver.quit();

	}
}
