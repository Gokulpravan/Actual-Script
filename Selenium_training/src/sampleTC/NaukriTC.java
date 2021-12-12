package sampleTC;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriTC {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.naukri.com/");
		drive.manage().window().maximize();
		
		//impicit wait
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String nakuri = drive.getWindowHandle();
		Set<String> cogni = drive.getWindowHandles();
		for(String naukrieli : cogni)
		{
			drive.switchTo().window(naukrieli);
			System.out.println(drive.getTitle());
			if(drive.getTitle().equalsIgnoreCase("Cognizant"))
			{
				
				drive.close();
			}
		}
			drive.switchTo().window(nakuri);  
	   
		
		 WebElement jobs = drive.findElement(By.xpath("//div[text()='Jobs']"));
	     Actions jobact=new Actions(drive);
	     jobact.moveToElement(jobs).build().perform();
	     drive.findElement(By.xpath("//a[text()='Advanced Search']")).click();
	    
	      drive.quit();	
	}
}
