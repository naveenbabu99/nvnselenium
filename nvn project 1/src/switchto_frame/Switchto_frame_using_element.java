package switchto_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_frame_using_element {

	public static void main(String[] args) throws Exception
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.redbus.in/hotels/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[@class='login-btn'][contains(.,'Sign in')]")).click();
			//driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.className("modalIframe"));
			
			driver.switchTo().frame(1);
			Thread.sleep(3000);
            driver.findElement(By.xpath("//input[contains(@id,'mobileNoInp')]")).clear();
        
            driver.findElement(By.xpath("//input[contains(@id,'mobileNoInp')]")).sendKeys("9966733147");
		    
			
	}

}
