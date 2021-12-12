package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDemows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.co.in");
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("http://demowebshop.tricentis.com/register");
    driver.findElement(By.className("ico-register")).click();
    driver.findElement(By.className("FirstName")).sendKeys("Gokul");
    driver.findElement(By.className("text-box single-line")).sendKeys("Jitthan");
    Thread.sleep(1000);
	}
	

}
