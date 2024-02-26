package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kgftrailer {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("unstoppable song");
	driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']")).click();
	driver.findElement(By.xpath("//div[@class='style-scope ytd-video-renderer']")).click();
	}
}
