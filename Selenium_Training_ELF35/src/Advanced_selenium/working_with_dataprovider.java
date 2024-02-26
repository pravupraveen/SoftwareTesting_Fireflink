package Advanced_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class working_with_dataprovider {
	@DataProvider(name="TestData")
	public Object[][] testdata(){
		Object[][] data=new Object[2][2];
		data[0][0]="praveen@gmail.com";
		data[0][1]="454545";
		data[1][0]="bindudummu121@gmail.com";
		data[1][1]="1122112";
		return data;
	} 
@Test(dataProvider="TestData")
public void DataProvider(String username,String password) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
    driver.findElement(By.xpath("//input=[@type='submit']")).click();
driver.close();
}
}

