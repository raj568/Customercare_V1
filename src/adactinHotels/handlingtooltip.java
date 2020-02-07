package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingtooltip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(s);
		String val=driver.findElement(By.id("age")).getAttribute("title");
		System.out.println("tooltip is"+val);
		Thread.sleep(3000);
		driver.quit();

	}

}

