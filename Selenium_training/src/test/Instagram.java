package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.instagram.com/accounts/login/");
        driver.findElement(By.name("username")).sendKeys("gokul_jitthan_");
        driver.findElement(By.name("password")).sendKeys("king@2798");
        driver.findElement(By.linkText("qF0y9")).click();

	}

}
