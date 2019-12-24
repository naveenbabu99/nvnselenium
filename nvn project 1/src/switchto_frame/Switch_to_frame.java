package switchto_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_frame {

	public static void main(String[] args) throws Exception
	{
System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
	
	     driver.get("https://www.seleniumhq.org/");
	     Thread.sleep(3000);
		driver.findElement(By.linkText("Download")).click();
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Javadoc")).click();
	    
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
	    driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	    driver.switchTo().defaultContent();
	    
	    Thread.sleep(3000);
	    driver.switchTo().frame(1);
	    driver.findElement(By.linkText("DefaultRemoteCommand")).click();
	    driver.switchTo().defaultContent();
	    
	    Thread.sleep(3000);
	    driver.switchTo().frame(2);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[@href='#method.summary'])[1]")).click();
	    driver.findElement(By.linkText("Static Methods")).click();
	    
	}

}
