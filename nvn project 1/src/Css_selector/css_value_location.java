package Css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_value_location {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium workspace\\\\nvn project 1\\\\browsers\\\\chromedriver.exe");
        
    	WebDriver driver=new ChromeDriver();
        driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
        driver.manage().window().maximize();
        
       WebElement location=driver.findElement(By.id("InvestRec"));
       location.click();
       String robot=location.getAttribute("id");
    	 
       System.out.println("class change"+robot);
       
       if(robot.contains("Invest"))
       {
    	   System.out.println("color change");
       }
       else
       System.out.println("color did not change");
       

	}

}
