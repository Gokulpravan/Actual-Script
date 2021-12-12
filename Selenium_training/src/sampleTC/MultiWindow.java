package sampleTC;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.naukri.com/");
		drive.manage().window().maximize();
		
		String parent =drive.getWindowHandle();
		System.out.println(parent);
		Set<String> child=drive.getWindowHandles();
		System.out.println(child);
		for(String window : child)
		{
			drive.switchTo().window(window);
			System.out.println(drive.getTitle());
		}
		drive.switchTo().window(parent);
		drive.close();
	}

}
