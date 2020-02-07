package adactinHotels;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class findcoordinat {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		WebElement obj=driver.findElement(By.id("sb_form_q"));
		Point s=obj.getLocation();
		System.out.println("Xcoocrdinate"+s.getX());
		System.out.println("ycoocrdinate"+s.getY());
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("C:\\webdriverkit\\testdata\\dining table.png"));
		driver.quit();
	}

}
