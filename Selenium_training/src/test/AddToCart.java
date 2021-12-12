package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(1000);
         
	List<WebElement> element = driver.findElements(By.xpath("//input[@value ='Add to cart']"));
	
		int count = element.size();
		
		System.out.println("The number of elements are " + count);
		
	}
	
}


