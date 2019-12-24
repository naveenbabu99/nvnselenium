package find_drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://cleartrip.com");
		Thread.sleep(5000);
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("FromTag")).sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Thread.sleep(10000);
        driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
        driver.findElement(By.id("ToTag")).sendKeys("del");
        Thread.sleep(10000);
        driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
        driver.findElement(By.linkText("23")).click();
        driver.findElement(By.linkText("25")).click();
        
        
        
	}
	

}
