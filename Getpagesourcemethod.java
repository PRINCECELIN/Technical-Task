package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getpagesourcemethod {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://www.amazon.com");
		System.out.println(a1.getPageSource());
		
	}

}
