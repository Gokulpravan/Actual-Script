package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://naukri.com");
    String Urltitle=driver.getTitle();
    System.out.println(Urltitle);
    
    driver.manage().window().maximize();
    
    driver.quit();
    
    
	}

}

