package seleniumbasic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TAKESSCREANSHOOT_TOPIC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dsti=new File("./screanshots/pagesame1.png");
	//try {
	//	FileUtils.copyFile(temp, dsti);
	//} catch (IOException e) {
	//	e.printStackTrace();
	//}
	try {
		FileHandler.copy(temp, dsti);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
