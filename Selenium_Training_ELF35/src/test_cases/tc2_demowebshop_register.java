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

public class tc2_demowebshop_register extends base_test{
	@Test
	public void register() throws IOException
	{
	WebElement reg=driver.findElement(By.xpath("//a[text()='Register']"));
	utility_method.click_element(reg);
	WebElement male=driver.findElement(By.id("gender-male"));
	utility_method.click_element(male);
	WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
	utility_method.enter_text(firstname, "bonda");
	WebElement lastname=driver.findElement(By.id("LastName"));
	utility_method.enter_text(lastname,"bindu");
	WebElement email=driver.findElement(By.id("Email"));
	utility_method.enter_text(email,"bindubonda@gmail.com");
	WebElement Password=driver.findElement(By.id("Password"));
	utility_method.enter_text(Password,"10headedboy");
	WebElement confPassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	utility_method.enter_text(confPassword,"10headedboy");
	WebElement regbtton=driver.findElement(By.id("register-button"));
	utility_method.click_element(regbtton);
	driver.close();
	}
}
