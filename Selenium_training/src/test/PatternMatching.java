package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PatternMatching {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("file:///C:/Users/Dell/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo.html");
		drive.manage().window().maximize();
		List<WebElement> element= drive.findElements(By.xpath("//table[@name='os']/tbody/tr/td[1]"));
		for(WebElement ele : element)
		{
			
		List<WebElement> element1= drive.findElements(By.xpath("//table[@name='os']/tbody/tr/td[2]"));
		for(WebElement ele1 : element1)
		{
		System.out.println(ele.getText() + "----> " + ele1.getText());
		break;
		
	    }
		}
	}

}
