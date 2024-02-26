package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/praveen%20babu/Desktop/webpages/demo%20(1).html");
		WebElement dropdown=driver.findElement(By.id("standard_cars"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Nissan");
	//	select.selectByValue("for");
		//select.selectByIndex(5);
	}

}
