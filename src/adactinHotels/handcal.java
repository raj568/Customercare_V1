

package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handcal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().maximize();
		//WebElement fr=driver.findElement(By.className("demo-frame"));
		//driver.switchTo().frame(fr);
		driver.findElement(By.xpath("//*[@id='aa-leavingOn']")).click();
		//driver.findElement(By.xpath("//td[@class=' aa-highlight ui-datepicker-current-day']")).click();
		driver.findElement(By.linkText("31")).click();
		
		Thread.sleep(6000);
		
	}

}
