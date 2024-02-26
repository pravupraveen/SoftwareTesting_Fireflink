package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name_locator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demowebshop.tricentis.com");
		//driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.name("LastName")).sendKeys("babu");
		//driver.findElement(By.name("FirstName")).sendKeys("praveen");
		driver.findElement(By.id("newsletter-email")).sendKeys("praveen@123");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		driver.close();
	}
}

