package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
	    WebDriver insta= new ChromeDriver();
	    insta.get("https://www.instagram.com/accounts/login/");
	    insta.findElement(By.cssSelector("input[type='text']")).sendKeys("gokul_jitthan_");
	    insta.findElement(By.cssSelector("input[type='password']")).sendKeys("king@2798");
	    insta.findElement(By.tagName("button")).click();
	    
	}

}
