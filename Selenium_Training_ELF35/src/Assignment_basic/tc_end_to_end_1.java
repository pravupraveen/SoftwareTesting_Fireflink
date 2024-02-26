package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_end_to_end_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Reg")).click();
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.id("FirstName")).sendKeys("praveen");
		driver.findElement(By.name("LastName")).sendKeys("babu");
		driver.findElement(By.id("Email")).sendKeys("1245eeewww@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("praveen@2497");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("praveen@2497");
		driver.findElement(By.name("register-button")).click();
		driver.close();
	}

}
