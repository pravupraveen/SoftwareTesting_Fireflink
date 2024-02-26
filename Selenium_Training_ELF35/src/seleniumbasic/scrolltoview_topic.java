package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolltoview_topic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	WebElement scrollEle=driver.findElement(By.xpath("//h5[5.text()='Marathahalli']"));
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView(false)",scrollEle);

	}

}
