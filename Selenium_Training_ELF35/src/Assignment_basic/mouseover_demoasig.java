package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover_demoasig {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");	
		Thread.sleep(2000);
		WebElement computer=driver.findElement(By.xpath("//a[contains(text(),'Computers')][1]"));	
	WebElement desktop=driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"))	;
     Actions options=new Actions(driver);
     options.moveToElement(computer).build().perform();   
     options.moveToElement(desktop).click().build().perform();
	}
}
