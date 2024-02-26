package seleniumbasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handels_ptct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/praveen%20babu/Desktop/webpages/demo%20(1).html");
      String parent_window=driver.getWindowHandle();
      driver.findElement(By.xpath("//a[text()='Webshop']")).click();
      Set<String> child_window=driver.getWindowHandles();
      for(String child:child_window){
    	 // System.out.println(child);
    	  driver.switchTo().window(child);
    	  if(driver.getTitle().contains("Web")){
    		 driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
    		 Thread.sleep(2000);
    		 driver.close();
    	  }
      }
      driver.switchTo().window(parent_window);
      Thread.sleep(2000);
      driver.close();
	}

}
