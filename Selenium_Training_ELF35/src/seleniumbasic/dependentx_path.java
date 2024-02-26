package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependentx_path {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/praveen%20babu/Desktop/webpages/demo%20(1).html");
      // driver.findElement(By.xpath("//table[@name='selenium']//tbody//tr[3]/td[2]//input[@name='download']")).click();
		//driver.findElement(By.xpath("//table[@name='selenium']//tbody//tr[4]//td[2]//input[@name='download']")).click();
	driver.findElement(By.xpath("//table[@name='os']//tbody//tr[2]//td[3]//a[text()='Download']")).click();
	}

}
