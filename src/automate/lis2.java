package automate;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lis2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
//driver.findElement(By.xpath("//span[@class='z1asCe MZy1Rb']")).click();
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("rajani");
driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
Thread.sleep(3000);
driver.quit();

//List<WebElement> val=driver.findElements(By.xpath("//li[@class='sbct']"));

//for(int i=0;i<val.size();i++)

	//	System.out.println("searchsiggestionsare"+val.get(i).getText());


	}
}


