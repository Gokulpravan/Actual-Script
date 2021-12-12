package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
	       WebDriver driver =new ChromeDriver();
	       
	       //to navigate to google
	       driver.get("https://www.google.co.in");
	       
	       //to get maximize the screen
	       driver.manage().window().maximize();
	       
	       //to refresh
	       driver.navigate().refresh();
		} 

}