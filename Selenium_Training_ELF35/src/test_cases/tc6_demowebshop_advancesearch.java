package test_cases;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.KnownElements;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.base_test;
import utilities.utility_method;

public class tc6_demowebshop_advancesearch extends base_test{
	@Test
	public void advancesearch() throws InterruptedException, IOException {
		driver.findElement(By.id("small-searchterms")).sendKeys("java");
		driver.findElement(By.xpath("//input[@value='Search']")).click();	
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	WebElement category= driver.findElement(By.id("Cid"));
		Select select=new Select(category);
		select.selectByIndex(3);
		driver.findElement(By.id("Isc")).click();
		WebElement Manufacturer= driver.findElement(By.id("Mid"));
		Select select1=new Select(Manufacturer);
		select1.selectByIndex(1);
		driver.findElement(By.xpath("//input[@class='price-from']")).sendKeys("5000");
		driver.findElement(By.xpath("//input[@class='price-to']")).sendKeys("15000");
		driver.findElement(By.id("Sid")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		al.accept();
		driver.close();
	}

}
