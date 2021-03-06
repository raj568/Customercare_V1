package adactinHotels;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.navigate().to("https://adactin.com/HotelAppBuild2/");
		driver.get("https://adactin.com/HotelAppBuild2/");
		WebElement wd= driver.findElement(By.id("username"));
		wd.clear();
		wd.sendKeys("Anilkumar123");
		driver.findElement(By.id("password"));
		driver.findElement(By.xpath("/*[@id='login']")).click();
		WebElement obj=driver.findElement(By.id("location"));
		Select select =new Select(obj);
		List<WebElement> options=select.getOptions();
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		select.selectByValue("sydney");
		select.selectByIndex(2);
		select.selectByVisibleText("sydney");
		driver.navigate().back();
		System.out.println(driver.getWindowHandle());
		Thread.sleep(3000);

	}

}
