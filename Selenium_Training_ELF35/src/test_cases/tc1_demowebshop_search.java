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

public class tc1_demowebshop_search extends base_test{
	@Test
	public void search() throws IOException
	{
	WebElement search=driver.findElement(By.id("small-searchterms"));
	utility_method.enter_text(search,"books");
	WebElement search_button=driver.findElement(By.xpath("//input[@value='Search']"));
	utility_method.click_element(search_button);;
	driver.close();
	}
	
	

}
