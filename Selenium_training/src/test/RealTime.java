package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demowebshop.tricentis.com/");
		drive.manage().window().maximize();
		WebElement element = drive.findElement(By.cssSelector("input[type='text']"));
		element.sendKeys("Mobile");
		System.out.println(element.getText());
		System.out.println(element.getAttribute("name"));
		element.clear();
		Thread.sleep(1000);
		element.sendKeys("Mobile");
		WebElement element1=drive.findElement(By.xpath("//input[@value='Search']"));
		if(element1.isEnabled()==true)
		{
			element1.click();
		}
		else
		{
			System.out.println("It is disabled");
		}
	   String result =drive.findElement(By.className("result")).getText();
	   System.out.println(result);
		
	}

}
