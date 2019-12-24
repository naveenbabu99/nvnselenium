package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_implicity_timegaps {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/"); //by giving diffrent url for to change right url while runing
			driver.manage().window().maximize();
			System.out.println("browser launched");
			
			driver.findElement(By.id("RoundTrip")).click();
			driver.findElement(By.id("FromTag")).sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		
	        driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
	        driver.findElement(By.id("ToTag")).sendKeys("del");
	       
	        driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
	        driver.findElement(By.linkText("23")).click();
	        driver.findElement(By.linkText("25")).click();
	}

}
