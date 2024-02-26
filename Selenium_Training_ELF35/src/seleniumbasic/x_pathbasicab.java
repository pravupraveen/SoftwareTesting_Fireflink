package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_pathbasicab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/praveen%20babu/Desktop/webpages/sample.html");
	//driver.findElement(By.xpath("/html/body/input[@type='text']")).sendKeys("praveenbabu");
	//driver.findElement(By.xpath("/html/body/input[@type='text'][2]")).sendKeys("123468");
	//driver.findElement(By.xpath("/html/body/input[@type='button']")).click();
	driver.navigate().to("file:///C:/Users/praveen%20babu/Desktop/webpages/xpath.html");
	driver.findElement(By.xpath("/html/body/input[@type='Username']")).sendKeys("hello");
	driver.findElement(By.xpath("/html/body/input[@type='Password']")).sendKeys("12458156");
	driver.findElement(By.xpath("/html/body/button[@text()='SignOn']")).click();
	driver.close();
	}

}
