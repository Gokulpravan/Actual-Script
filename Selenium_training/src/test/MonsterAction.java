package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MonsterAction {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.monsterindia.com/search/job-search");
		drive.manage().window().maximize();
		WebElement find = drive.findElement(By.xpath("//a[@data-check='menutab']"));
		Actions finding = new Actions(drive);
		finding.moveToElement(find).build().perform();
		WebElement jobsskill=drive.findElement(By.xpath("//a[@href='javascript:void(0);']"));
		Actions fidSkill = new Actions(drive);
		fidSkill.moveToElement(jobsskill).click().build().perform();
		WebElement javaJob =drive.findElement(By.xpath("//a[@href='https://www.monsterindia.com/search/java-jobs']"));
		Actions java = new Actions(drive);
		java.moveToElement(javaJob).click().build().perform();
	}

}
