package sampleTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String link ="http://demowebshop.tricentis.com/";
       String email="jithan98@gmail.com";
       String pwd ="kingking";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get(link);
		drive.manage().window().maximize();
		drive.findElement(By.xpath("//a[text()='Log in']")).click();
		drive.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
		drive.findElement(By.xpath("//input[@class='password']")).sendKeys(pwd);
		drive.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	WebElement valid=drive.findElement(By.xpath("(//a[@class='account'])[1]"));
	    if(valid.getText().equalsIgnoreCase(email))
	    {
	    	System.out.println("The user is valid");
	    }
	}

}
