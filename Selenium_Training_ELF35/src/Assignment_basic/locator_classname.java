package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_classname {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/");
			//driver.findElement(By.id("small-searchterms")).sendKeys("books");
			driver.findElement(By.className("search-box-text ui-autocomplete-input")).sendKeys("books");
	driver.findElement(By.className("button-1 search-box-button")).click();
		}

}
