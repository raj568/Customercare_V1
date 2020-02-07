package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handleresize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		WebElement wd=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(wd);
		WebElement obj=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-resizable']"));
		Actions a= new Actions(driver);
		a.dragAndDropBy(obj,150,100).build().perform();
		//a.clickAndHold(obj).moveByOffset(200,200).release().build().perform();
		Thread.sleep(3000);
		driver.quit();
	

}
}
