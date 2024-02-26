package seleniumbasic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollto_asigntopic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	  jse.executeScript("window,scrollBy(1000,2000);");
	}

}
