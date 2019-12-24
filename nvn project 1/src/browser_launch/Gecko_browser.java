package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko_browser {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\geckodriver.exe");
		   
		FirefoxDriver driver=new FirefoxDriver();
		
		
		driver.get("http://facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("naveenbabu");
        driver.findElement(By.id("pass")).sendKeys("nvn12345");
        driver.findElement(By.id("u_0_b")).click();

	}

}
