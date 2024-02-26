package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton_css {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
        driver.findElement(By.cssSelector("input[type='radio']")).click();
        driver.findElement(By.id("vote-poll-1")).click();
        driver.findElement(By.id("pollanswers-2")).click();
        driver.findElement(By.id("vote-poll-1")).click();
        driver.findElement(By.cssSelector("input[id='pollanswers-3']")).click(); 
        driver.findElement(By.id("vote-poll-1")).click();
        driver.findElement(By.cssSelector("input[name='pollanswers-1']")).click();
        driver.findElement(By.id("vote-poll-1")).click();
	}

}
