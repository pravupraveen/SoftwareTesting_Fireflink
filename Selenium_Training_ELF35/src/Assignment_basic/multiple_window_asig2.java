package Assignment_basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multiple_window_asig2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
		String prt_paenge=driver.getWindowHandle();
		Actions mouse=new Actions(driver);
		mouse.moveToElement(driver.findElement(By.xpath("//div[text()='Companies']"))).build().perform();
		mouse.moveToElement(driver.findElement(By.xpath("//a[text()='Unicorn']"))).click().build().perform();
		Set <String> child=driver.getWindowHandles();
        for(String childwindow:child){
	driver.switchTo().window(childwindow);
	String s=driver.getTitle();
System.out.println(s);
  }
		
		
	}
	}

