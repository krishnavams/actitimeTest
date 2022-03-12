package TestingTerms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptPopups {
	static {
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   }
	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		d1.get("file:///C:/Users/VAMSI/Documents/Tut/NewFile.html");
		WebElement ele = d1.findElement(By.xpath("//button"));
		ele.click();
		d1.switchTo().alert().accept();
		System.out.println(ele.getText());
		d1.close();
		
		
	}
}
