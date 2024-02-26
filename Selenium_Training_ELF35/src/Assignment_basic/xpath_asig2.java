package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_asig2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		//driver.close();

	}
}
