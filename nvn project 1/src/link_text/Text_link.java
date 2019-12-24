package link_text;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Text_link {

	public static void main(String[] args) throws Exception 
	{
        System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		//chrome.get("http://google.com");
		driver.get("http://facebook.com");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    //chrome.findElement(By.id("u_0_b")).click();
		//chrome.findElementByLinkText("Gmail").click();
		//chrome.findElementByLinkText("Sign in").click();
		
		//driver.findElement(By.id("email")).sendKeys("naveen");
		//driver.findElement(By.id("pass")).sendKeys("123nvn");
		//driver.findElement(By.id("u_0_b")).click();
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("5");
		new Select(driver.findElement(By.id("month"))).selectByValue("3");
		new Select(driver.findElement(By.id("year"))).selectByValue("2010");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.id("u_0_15")).click();

	}

}
