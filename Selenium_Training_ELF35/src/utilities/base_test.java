package utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base_test {
	public static WebDriver driver;
	
	@BeforeClass
	public void browser_setup() throws IOException { 
	System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	String loadurl=utility_method.readfromfile();
	driver.get(loadurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
	}
	@AfterClass
	public void Browserclose() {
		driver.close();
	}
	
}



