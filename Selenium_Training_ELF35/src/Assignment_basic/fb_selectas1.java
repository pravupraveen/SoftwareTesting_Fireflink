package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_selectas1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select select=new Select(date);
	    select.selectByValue("4");
	    Thread.sleep(3000);
	    WebElement month=driver.findElement(By.name("birthday_month"));
	    Select select1=new Select(month);
	    select1.selectByIndex(2);
	    Thread.sleep(3000);
	    WebElement year=driver.findElement(By.name("birthday_year"));
	    Select select2=new Select(year);
	    select2.selectByValue("1997");
	}

}
