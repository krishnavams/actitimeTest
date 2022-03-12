package TestingTerms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthanticationPopUp {
	static {
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   }
	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		d1.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
