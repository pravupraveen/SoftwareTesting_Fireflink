package Assignment_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_4farward_refresh {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		driver.navigate().to("https://amazon.com");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.close();
		
	}

}
