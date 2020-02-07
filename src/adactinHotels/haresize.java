package adactinHotels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class haresize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS );
		WebElement fr=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fr);
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.cssSelector(".ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
		a.clickAndHold(source).moveByOffset(150,150).release().build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
