
package adactinHotels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlemousehover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://www.emirates.com/us/english/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-link='MANAGE']")).click();
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.xpath("//a[@data-link='MANAGE:Manage']"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(s).build().perform();
		driver.quit();
		

	}

}
