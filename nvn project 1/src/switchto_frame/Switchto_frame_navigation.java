package switchto_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_frame_navigation {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.redbus.in/account?pageName=Hotels");
		
		WebElement mobile_no=driver.findElement(By.xpath("//input[contains(@id,'mobileNoInp')]"));
		mobile_no.clear();
		mobile_no.sendKeys("9966733147");

	}

}
