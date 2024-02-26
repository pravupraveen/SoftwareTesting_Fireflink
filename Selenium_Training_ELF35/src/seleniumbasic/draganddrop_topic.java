package seleniumbasic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import utilities.utility_method;

public class draganddrop_topic {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
   //WebElement Washington =  driver.findElement(By.xpath("//div[text()='Washington'][2]"));
   //WebElement UnitedStates= driver.findElement(By.xpath("//div[contains(text(),'United States')]"));
   //WebElement Madrid =  driver.findElement(By.xpath("//div[text()='Madrid'][2]"));
   //WebElement Spain= driver.findElement(By.xpath("//div[text()='Spain']"));
   //WebElement Oslo =  driver.findElement(By.xpath("//div[text()='Oslo'][2]"));
   //WebElement Norway= driver.findElement(By.xpath("//div[text()='Norway']"));
   WebElement Rome =  driver.findElement(By.xpath("//div[text()='Rome'][2]"));
   WebElement Italy= driver.findElement(By.xpath("//div[text()='Italy']"));
  // utility_method.dragndrop(Rome, Italy);
   Actions action=new Actions(driver);
     //action.dragAndDrop(Washington, UnitedStates).build().perform();
     //action.dragAndDrop(Madrid, Spain).build().perform();
     //action.dragAndDrop(Oslo, Norway).build().perform();
     action.dragAndDrop(Rome, Italy).build().perform();
     //Thread.sleep(2000);
     //WebElement backRome =  driver.findElement(By.xpath("//div[@id='box6']"));
     //WebElement backItaly= driver.findElement(By.xpath("//div[@id='capitals']"));
     //action.dragAndDrop(backRome, backItaly).build().perform();
   // TakesScreenshot screen=(TakesScreenshot)driver;
  // File temp=screen.getScreenshotAs(OutputType.FILE);
  // File permnent=new File("./screanshots/Romeback.png");
   //FileHandler.copy(temp, permnent);
	}

}
