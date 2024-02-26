package Advanced_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class working_with_testconfigurationmethos {
	WebDriver driver;
	String filepath;
	FileInputStream fis;
	Properties prop;
	
	@BeforeTest
	public void browser_launch() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String loadurl=readfromfile();
		driver.get(loadurl);
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
    public String readfromfile() throws IOException {
    filepath="./test_configuration./test_configuration.properties";
    fis=new FileInputStream(filepath);
    prop=new Properties();
    prop.load(fis);
    String geturl=prop.getProperty("url");
    return geturl;
  }
}
