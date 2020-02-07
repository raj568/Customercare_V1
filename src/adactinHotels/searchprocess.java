package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class searchprocess {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://adactin.com/HotelAppBuild2/");
			wd.findElement(By.xpath("//*[@id='username']")).sendKeys("Anilkumar123");
		wd.findElement(By.xpath("//*[@id='password']")).sendKeys("Anilkumar123");
		wd.findElement(By.xpath("//*[@id='login']")).click();
		Thread.sleep(3000);
		new Select(wd.findElement(By.xpath("//*[@id='location']"))).selectByIndex(1);
		new Select(wd.findElement(By.xpath("//*[@id='hotels']"))).selectByValue("Hotel Creek");
		new Select(wd.findElement(By.id("room_type"))).selectByValue("Standard");
		new Select(wd.findElement(By.xpath("//*[@id='room_nos']"))).selectByValue("2");
		wd.findElement(By.xpath("//*[@id='datepick_in']")).sendKeys("09/12/2019");
		wd.findElement(By.xpath("//*[@id='datepick_out']")).sendKeys("13/12/2019");
		new Select(wd.findElement(By.xpath("//*[@id='adult_room']"))).selectByValue("2");
		new Select(wd.findElement(By.id("child_room"))).selectByValue("2");
		wd.findElement(By.xpath("//*[@id='Submit']")).click();
		wd.findElement(By.xpath("//*[@id='radiobutton_0']")).click();
		wd.findElement(By.id("continue")).click();
		
		
	}

	

}
