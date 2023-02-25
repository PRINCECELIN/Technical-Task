package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindow1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
		
		a1.get("https://www.flipkart.com");
		a1.get("https://www.amazon.com");
		System.out.println(a1.getWindowHandles());
		System.out.println(a1.getWindowHandles());
		
	}

}
