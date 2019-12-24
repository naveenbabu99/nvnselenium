package window_switch;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_to_window {

	public static void main(String[] args) throws Exception 
	{
          System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
		
		  ChromeDriver driver=new ChromeDriver(); 
		  driver.get("https://epass.apcfss.in/");
		  Thread.sleep(3000);
		  
		  String Main_windowID=driver.getWindowHandle();
		  
		  driver.switchTo().frame(6);
		  driver.findElement(By.linkText("College Reports")).click();
		  driver.switchTo().defaultContent();
		  
		  
		  driver.switchTo().frame(5);
		  Thread.sleep(5000);
		  driver.findElement(By.linkText("DistrictWise Colleges Report")).click();
		  driver.switchTo().window("_new");
		  
		  new Select(driver.findElement(By.id("acyear"))).selectByValue("2016-17");
		  new Select(driver.findElement(By.id("distname"))).selectByIndex(6);
		  
		  driver.findElement(By.linkText("NARAYANA JUNIOR COLLEGE-24412")).click();
		  
		  Thread.sleep(10000);
		  driver.navigate().back();
		  
		  

	}

}
