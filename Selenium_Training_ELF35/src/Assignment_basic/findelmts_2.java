package Assignment_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class findelmts_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		List <WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
		//for(WebElement options:radio){
			//options.click();
		for(int i=1;i<=radio.size();i++){ 
			radio.get(i).click();
			
		//driver.findElement(By.id("vote-poll-1")).click();
		}

	}

}
