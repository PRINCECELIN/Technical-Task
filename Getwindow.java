package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindow {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://www.Flipkart.com");
		System.out.println(a1.getWindowHandle());		
	}             
}
