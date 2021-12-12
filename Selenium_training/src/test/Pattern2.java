package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pattern2 {

	public static void main(String[] args) 
	{
				System.setProperty("webdriver.chrome.driver",  "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
				WebDriver drive=new ChromeDriver();
				drive.get("file:///C:/Users/Dell/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo.html");
				drive.manage().window().maximize();
				List<WebElement> element= drive.findElements(By.xpath("//table[@name='os']/tbody/tr/td"));
				for(int i=0; i<=2;i++ )
				{
				System.out.println(((WebElement) element).getText());
			    }
			}

	}
