package adactinHotels;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingsearchelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("sb_form_q")).sendKeys("steve");
		Thread.sleep(3000);
		 List<WebElement> val= driver.findElements(By.xpath("//li[@class='sa_sg']"));
		 for(int i=0;i<val.size();i++)
			 System.out.println(val.get(i).getText());
		 driver.quit();
		

	}

}
