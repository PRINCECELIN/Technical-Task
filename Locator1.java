package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
		a1.get("https:/www.webstore.com");
		a1.findElement( By.id("txtSearch")).sendKeys("computers");
		a1.findElement(By.name("form_basic_search")).click();
	}

}
