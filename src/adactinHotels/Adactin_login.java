package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Adactin_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://adactin.com/HotelAppBuild2/");
		wd.findElement(By.id("username")).sendKeys("Anilkumar123");
		wd.findElement(By.id("password")).sendKeys("Anilkumar123");
		wd.findElement(By.id("login")).click();
		Thread.sleep(6000);
		wd.quit();
	}

}
