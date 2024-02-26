package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_class_keyboard {
	public static void main(String[] args) throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Actions search=new Actions(driver);
		search.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		search.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		search.moveToElement(driver.findElement(By.id("small-searchterms"))).click().sendKeys("mobiles").sendKeys(Keys.ENTER).perform();

	}

}
