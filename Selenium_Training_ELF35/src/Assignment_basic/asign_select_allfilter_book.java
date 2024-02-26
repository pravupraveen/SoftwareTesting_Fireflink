package Assignment_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class asign_select_allfilter_book {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		Select sortby=new Select(driver.findElement(By.id("products-orderby")));
	    List <WebElement> options=sortby.getOptions();
	    for(WebElement text:options){
	    	System.out.println(text.getText());
	    	Thread.sleep(3000);
	    	Select display=new Select(driver.findElement(By.id("products-pagesize")));
	    	List<WebElement> optns=display.getOptions();
	    	for(WebElement o:optns){
	    		System.out.println(o.getText());
	    		Thread.sleep(3000);
	        	Select view=new Select(driver.findElement(By.id("products-viewmode")));
	        	List<WebElement> option=display.getOptions();
	        	for(WebElement g:option){
	        		System.out.println(g.getText());	
	        	}
	    	}
	    }
		

	}

}
