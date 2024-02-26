package Advanced_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class workingwith_propertyfile {
	@Test 
	public void read_data() throws IOException {
		String filepath="./test_configuration./test_configuration.properties";
		FileInputStream fis=new FileInputStream(filepath);
		Properties prop=new Properties();
		prop.load(fis);
		String loc=prop.getProperty("location");
		System.out.println(loc);
		System.out.println(prop.getProperty("company"));
		System.out.println(prop.getProperty("name"));
		
	}

}
