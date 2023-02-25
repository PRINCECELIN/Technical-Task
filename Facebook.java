package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
		a1.manage().window().maximize();
		a1.get("https://www.facebook.com/");
		a1.findElement(By.id("email")).sendKeys("ruok2020@gmail.com");
		a1.findElement(By.id("pass")).sendKeys("Selenium@90");
		a1.findElement(By.name("login")).click();
		
		

}
}
