package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoHtml {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("file:///C:/Users/Dell/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo.html");
		drive.manage().window().maximize();
		List<WebElement> radiobtn = drive.findElements(By.xpath("//input[@name='download']"));
	   for(WebElement a :radiobtn)
	   {
		   Thread.sleep(1000);
		   a.click();
	   }
	    
	}

}
