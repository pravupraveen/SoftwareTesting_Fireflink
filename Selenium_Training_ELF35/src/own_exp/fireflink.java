package own_exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.base_test;
import utilities.utility_method;

public class fireflink extends base_test{
	@Test
	public void login() throws InterruptedException {
		Thread.sleep(3000);
	WebElement email=driver.findElement(By.xpath("//input[@name='emailId']"));
		utility_method.enter_text(email, "pravupraveenmeetsu97@gmail.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		utility_method.enter_text(pwd,"Praveen@2497");
		WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
		utility_method.click_element(login);
	}

}
