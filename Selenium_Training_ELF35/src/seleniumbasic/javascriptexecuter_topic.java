package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class javascriptexecuter_topic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com/");
	//WebElement scrollele=driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
  JavascriptExecutor jse=(JavascriptExecutor)driver;
 // jse.executeScript("window.scrollTo(1000,2000);");
  jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
  Thread.sleep(2000);
  jse.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
	}

}
