package Assignment_basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class snowcity_exercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://snowcityblr.com/contact-us/");
	driver.manage().window().maximize();
	String parentwindow=driver.getWindowHandle();
	driver.switchTo().frame(0); 
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[text()='Directions']")).click();
	//driver.switchTo().defaultContent();
	Thread.sleep(10000);
	Set <String>child=driver.getWindowHandles();
	for(String childwindow:child){
		driver.switchTo().window(parentwindow);
	}
	driver.quit();

}
}
