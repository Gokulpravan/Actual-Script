package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/Dell/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo%20(2).html");
		 driver.manage().window().maximize();
	     WebElement Print = driver.findElement(By.xpath("//select[@id='standard_cars']"));
	     Select Cars= new Select(Print);
	     List<WebElement> ListOfCar = Cars.getOptions();
	
		for(WebElement Car : ListOfCar)
		{
			System.out.println("The Brand is " + Car.getText());
		}
	
	 
	}

}
