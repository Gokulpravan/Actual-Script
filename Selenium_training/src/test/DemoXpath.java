package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpath {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demowebshop.tricentis.com/");
		d.findElement(By.name("q")).sendKeys("Laptop");
		d.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input [@type='submit']")).click();
		d.close();

	}

}
