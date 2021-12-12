package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Computer");
	    driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
