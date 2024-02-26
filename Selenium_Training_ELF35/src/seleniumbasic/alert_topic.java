package seleniumbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert_topic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	WebElement click=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
     Actions action=new Actions(driver);
     action.doubleClick(click).build().perform();
     Thread.sleep(2000);
     Alert a1= driver.switchTo().alert();
     String alert=a1.getText();
     System.out.println(alert);
     a1.accept();
     driver.close();
	}

}
