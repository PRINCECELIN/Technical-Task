package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver a1=new ChromeDriver();
		//to maximize the window
		a1.manage().window().maximize();
		
		//to fullscreen window
		a1.manage().window().fullscreen();
		
		//to get the window size
		System.out.println(a1.manage().window().getSize());
		
		//to set the  size of window
		 Dimension d=new Dimension (200,500);
		 a1.manage().window().setSize(d);
		 
		 //to get the position of the window
		 System.out.println(a1.manage().window().getPosition());
		 
		 //to set the position of the window size
		 Point p=new Point (700,400);
		 a1.manage().window().setPosition(p);
				
	}		
	}

