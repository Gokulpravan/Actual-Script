package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demows {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement> element= driver.findElements(By.xpath("//span"));
		for(WebElement a: element)
		{
			System.out.println(a.getAttribute("class"));
		}
		List<WebElement> element1= driver.findElements(By.xpath("//a"));
		for(WebElement a1: element1)
		{
			System.out.println(a1.getText());
		}
		List<WebElement> element2= driver.findElements(By.xpath("//Img"));
		for(WebElement a2: element2)
		{
			System.out.println(a2.getAttribute("title"));
		}

	}
	

}
