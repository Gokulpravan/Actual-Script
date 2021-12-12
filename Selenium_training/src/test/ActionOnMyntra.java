package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionOnMyntra {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.myntra.com/?utm_source=perf_bing_traffic&utm_medium=perf_bing_traffic&utm_campaign=Bing_Brand_Exact_Desktop&utm_source=bing");
		drive.manage().window().maximize();
		WebElement element = drive.findElement(By.xpath("//a[@href='/shop/kids']"));
		Actions kids= new Actions(drive);
		kids.moveToElement(element).build().perform();
		WebElement element1 = drive.findElement(By.xpath("//a[@class='desktop-categoryLink']"));
		Actions mask= new Actions(drive);
		mask.moveToElement(element1).click().build().perform();

	}

}
