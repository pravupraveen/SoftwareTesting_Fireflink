package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_on_locator {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://demowebshop.tricentis.com");
			driver.findElement(By.linkText("Register")).click();//by hyper text
			driver.findElement(By.id("FirstName")).sendKeys("praveen");//by id
		    driver.findElement(By.id("LastName")).sendKeys("babu");
			driver.close();
			}

}
