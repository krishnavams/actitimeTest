package TestingTerms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printPopUp {
	static {
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   }

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		System.out.println("1passed");
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		System.out.println("2passed");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_3);
		System.out.println("3passed");
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
