package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomClickOnRadiobtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demowebshop.tricentis.com/");
		drive.manage().window().maximize();  
		List<WebElement> radiobtn = drive.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement button : radiobtn)
		{
			button.click();
			Thread.sleep(1000);
		}
		drive.close();
	}

}
