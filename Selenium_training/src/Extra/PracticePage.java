package Extra;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticePage {

	public static void main(String[] args) throws InterruptedException 
	{
		String name="King";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		drive.manage().window().maximize();
		
		drive.findElement(By.xpath("(//input[@name='radioButton'])[1]")).click();
		Thread.sleep(1000);
		drive.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();
		Thread.sleep(1000);
		drive.findElement(By.xpath("(//input[@name='radioButton'])[3]")).click();
		Thread.sleep(1000);

		//for suggestions
		drive.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("Ind");
		Thread.sleep(1000);
		drive.findElement(By.xpath("(//div[@class='ui-menu-item-wrapper'])[1]")).click();
		
		//for droup down
		WebElement droupdown = drive.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		droupdown.click();
		Select  droupsel = new Select(droupdown);
		droupsel.selectByIndex(2);
		
		//check box
		
	List<WebElement> checkbox =drive.findElements(By.xpath("//input[@type='checkbox']"));
	for( WebElement check : checkbox)
	{
		check.click();
		Thread.sleep(1000);
		
	}
	Thread.sleep(1000);
		
	//Switch window
	
	drive.findElement(By.xpath("//button[@class='btn-style class1']")).click();
	String Switch =drive.getWindowHandle();
	Set<String> windows = drive.getWindowHandles();
	for(String Switchwin : windows)
	{
		drive.switchTo().window(Switchwin);
		System.out.println(drive.getTitle());
		 
		if(drive.getTitle().contains("QA Click"))
		{
			drive.close();
		}
	
	drive.switchTo().window(Switch);
	}
	
	// Switch to tab
	drive.findElement(By.xpath("//a[@id='opentab']")).click();
	String Switchtab =drive.getWindowHandle();
	Set<String> windowstab = drive.getWindowHandles();
	for(String Switchtotab : windowstab)
	{
		drive.switchTo().window(Switchtotab);
		System.out.println(drive.getTitle());
		if(drive.getTitle().contains("Rahul Shetty"))
		{
			drive.close();
		}
		drive.switchTo().window(Switchtab);  
	}	
	
	
	
	//Alert
	
	drive.findElement(By.xpath("//input[@class='inputs']")).sendKeys(name);
	drive.findElement(By.xpath("//input[@value='Alert']")).click();
	Alert singlepopup = drive.switchTo().alert();
	singlepopup.accept();
	
   //Web Table
	 List<WebElement> table = drive.findElements(By.xpath("(//table)[1]/tbody/tr/td[2]"));
	 
	 for(WebElement tables : table)
	 {
	System.out.println(tables.getText() + "  ");
	 }
	 System.out.println("=================================");
 List<WebElement> table1 = drive.findElements(By.xpath("(//table)[1]/tbody/tr/td[3]"));
	 
	 for(WebElement tables1 : table1)
	 {
	System.out.println(tables1.getText() + "  ");
	 }
	 
	 //Hide and show the text
	 
	 drive.findElement(By.xpath("//input[@name='show-hide']")).sendKeys("King");
	 Thread.sleep(1000);
	 drive.findElement(By.xpath("//input[@value='Hide']")).click();
	 Thread.sleep(1000);
	 drive.findElement(By.xpath("//input[@value='Show']")).click();
	 
	 
	 // Mouse hover
	 WebElement mousehov= drive.findElement(By.xpath("//button[@ id='mousehover']"));
	 Actions hover = new Actions(drive);
	 hover.moveToElement(mousehov).build().perform();
	 System.out.println("Completed");
	 Thread.sleep(1000);
	 drive.quit();
	}
}
