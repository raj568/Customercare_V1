package adactinHotels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Msntest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.msn.com/");
		wd.manage().window().maximize();
		wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wd.findElement(By.linkText("MONEY")).click();
		wd.findElement(By.linkText("Follow")).click();
		Thread.sleep(3000);
		wd.quit();

	}

}
