package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class basic_actions_mouse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	WebElement jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
	WebElement jobs_by_designation=driver.findElement(By.xpath("//a[text()='Jobs by designation']"));
	Actions mouseover=new Actions(driver);
	mouseover.moveToElement(jobs).build().perform();	
	Thread.sleep(2000);
	mouseover.moveToElement(jobs_by_designation).click().build().perform();
	driver.close();
 }
}