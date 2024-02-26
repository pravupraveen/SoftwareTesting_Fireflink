package Advanced_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc_anotation_configuration {
	WebDriver driver;
	@BeforeTest
	public void browser_launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void register() {
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ravana");
	driver.findElement(By.id("LastName")).sendKeys("bidu");
	driver.findElement(By.id("Email")).sendKeys("ravanabndu666@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("10headedboy");
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("10headedboy");
	driver.findElement(By.id("register-button")).click();
	
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("ravanabndu666@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("10headedboy");
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
	}
	@AfterTest
	public void termination() {
		driver.close();
	}
	}


