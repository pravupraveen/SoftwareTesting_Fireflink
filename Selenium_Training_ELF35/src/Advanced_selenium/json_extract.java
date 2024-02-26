package Advanced_selenium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class json_extract {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String url = "https://www.google.com/";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		int responseCode = con.getResponseCode();
		System.out.println("Response code is: " + responseCode);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		System.out.println(response.toString());
	}

}