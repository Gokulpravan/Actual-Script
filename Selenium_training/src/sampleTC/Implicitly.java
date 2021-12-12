package sampleTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demo.guru99.com/test/simple_context_menu.html");
		drive.manage().window().maximize();
		
		//Implicit wait
		
		drive.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
		drive.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		drive.findElement(By.xpath("//a[text()='Delete Customer Form']")).click();
		drive.findElement(By.xpath("//input[@name='cusid']")).sendKeys("King");
		drive.findElement(By.xpath("//input[@name='submit']")).click();
		

		
		Alert clickalt = drive.switchTo().alert();
		clickalt.accept();
		
		 
		Alert clickalt1 = drive.switchTo().alert();
		clickalt1.accept();
          drive.close();  
	
	}

}
