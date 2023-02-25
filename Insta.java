package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
public class Insta {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
		a1.manage().window().maximize();
		a1.get("https://www.instagram.com");
		a1.findElement(By.name("\"_aa4b _add6 _ac4d\"")).sendKeys("ruok");
	}
}
	

	
		
	


