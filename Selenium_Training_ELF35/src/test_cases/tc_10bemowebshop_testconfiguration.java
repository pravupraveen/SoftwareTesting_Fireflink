package test_cases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.base_test;
import utilities.utility_method;

public class tc_10bemowebshop_testconfiguration extends base_test {
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
}
