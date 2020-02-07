package adactinHotels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		WebElement obj=driver.findElement(By.id("job_role"));
		Select s= new Select(obj);
		//s.selectByIndex(0);
		s.selectByValue("Administrator");
		
		List<WebElement> val=s.getOptions();
		System.out.println("size of the list is "+val.size());
		int len=val.size();
		for(int i=0;i<len;i++)
		
			System.out.println("value of"+i+"index is "+(val.get(i).getText()));
			Thread.sleep(3000);
			driver.quit();
			
			
		
		

	}

	

}
