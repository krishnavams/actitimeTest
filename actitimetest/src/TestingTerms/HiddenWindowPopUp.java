package TestingTerms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenWindowPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		d1.findElement(By.id("policynumber")).sendKeys("123");
		d1.findElement(By.id("dob")).click();
		WebElement select = d1.findElement(By.className("ui-datepicker-year"));
		Select s = new Select(select);
		s.selectByValue("1996");
		s= new Select(d1.findElement(By.className("ui-datepicker-month")));
		s.selectByIndex(0);
		d1.findElement(By.xpath("//a[text()='30']")).click();
		d1.findElement(By.id("alternative_number")).sendKeys("7306055555");
		d1.findElement(By.id("renew_policy_submit")).click();
		d1.close();
		
	}
}
