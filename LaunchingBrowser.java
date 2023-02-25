package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	ChromeDriver a1=new ChromeDriver();
	a1.get("https://www.zudio.com/");
	System.out.println("i love selenium");
	
}
}