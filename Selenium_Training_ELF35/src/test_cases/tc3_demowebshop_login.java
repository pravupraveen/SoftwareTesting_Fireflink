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

public class tc3_demowebshop_login extends base_test{
	@Test
	public void login() {
	WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
	utility_method.click_element(login);
	WebElement Email=driver.findElement(By.id("Email"));
	utility_method.enter_text(Email,"bondubindu@gmail.com");
	WebElement pwd=driver.findElement(By.id("Password"));
	utility_method.enter_text(pwd,"10headedboy");
	WebElement remember=driver.findElement(By.id("RememberMe"));
	utility_method.click_element(remember);
	WebElement Log=driver.findElement(By.xpath("//input[contains(@value,'Log in')]"));
	utility_method.click_element(Log);
	driver.close();
	}

}
