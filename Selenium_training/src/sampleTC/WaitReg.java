 package sampleTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitReg {

	public static void main(String[] args) 
	{
		String name= "King";
		String mail= "kingking@290";
		String pwd="king";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demowebshop.tricentis.com/");
		drive.manage().window().maximize();
		
		
		// Creat wait 
		
		WebElement reg =drive.findElement(By.xpath("//a[text()='Register']"));
		WebDriverWait wait = new WebDriverWait(drive,30);
		wait.until(ExpectedConditions.elementToBeClickable(reg));
		
		//register button click
		
		reg.click();
		 
		drive.findElement(By.xpath("(//input[@name='Gender'])[1]")).click();
		drive.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(name);
		drive.findElement(By.xpath("//input[@id='LastName']")).sendKeys(name);
		//drive.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		drive.findElement(By.xpath("//input[@id='Email']")).sendKeys(mail);
		drive.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		drive.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(pwd);
		
	WebElement clickReg=drive.findElement(By.xpath("//input[@id='register-button']"));
	WebDriverWait wait1 = new WebDriverWait(drive,30);
	wait1.until(ExpectedConditions.elementToBeClickable(clickReg));
	
	clickReg.click();
	}

}
