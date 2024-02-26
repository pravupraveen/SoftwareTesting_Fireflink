package Assignment_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectingmultipleoptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:dr//demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		Select option=new Select(dropdown);
		List <WebElement> options=option.getOptions();
		for(int i=1;i<=options.size();i++){
			WebElement dropdown1=driver.findElement(By.id("products-orderby"));
			Select option1=new Select(dropdown1);
			option1.selectByIndex(1);
		}
		
	}

}
