package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class prgms {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://www.facebook.com/");
		String ExpectedTitle = "Facebook – log in or sign up";
		String Titleofwebpage=a1.getTitle();
		if(ExpectedTitle.equals(Titleofwebpage))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
		
	}
	}

