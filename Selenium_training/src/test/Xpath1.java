package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Dell/Desktop/Selenium/WebElement2.html");
		d.findElement(By.xpath("//input [@type='UserName']")).sendKeys("Gokul");
		d.findElement(By.xpath("//input [@type='Password']")).sendKeys("King");
		d.findElement(By.xpath("//button [text()='SignIn']")).click();		
	}

}
