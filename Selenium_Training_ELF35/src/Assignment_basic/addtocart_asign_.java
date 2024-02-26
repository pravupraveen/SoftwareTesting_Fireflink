package Assignment_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class addtocart_asign_ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\praveenjava\\eclips-Bob\\Selenium_Training_ELF35\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	//Actions action=new Actions(driver);
	//action.moveToElement(driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']/div[3]/div/div[2]/div[3]/div[2]/input[@type='button']"))).build().perform();
	driver.findElement(By.xpath("//img[@alt='Picture of 14.1-inch Laptop']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//inp ut[@id='add-to-cart-button-31']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.findElement(By.xpath("//img[@alt='Picture of Build your own cheap computer']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
    driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
    Thread.sleep(2000);
   String price1= driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[1]/td[4]/span[2]")).getText();
   Thread.sleep(2000);
   String price2=driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[2]/td[4]/span[2]")).getText();
  // System.out.println(price1 );
  // System.out.println(price2 );
   double item1=Double.parseDouble(price1);
   double item2=Double.parseDouble(price2); 
   if(item1>item2){
	   driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[1]/td[1]/input[@name='removefromcart']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@class='common-buttons']/input[1][@type='submit']")).click();
   }else{
	   driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[2]/td[1]/input[@name='removefromcart']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@class='common-buttons']/input[1][@type='submit']")).click();
	   }
   
   }
   }


