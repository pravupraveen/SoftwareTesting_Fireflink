package seleniumbasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotclass_topic {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("file:///C:/Users/praveen%20babu/Desktop/webpages/demo%20(1).html");
	WebElement choos_file=driver.findElement(By.id("resume"));
	Actions action =new Actions(driver);
	action.moveToElement(choos_file).click().build().perform();
	Thread.sleep(2000);
	Robot rob=new Robot();
	rob.keyPress(KeyEvent.VK_B);
	rob.keyPress(KeyEvent.VK_D);
	rob.keyPress(KeyEvent.VK_A);
	rob.keyPress(KeyEvent.VK_T);
	rob.keyPress(KeyEvent.VK_A);
	rob.keyPress(KeyEvent.VK_SHIFT);
	rob.keyPress(KeyEvent.VK_B);
	rob.keyPress(KeyEvent.VK_D);
	rob.keyPress(KeyEvent.VK_A);
	rob.keyPress(KeyEvent.VK_T);
	rob.keyPress(KeyEvent.VK_A);
	rob.keyRelease(KeyEvent.VK_SHIFT);
	Thread.sleep(2000);
	for(int i=0;i<=2;i++){
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
	}
		rob.keyPress(KeyEvent.VK_ENTER);
		//driver.close();
	Thread.sleep(2000);
	rob.mouseMove(730,700);
	Thread.sleep(2000);
	rob.mousePress(InputEvent.BUTTON2_DOWN_MASK);
	rob.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
	driver.close();
	for(int i=0;i<=2;i++){
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
	}
		rob.keyPress(KeyEvent.VK_ENTER);
		driver.close();
	}
	}
