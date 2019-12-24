package browser_launch;

import java.sql.Driver;
import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
		
		ChromeDriver chrome=new ChromeDriver();
		
		//chrome.get("http://google.com");
		chrome.get("http://facebook.com");
	    chrome.manage().window().maximize();
	    
	    chrome.findElement(By.id("email")).clear();
	    chrome.findElement(By.id("email")).sendKeys("9966733147");
	    chrome.findElement(By.id("pass")).clear();
	    chrome.findElement(By.id("pass")).sendKeys("nvn123");
	    chrome.findElement(By.id("u_0_2")).click();
	    
	}

}
