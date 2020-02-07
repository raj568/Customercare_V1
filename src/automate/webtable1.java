package automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/");
		driver.manage().window().maximize();
		int i;
		String before="//tr[";
		String after="]/td[1]";
		String after1="]/td[2]";
		for(i=2;i<6;i++)
		{	
			String xp1=new StringBuilder().append(before).append(i).append(after).toString();
		String v1=driver.findElement(By.xpath(xp1)).getText();
		System.out.println(v1);
		//to print second coloumn data
		String xp2=new StringBuilder().append(before).append(i).append(after1).toString();
		String val2=driver.findElement(By.xpath(xp2)).getText();
		System.out.println("second column data"+val2);
		
		
		}
		driver.quit();
		
	}
}
		
		
		
		
		
		
		
		
		
		
	
