package sampleTC;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.naukri.com/");
		drive.manage().window().maximize();
		String nakuri = drive.getWindowHandle();
		Set<String> techmahi = drive.getWindowHandles();
		for(String naukrieli : techmahi)
		{
			drive.switchTo().window(naukrieli);
			System.out.println(drive.getTitle());
			if(drive.getTitle().equalsIgnoreCase("Cognizant"))
			{
				
				drive.close();
			}
			drive.switchTo().window(nakuri);  
		}
		drive.quit();
	}

}
