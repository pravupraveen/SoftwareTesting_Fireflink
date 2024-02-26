package test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.base_test;
import utilities.utility_method;

public class tc7_demowebshop_facebook extends base_test{
	@Test
	public void advancesearch() throws InterruptedException, IOException {
        driver.findElement(By.xpath("//a[text()='Facebook']")).click();
        Thread.sleep(2000);
        driver.quit();
	}
}
