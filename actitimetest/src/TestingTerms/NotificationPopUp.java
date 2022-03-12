package TestingTerms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
	static {
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   }
public static void main(String[] args) {
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver d1 = new ChromeDriver(options);
	d1.get("https://www.yatra.com/");
	
	
}
}
