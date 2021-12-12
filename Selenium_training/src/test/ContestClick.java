package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContestClick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demo.guru99.com/test/simple_context_menu.html");
		drive.manage().window().maximize();
		WebElement click = drive.findElement(By.xpath("//div[contains(@id,'context')]"));
		Actions contst = new Actions(drive);
		contst.contextClick(click).build().perform();
	}

}
