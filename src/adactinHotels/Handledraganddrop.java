package adactinHotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handledraganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdriverkit\\browser_driver\\IE browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		WebElement fr=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fr);
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, dest).build().perform();// it needs both source and destination
		//a.dragAndDropBy(source, 150, 150).build().perform();
		//driver.findElement(By.id("draggable"));
		Thread.sleep(5000);
		driver.quit();
		

	}

}
