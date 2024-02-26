package test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.base_test;
import utilities.utility_method;

public class tc5_demowebshop_subscribe extends base_test {
	@Test
	public void subscribe(){
	WebElement newsletter=driver.findElement(By.id("newsletter-email"));
	utility_method.enter_text(newsletter,"raanabob@gmail.com");
	WebElement Subscribe=driver.findElement(By.xpath("//input[@value='Subscribe']"));
	utility_method.click_element(Subscribe);
	driver.close(); 
	}

} 
