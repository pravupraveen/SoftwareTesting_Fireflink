package Assignment_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_close_browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//to maximize the window
		driver.get("https://www.facebook.com");
		String pagesource=driver.getPageSource();//
		System.out.println(pagesource);
		driver.close();
}
}
