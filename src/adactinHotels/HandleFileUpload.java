package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://html.com/input-type-file/");
		//wd.get("https://www.msn.com/en-in/weather/today/new-delhidelhiindia/we-city?iso=IN&el=LCSOtmrltA1MYWAgFElBFQ%3d%3d");
		wd.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\Nitu_Diku\\Desktop\\craiglist.png");
		//wd.findElement(By.xpath("//button[contains(text),submit]")).click();
//wd.findElement(By.linkText("submit")).click();
		//wd.findElement(By.xpath("//input[@type='submit']")).click();
	
		Thread.sleep(3000);
		wd.quit();
	}

}
