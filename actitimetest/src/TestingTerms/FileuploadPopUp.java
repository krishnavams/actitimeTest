package TestingTerms;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPopUp {
	static {
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   }
	public static void main(String[] args) {
			WebDriver d1 = new ChromeDriver();
			d1.get("file:///C:/Users/VAMSI/Documents/Tut/NewFile.html");
			File f = new File("./support/Fake Resume.pdf");
			String path= f.getAbsolutePath();
			d1.findElement(By.id("cv")).sendKeys(path);
			System.out.println("completed");
			d1.close();
	}

}
