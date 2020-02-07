package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		WebElement fr=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fr);
		driver.findElement(By.id("datepicker")).click();
		//driver.findElement(By.linkText("25")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		driver.findElement(By.linkText("27")).click();
		Thread.sleep(6000);
		driver.quit();


		
	}

}
