package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implist_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    WebDriverWait wait=new WebDriverWait(driver,40);
    wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//a[text()='Register']"))));
    driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

}
