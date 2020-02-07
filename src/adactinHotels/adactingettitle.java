package adactinHotels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactingettitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://adactin.com/HotelAppBuild2/");
		String x=wd.getTitle();
		System.out.println("title is"+x);
		String p=wd.getPageSource();
		System.out.println("page source is"+p);
	}

}
