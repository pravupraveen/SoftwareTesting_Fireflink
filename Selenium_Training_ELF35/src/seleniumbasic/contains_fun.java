package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains_fun {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	//driver.findElement(By.xpath("//a[contains(@class,'register')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Compu')]")).click();
}
}//a[contains(text(),'Compu')]
