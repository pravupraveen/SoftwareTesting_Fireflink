package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class topic_locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();//by hyper text
		//driver.close();
		driver.findElement(By.id("FirstName")).sendKeys("praveenbabu");//by id
	driver.close();
	}

}
