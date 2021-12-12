package sampleTC;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demo.guru99.com/test/simple_context_menu.html");
		drive.manage().window().maximize();
	    WebElement button =	 drive.findElement(By.xpath("//button[contains(text(),'Double')]"));
	    Actions btnaction = new Actions(drive);
	    btnaction.doubleClick(button).build().perform();
	    
	    Thread.sleep(2000);
	    Alert alr = drive.switchTo().alert();
	    alr.accept();

	    	}

}
