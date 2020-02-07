package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/account/general?ru=https%3a%2f%2fwww.bing.com%2f&FORM=O2HV65&id=language_section#language-section");
       driver.findElement(By.id("adlt_set_strict")).click();
       boolean sta=driver.findElement(By.id("enAS")).isSelected();
       System.out.println("stataus of checkbox is" +sta);
       if(sta)
       {
    	   System.out.println("checkbox is already checked");
       }
       else
    	   System.out.println("checkbox is checking");
       driver.findElement(By.id("rpp")).sendKeys("50");
    	   
       Thread.sleep(9000);
       driver.quit();
	}

}
