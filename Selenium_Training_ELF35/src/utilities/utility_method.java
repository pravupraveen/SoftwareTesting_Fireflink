package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class utility_method extends base_test{
	static String filepath;
	static FileInputStream fis;
	static Properties prop;
	@Test
	public static String readfromfile() throws IOException {
	    filepath="./test_configuration./test_configuration.properties";
	    fis=new FileInputStream(filepath);
	    prop=new Properties();
	    prop.load(fis);
	    String geturl=prop.getProperty("url");
	    return geturl;
	  }
	public static void enter_text(WebElement elements,String value) {
		elements.sendKeys(value);
}
	public static void click_element(WebElement elements) {
		elements.click();
	}
	//********************** Actionsaclass **************************//
	public static WebElement moveto(WebElement element)  {
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		return element;
	}
	public static void dragndrop(WebElement elements1,WebElement elements2)  {
		Actions action=new Actions(driver);
		action.dragAndDrop(elements1, elements2).build().perform();
}
	public static void double_click(WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick(element).build().perform();
	}
public static void context(WebElement element) {
	Actions action=new Actions(driver);
	action.contextClick(element);
}
/***********************selectclass************************/
public static  WebElement selectbyindex(WebElement element,int value) {
 	Select select=new Select(element);
	select.selectByIndex(value);
	return element;
}

public static WebElement selectbyvalue(WebElement element,String value) {
Select  select=new Select(element)	;
select.selectByValue(value);
return element;
}


}