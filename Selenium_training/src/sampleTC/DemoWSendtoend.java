package sampleTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWSendtoend {

	public static void main(String[] args) throws InterruptedException 
	{
		String firstname= "Gokul";
		String lastname="Pravan";
		String email ="gokuljitthan98@gmail.com";
		String pwd="KingKingking";
		String link="http://demowebshop.tricentis.com/";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get(link);
		drive.manage().window().maximize();
		drive.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(1000);
		drive.findElement(By.xpath("//input[@name='Gender']")).click();
		drive.findElement(By.xpath("//input[contains(@data-val,'true')][1]")).sendKeys(firstname);
		drive.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lastname);
		drive.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
		drive.findElement(By.xpath("//input[@name='Password']")).sendKeys(pwd);
		drive.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(pwd);
		drive.findElement(By.xpath("(//input[contains(@class,'button-1')])[3]")).click();
		
		drive.findElement(By.xpath("//a[@href='/login']")).click();
		drive.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
		drive.findElement(By.xpath("//input[@name='Password']")).sendKeys(pwd);
		drive.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
