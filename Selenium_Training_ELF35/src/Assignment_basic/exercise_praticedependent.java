package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise_praticedependent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String value=driver.findElement(By.xpath("//div[@class='block large-row-spacer']//div//fieldset//table//tbody//tr[10]//td[text()='Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C']")).getText();
	System.out.println(value);
	}

}
