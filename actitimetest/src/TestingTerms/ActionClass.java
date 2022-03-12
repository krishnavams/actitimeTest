package TestingTerms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	static {
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   }
	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		Actions actions = new Actions(d1);
		d1.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement source = d1.findElement(By.xpath("//h1[.='Block1']"));
		WebElement target = d1.findElement(By.xpath("//h1[.='Block4']"));
		actions.dragAndDrop(source, target);

	}

}
