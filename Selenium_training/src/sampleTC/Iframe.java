package sampleTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("file:///C:/Users/Dell/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/iframe%20(2).html");
		drive.manage().window().maximize();
				
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drive.switchTo().frame("frame2");
		drive.findElement(By.xpath("//span[@class='bars']")).click();
		Thread.sleep(1000);
		drive.findElement(By.xpath("//a[text()='Stories']")).click();


	}

}
