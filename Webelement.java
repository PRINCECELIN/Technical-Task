package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	ChromeDriver a1=new ChromeDriver();
	a1.manage().window().maximize();
	a1.get("https://demowebshop.tricentis.com/");
	a1.findElement(By.linkText("Log in")).click();
	WebElement emailTF=a1.findElement(By.id("email"));
	
	emailTF.sendKeys("data");
	//System.out.println(emailTF.getAttribute("value"));
	
	
	
	}

}
