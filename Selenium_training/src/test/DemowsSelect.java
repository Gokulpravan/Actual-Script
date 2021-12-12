package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemowsSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("http://demowebshop.tricentis.com/register");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//a[@href='/books']")).click();
		   WebElement sortby= driver.findElement(By.xpath("//select[@name='products-orderby']"));
		    Select Selet =new Select(sortby);
		    Selet.selectByIndex(3);
		    WebElement disp = driver.findElement(By.xpath("//select[@name='products-pagesize']"));
		    Select Selet1 = new Select(disp);
		    Selet1.selectByIndex(2);
		    WebElement viewas = driver.findElement(By.xpath("//select[@name='products-viewmode']"));
		    Select Selet2 = new Select(viewas);
		    Selet1.selectByIndex(1);
	         driver.close();
		    
	}

}
