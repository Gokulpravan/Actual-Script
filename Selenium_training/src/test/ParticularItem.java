package test;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParticularItem 
{
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("http://demowebshop.tricentis.com/register");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//a[@href='/books']")).click();
		    WebElement sortBy =driver.findElement(By.xpath("//select[@ id='products-orderby']"));
		    Select sort1 = new Select(sortBy);
		   
			 String find = "Created on";
		    List<WebElement>  sort = sort1.getOptions();
		 
		    for(WebElement SortBy : sort)
		    {
		          boolean  Finded =SortBy.getText().contains(find);  
		    
		    	if(Finded==true)
		    	{
		    		System.out.println(sort.indexOf(SortBy));
		    	}
		    }
	}
}
