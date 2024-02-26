package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_topic_name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/praveen%20babu/Downloads/iframe.html");
	driver.manage().window().maximize();
	driver.switchTo().frame("frame1");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
	driver.findElement(By.id("gavtab-4")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[text()='Google']")).click();

	}

}
