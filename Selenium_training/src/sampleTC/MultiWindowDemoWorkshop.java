package sampleTC;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowDemoWorkshop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demowebshop.tricentis.com/");
		drive.manage().window().maximize();
		Thread.sleep(1000);
		drive.findElement(By.xpath("//a[text()='Facebook']")).click();
		String Webshop =drive.getWindowHandle();
		Set<String> windows = drive.getWindowHandles();
		for(String facebook : windows)
		{
			drive.switchTo().window(facebook);
			System.out.println(drive.getTitle());
			if(drive.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook"))
			{
				drive.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("sdkjhgfddfg@gmail.com");
			 drive.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1s3d4f4");
			 Thread.sleep(1000);
			 drive.close();
			}
			Thread.sleep(1000);
			drive.switchTo().window(Webshop);
			drive.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Cars");
			drive.findElement(By.xpath("//input[@type='submit']")).click();
			 
		}
	
		
	}

}
