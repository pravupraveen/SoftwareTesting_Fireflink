package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser_test {
 public static void main(String[] args) {
	System.setProperty( "webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in");
driver.manage().window().maximize();
String url=driver.getCurrentUrl();// to get the url of current page 
System.out.println(url);
String title=driver.getTitle();// to get the title of current page
System.out.println(title);
//String pagesource=driver.getPageSource();//to get the current page source code
//System.out.println(pagesour ce);
driver.close();// to close the browser page page
 }
}