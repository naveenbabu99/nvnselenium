package switchto_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_between_frames {

	public static <webelement> void main(String[] args) throws Exception 
	{
        System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("menuFrame");
		driver.findElement(By.linkText("Fee Structure")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("bodyFrame");  //either we can choose id or number
		Thread.sleep(3000);
		WebElement university=driver.findElement(By.id("univ"));
		new Select(university).selectByValue("12");
		Thread.sleep(5000);
		WebElement cource=driver.findElement(By.id("coursesId"));
		new Select(cource).selectByValue("1033");
		Thread.sleep(3000);
	    WebElement yearid=driver.findElement(By.id("courseYearId"));
	    new Select(yearid).selectByValue("3");
		Thread.sleep(3000);
	    WebElement acadamic=driver.findElement(By.name("ac_year"));
	    new Select(acadamic).selectByValue("2016-17");
	    driver.findElement(By.name("submit")).click();
	    
	    
	    
	    
	    

	}

}
