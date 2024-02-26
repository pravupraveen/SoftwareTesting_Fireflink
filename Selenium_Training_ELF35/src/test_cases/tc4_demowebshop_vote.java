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

public class tc4_demowebshop_vote extends base_test{
	@Test
	public void vote() throws IOException
	{
WebElement pollanswers=driver.findElement(By.id("pollanswers-1"));
utility_method.click_element(pollanswers);
WebElement clik=driver.findElement(By.id("vote-poll-1"));
utility_method.click_element(clik);
driver.close();




}
}