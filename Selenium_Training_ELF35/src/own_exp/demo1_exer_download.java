package own_exp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo1_exer_download {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praveen%20babu/Desktop/webpages/demo%20(1).html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@name='selenium']//tbody//tr[4]//td[2]//input[@name='download']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//table[@name='os']//tbody//tr[2]//td[3]//a[text()='Download']")).click();
		WebElement options=driver.findElement(By.id("standard_cars"));
	   Select cars=new Select(options);
	  // List <WebElement>lex=cars.getOptions();
	  // for(WebElement o:lex){
		   cars.selectByIndex(3);
	   }

}
