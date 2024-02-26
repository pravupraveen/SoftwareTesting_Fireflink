package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_asig {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	driver.findElement(By.xpath("//input[@class='text-box single-line']")).sendKeys("praveen");
	driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("babu");
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("praveen123@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("okey132");
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("okey132");
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	}
}
