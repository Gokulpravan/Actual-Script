package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageUpandDown {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.myntra.com/?utm_source=perf_bing_traffic&utm_medium=perf_bing_traffic&utm_campaign=Bing_Brand_Exact_Desktop&utm_source=bing");
		drive.manage().window().maximize();
		Actions pageupd= new Actions(drive);
		for(int i=1; i<4; i++)
		{
		pageupd.sendKeys(Keys.PAGE_DOWN).build().perform();
		}
		Thread.sleep(1000);
		for(int m=1;m<4; m++)
		{
			pageupd.sendKeys(Keys.PAGE_UP).build().perform();
		}
	}

}
