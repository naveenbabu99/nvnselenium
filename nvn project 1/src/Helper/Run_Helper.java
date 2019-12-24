package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Helper
{
	WebDriver driver;
	String Browser_path= null;
	int implicit_timeout;
	String UID;
	String PWD;
	String URL;
    
	public void Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}
		
	public void user_signin()
	{
		/*WebElement email_Name= driver.findElement(By.id("identifierId"));
		email_Name.clear();
		email_Name.sendKeys(UID);
		
		WebElement pass_name=driver.findElement(By.id(""));
		pass_name.clear();
		pass_name.sendKeys("12345");*/
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(UID);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(PWD);
	}

}
