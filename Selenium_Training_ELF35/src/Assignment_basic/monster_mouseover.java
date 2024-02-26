package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utilities.utility_method;

public class monster_mouseover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		WebElement jobs=driver.findElement(By.xpath("//a[@data-check='menutab']"));		
		Thread.sleep(2000);
		//Actions job_2=new Actions(driver);
		//job_2.moveToElement(jobs).build().perform();
	utility_method.moveto(jobs);
		Thread.sleep(2000);
		//WebElement jobs_skill=driver.findElement(By.xpath("//a[text()='Jobs by Skills']"));
		//utility_method.moveto(jobs_skill);
	//	job_2.m(jobs_skill).build().perform();
		//Thread.sleep(2000);
	//	WebElement java_job=driver.findElement(By.xpath("//a[@href='https://www.monsterindia.com/search/java-jobs']"));
		//job_2.moveToElement(java_job).click().build().perform();
	}

}
