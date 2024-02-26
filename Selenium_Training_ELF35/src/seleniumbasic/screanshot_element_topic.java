package seleniumbasic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screanshot_element_topic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
WebElement searchtf=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	File temp=searchtf.getScreenshotAs(OutputType.FILE);
	File desti=new File("./screanshots/element.png");
	try {
		FileHandler.copy(temp, desti);
	} catch (IOException e) {
		e.printStackTrace();
	}

	}

}
