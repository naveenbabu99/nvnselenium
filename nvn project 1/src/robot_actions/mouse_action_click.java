package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouse_action_click {

	public static void main(String[] args) throws Exception
	{
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER - PC\\git\\nvnselenium\\nvnselenium\\nvn project 1\\browsers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		robot.setAutoDelay(3000);
		
		
		
		
		
		
	}

}
