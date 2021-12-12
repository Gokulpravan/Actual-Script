package sampleTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWorkshopEndtoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String link="http://demowebshop.tricentis.com/";
		String search="Mobile";
		String from = "5000";
		String to = "15000";
		int number =2;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get(link);
		drive.manage().window().maximize();
		drive.findElement(By.xpath("//input[@value='Search store']")).sendKeys(search);
		drive.findElement(By.xpath("//input[@value='Search']")).click();
		drive.findElement(By.xpath("(//input[@value='true'])[1]")).click();
		WebElement advance = drive.findElement(By.xpath("//select [@data-val='true']"));
		Select adv = new Select(advance);
		adv.selectByIndex(number);
		WebElement advance1 = drive.findElement(By.xpath("(//select [@data-val='true'])[1]"));
		Select adv1 = new Select(advance1);
		drive.findElement(By.xpath("//input[@class='price-from']")).sendKeys(from);
		drive.findElement(By.xpath("//input[@class='price-to']")).sendKeys(to);
		drive.findElement(By.xpath("(//input[@name='Sid'])[1]")).click();
		drive.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	}

}
