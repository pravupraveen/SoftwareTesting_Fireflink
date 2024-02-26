package own_exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonbasic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com//");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8618823426");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("praveen2497");
    String s=driver.findElement(By.xpath("//input[@id='signInSubmit']")).getAttribute("type");
	System.out.println(s);
	if(s.equalsIgnoreCase("submit")){
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}
	String error=driver.findElement(By.xpath("//h4[@class='a-alert-heading']")).getText();
	System.out.println(error);
	}

}
