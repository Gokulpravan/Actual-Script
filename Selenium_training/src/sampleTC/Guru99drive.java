package sampleTC;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Guru99drive {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demo.guru99.com/test/simple_context_menu.html");
		drive.manage().window().maximize();
	    
		drive.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		drive.findElement(By.xpath("//a[text()='Delete Customer Form']")).click();
		drive.findElement(By.xpath("//input[@name='cusid']")).sendKeys("King");
		WebElement clicksub=drive.findElement(By.xpath("//input[@name='submit']"));
		
		WebDriverWait wait = new WebDriverWait(drive,30);
		wait.until(ExpectedConditions.elementToBeClickable(clicksub));
		clicksub.click();
		
		Alert clickalt = drive.switchTo().alert();
		clickalt.accept();
		 Thread.sleep(1000); 
		 
		Alert clickalt1 = drive.switchTo().alert();
		clickalt1.accept();
		
	}

}
