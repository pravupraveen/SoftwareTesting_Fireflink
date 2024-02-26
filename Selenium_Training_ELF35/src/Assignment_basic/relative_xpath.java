package Assignment_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/praveen%20babu/Desktop/webpages/xpath.html");
	driver.findElement(By.xpath("//input[@type='Username']")).sendKeys("praveen");
    driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("bob@123");
    driver.findElement(By.xpath("//button[@id='Signin']")).click();
    driver.navigate().to("file:///C:/Users/praveen%20babu/Desktop/webpages/xpath1.html");
    driver.findElement(By.xpath("//input[1]")).sendKeys("praveen");
    driver.findElement(By.xpath("//input[2]")).sendKeys("vee");
    driver.findElement(By.xpath("//div[2]/input[1]")).sendKeys("n");
    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("babu");
	
	}
}