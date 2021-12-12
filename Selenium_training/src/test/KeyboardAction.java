package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.myntra.com/?utm_source=perf_bing_traffic&utm_medium=perf_bing_traffic&utm_campaign=Bing_Brand_Exact_Desktop&utm_source=bing");
		drive.manage().window().maximize();
		WebElement search = drive.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	    Actions forSearch = new Actions(drive);
	    forSearch.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("shirts").keyUp(Keys.SHIFT).keyDown(Keys.F5).keyUp(Keys.F5).build().perform();
	}

}
