package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtude {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://google.co.in");
		drive.manage().window().maximize();
		drive.findElement(By.name("q")).sendKeys("pulsar ns200");
		Thread.sleep(1000);
		drive.findElement(By.name("btnK")).click();
		Thread.sleep(1000);
		drive.close();

	}

}
