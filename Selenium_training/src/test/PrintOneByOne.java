package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOneByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("http://demowebshop.tricentis.com/register");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//a[@href='/books']")).click();
		 WebElement SortBy = driver.findElement(By.xpath("//select[@ id='products-orderby']"));
		 Select parti = new Select(SortBy);
		 List<WebElement>  print = parti.getOptions();
		 for(int i=0; i<print.size(); i++)
		 {
			 WebElement Sort1By = driver.findElement(By.xpath("//select[@ id='products-orderby']"));
			  Select Parti = new Select(Sort1By);
			 Parti.selectByIndex(i);
		 }
	}

}
