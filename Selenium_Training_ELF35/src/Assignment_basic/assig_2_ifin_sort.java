package Assignment_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assig_2_ifin_sort {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		Select sortby=new Select(driver.findElement(By.id("products-orderby")));
		List <WebElement> options=sortby.getOptions();
		String a="Name: A to Z";
		for(WebElement e:options){
		System.out.println(e.getText());
		if(e.getText().equalsIgnoreCase(a)){
	System.out.println("index is"+e);
		}
		}
		}
}
				
		

