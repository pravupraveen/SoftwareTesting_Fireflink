package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_path_basic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/praveen%20babu/Desktop/webpages/xpath1.html");
        driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("hello");
        driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("im bob");
        driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("ya");
        driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("its me");
	}
}
