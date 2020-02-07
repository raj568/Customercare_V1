package adactinHotels;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHyperlink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//driver.get("https://www.bing.com/account/general?ru=https%3a%2f%2fwww.bing.com%2f&FORM=O2HV65&id=language_section#language-section");
   driver.get("https://www.bing.com/");
		List<WebElement> val=driver.findElements(By.tagName("a"));
		int len=val.size();
		for(int i=0;i<len;i++)
			System.out.println( val.get(i).getText());
		Thread.sleep(5000);
		driver.quit();

	}

}
