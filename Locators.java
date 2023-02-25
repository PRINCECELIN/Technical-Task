package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators
{
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
       a1.manage().window().maximize();
       a1.get("https://demowebshop.tricentis.com/");
       //a1.findElement(By.className("ico-register")).click();
      // a1.findElement(By.id("gender-male")).click();
       //a1.findElement(By.name("FirstName")).sendKeys("prince");
      // a1.findElement(By.id("LastName")).sendKeys("y");
       //a1.findElement(By.id("Email")).sendKeys("celinprince2001@gmail.com");      
       //a1.findElement(By.id("Password")).sendKeys("805632");
       //a1.findElement(By.id("ConfirmPassword")).sendKeys("805632");
       //a1.findElement(By.id("register-button")).click();
      // a1.findElement(By.xpath("//input[@value='Continue']")).click();
       a1.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
       a1.findElement(By.id("Email")).sendKeys("celinprince2001@gmail.com");
       a1.findElement(By.name("Password")).sendKeys("805632");
       a1.findElement(By.xpath("//input[@value='Log in']")).click();
       a1.findElement(By.tagName("Computers\r\n" + 
       		"        ")).click();
       a1.findElement(By.("")).click();
	}
	   
}

