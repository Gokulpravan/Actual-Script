package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebshopMouseHoveraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demowebshop.tricentis.com/");
		drive.manage().window().maximize(); 
		WebElement element = drive.findElement(By.xpath("//a[@href='/computers']"));
		Actions Comp= new Actions(drive);
		Comp.moveToElement(element) .build().perform();
		WebElement element1 = drive.findElement(By.xpath("//a[@href='/electronics']"));
		Actions Elec= new Actions(drive);
		Elec.moveToElement(element1).click().build().perform();
		
		
		
	}

}
