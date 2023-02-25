package basic;

import org.openqa.selenium.chrome.ChromeDriver;
public class Navigate 
{
	public static void main(String[] args)
			throws InterruptedException	
		{
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
		a1.manage().window().maximize();
		
	    a1.get("https://www.facebook.com"); 
	    Thread.sleep(2000);
	    a1.get("https://www.amazon.com");
	   //navigating backward 
	   a1.navigate().back();
	   Thread.sleep(5000);
	   //navigating forward
	   a1.navigate().forward();
	   Thread.sleep(3000); 
	   //navigating refreshing to the page
	   a1.navigate().refresh();
	   //navigating method using string argument
	   Thread.sleep(3000);	   
	   a1.navigate().to("https://www.flipkart.com");
	   
	   
		}
}


		

	    		
	

