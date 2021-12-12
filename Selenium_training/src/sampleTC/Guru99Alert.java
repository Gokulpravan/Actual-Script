package sampleTC;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		String name="King";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demo.guru99.com/test/delete_customer.php");
		drive.manage().window().maximize();
		drive.findElement(By.xpath("//input[@type='text']")).sendKeys(name);
		WebElement submit = drive.findElement(By.xpath("//input[@type='submit']"));
		Actions subact = new Actions(drive);
		subact.click(submit).build().perform();
		
		 Thread.sleep(1000);
		 Alert alt=drive.switchTo().alert();
		 alt.accept();
		 Thread.sleep(2000);
		 Alert alt1=drive.switchTo().alert();
		 alt1.accept();
		drive.close();
	}

}
