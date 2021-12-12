package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass1 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/Dell/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo%20(2).html");
		  WebElement FindCar =driver.findElement(By.xpath("//select[@id='standard_cars']"));
           Select PartiCar = new Select(FindCar);
           PartiCar.selectByVisibleText("BMW");
           Thread.sleep(1000);
           PartiCar.selectByIndex(5);
           Thread.sleep(1000);
           PartiCar.selectByValue("for");
           Thread.sleep(1000);
	}

}
