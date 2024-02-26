package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click_mouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Actions mouse=new Actions(driver);
	mouse.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).build().perform();

	}

}
