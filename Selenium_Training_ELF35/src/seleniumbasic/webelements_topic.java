package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements_topic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		List <WebElement> lists=driver.findElements(By.xpath("//a"));
		for(WebElement linkelements:lists){
			System.out.println(linkelements.getText());
		}
		
	}

}
