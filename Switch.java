package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {
	public static void main(String[] args) 
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
		a1.switchTo();
		a1.get("https://www.youtube.com");
		a1.switchTo();
		a1.get("https://www.resso.com");			
		Thread.sleep(3000);
		a1.close();
		a1.quit();
						
	}
}
