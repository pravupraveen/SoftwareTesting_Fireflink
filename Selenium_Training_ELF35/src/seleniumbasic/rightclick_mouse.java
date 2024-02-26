package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick_mouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
 WebElement right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions mouse=new Actions(driver);
	mouse.contextClick(right_click).build().perform();
   mouse.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']"))).click() .build().perform();
	}
}
