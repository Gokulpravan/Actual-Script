package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithRadioBtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demowebshop.tricentis.com/");
		drive.manage().window().maximize();
		WebElement RadioBtn=drive.findElement(By.xpath("//input[@value='1']"));
		RadioBtn.click();
		if(RadioBtn.isSelected())
		{
			System.out.println("Radio button is selected");
		WebElement Vote =drive.findElement(By.xpath("//input[@value='Vote']"));
		if(Vote.isEnabled())
		{
			System.out.println("Vote button is enabled");
			Vote.click();
		}
		System.out.println("Completed");
		}
		Thread.sleep(1000);
		drive.close();   
	}

}
