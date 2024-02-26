package own_exp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class tab {
	
	public static void main(String[] args) throws AWTException {
	System.setProperty("Webdriver,chrome.driver", "C:\\Users\\User\\Desktop\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
   Robot rob=new Robot();
   rob.keyPress(KeyEvent.VK_TAB);
}
}
