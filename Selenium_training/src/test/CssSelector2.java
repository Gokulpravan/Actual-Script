package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com");
	    driver.findElement(By.cssSelector("a[class ='ico-register']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input [data-val='true']")).sendKeys("Gokul");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input [id='LastName']")).sendKeys("Pravan");

	}

}
