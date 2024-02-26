package Assignment_basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_window_asig1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/search?q=jo");
	 String	parent_window=driver.getWindowHandle();
	 driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	 Set<String> child_window=driver.getWindowHandles();
	 for(String child:child_window){
		 driver.switchTo().window(child);
	 }
	 driver.close();
	}
	
}
