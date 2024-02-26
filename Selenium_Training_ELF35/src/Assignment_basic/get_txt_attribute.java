package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_txt_attribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("teju");
		String value=driver.findElement(By.cssSelector("input[class='button-1 search-box-button'")).getAttribute("value");
		System.out.println(value);
		if(value.equalsIgnoreCase("Search")){
			driver.findElement(By.cssSelector("input[class='button-1 search-box-button'")).click();
		}
		String result=driver.findElement(By.cssSelector("strong[class='result']")).getText();
	System.out.println(result);
	}
 
	}

