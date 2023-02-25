package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	ChromeDriver a1=new ChromeDriver();
	a1.get("https://www.Whatsapp.com/");
	System.out.println(a1.getCurrentUrl());
	a1.findElement(By.linkText("log in")).click();
	System.out.println(a1.getCurrentUrl());
	}	
}
