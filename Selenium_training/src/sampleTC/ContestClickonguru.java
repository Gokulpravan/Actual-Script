package sampleTC;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ContestClickonguru {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("http://demo.guru99.com/test/simple_context_menu.html");
		drive.manage().window().maximize();
		WebElement edit= drive.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions edt =new Actions(drive);
		edt.contextClick(edit).build().perform();
		Thread.sleep(2000);
		
		//edit
		drive.findElement(By.xpath("//span[contains (text(),'Edit')]")).click();
		 Alert edtalt = drive.switchTo().alert();
		 System.out.println(edtalt.getText());
		 
		 if(edtalt.getText().equalsIgnoreCase("clicked: edit"))
		 {
			 edtalt.accept();
		 }
		
		 //change cut
		 edt.contextClick(edit).build().perform();
		 Thread.sleep(1000);
		 drive.findElement(By.xpath("//span[contains (text(),'Cut')]")).click();			
		 Alert cutalt = drive.switchTo().alert();
		 System.out.println(cutalt.getText());
		 
		 if(cutalt.getText().equalsIgnoreCase("clicked: cut"))
		 {
			 cutalt.accept();
		 }
		
		//copy
		 edt.contextClick(edit).build().perform();
		 Thread.sleep(1000);
		 drive.findElement(By.xpath("//span[contains (text(),'Copy')]")).click();
		 Alert cpyalt = drive.switchTo().alert();
		 System.out.println(cpyalt.getText());	 
		 if(cpyalt.getText().equalsIgnoreCase("clicked: copy"))
		 {
			 cpyalt.accept();
		 }
		 
		//past
		 edt.contextClick(edit).build().perform();
		 Thread.sleep(1000);
		 drive.findElement(By.xpath("//span[contains (text(),'Paste')]")).click();
		 Alert pastealt = drive.switchTo().alert();
		 System.out.println(pastealt.getText());
		 
		 if(pastealt.getText().equalsIgnoreCase("clicked: paste"))
		 {
			 pastealt.accept();
		 }
		 
		 //delete
		 edt.contextClick(edit).build().perform();
		 Thread.sleep(1000);
		 drive.findElement(By.xpath("//span[contains (text(),'Delete')]")).click();
			
			
		 Alert deletealt = drive.switchTo().alert();
		 System.out.println(deletealt.getText());
		 
		 if(deletealt.getText().equalsIgnoreCase("clicked: delete"))
		 {
			 deletealt.accept();
		 }
		 
		 //quit
		 edt.contextClick(edit).build().perform();
		 Thread.sleep(1000);
		 drive.findElement(By.xpath("//span[contains (text(),'Quit')]")).click();
			
			
		 Alert quitealt = drive.switchTo().alert();  
		 System.out.println(quitealt.getText());
		 
		 if(quitealt.getText().equalsIgnoreCase("clicked: quit"))
		 {
			 quitealt.accept();
		 }
		 
		 System.out.println("Completed");
	}

}
