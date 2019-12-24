package Css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cssselector_cls {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.cssSelector("td[width=\"185\"]>input")).sendKeys("naveen");
		driver.findElement(By.cssSelector("td[valign=\"bottom\"]>input[type=text")).sendKeys("naveenbabu");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("td>input[type=password]")).sendKeys("naveen123");
		driver.findElement(By.cssSelector("td>input[name*=confirm]")).sendKeys("naveen123");
		driver.findElement(By.cssSelector("td [width=\"185\"] input[name*=altemail]")).sendKeys("nvn@gmail.com");
		//driver.findElement(By.cssSelector("td>input[maxlength=\"100\"]")).sendKeys("nvn@gmail.com");
		driver.findElement(By.cssSelector("div>input#mobno")).sendKeys("9966733147");
		driver.findElement(By.cssSelector("td[colspan=\"3\"]>select[name*=DOB_Day]>option[value=\"09\"]")).click();
		driver.findElement(By.cssSelector("td[colspan=\"3\"]>select[name*=DOB_Mon]>option[value=\"09\"]")).click();
		driver.findElement(By.cssSelector("td[colspan=\"3\"]>select[name*=DOB_Y]>option[value=\"2019\"]")).click();
		driver.findElement(By.cssSelector("td[colspan=\"3\"]>input[value=\"f\"]")).click();
		driver.findElement(By.cssSelector("td[colspan=\"3\"]>select[name*=\"coun\"]>option[value=\"4\"]")).click();
		Thread.sleep(10000);
		//driver.findElement(By.cssSelector("td[colspan=\"3\"]>select[id=\"country\"]>option[label=\"Andorra\"]")).click();
		driver.findElement(By.cssSelector("td[colspan=\"3\"]>select[name*=city]>option[label=\"Bangalore\"]")).click();
		
        //driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("naveen123");	
       // driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("naveen123");
        //driver.findElement(By.xpath("(//input[contains(@name,'altemaild31a78f4')])[1]")).sendKeys("naveenbabu@gmail.com");
	   // driver.findElement(By.cssSelector("td[width=\"185\"]>input[name= altemaild31a78f4]")).sendKeys("naveenbabu@gmail.com");
	
	
	
	
	}

}
