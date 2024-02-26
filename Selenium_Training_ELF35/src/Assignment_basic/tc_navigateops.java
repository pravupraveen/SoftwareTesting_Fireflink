package Assignment_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_navigateops {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://amazon.com");
	String title=driver.getTitle();
	System.out.println(title);
	driver.quit();
	}

}
