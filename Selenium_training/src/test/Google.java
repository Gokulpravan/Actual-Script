package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.co.in");
		d.findElement(By.name("q")).sendKeys("www.youtube.com");
		d.findElement(By.name("btnK")).click();
		d.findElement(By.partialLinkText("YouTube")).click();
	 
		
	}

}
