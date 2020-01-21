package robot_actions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;

public class File_uploding_usingrobot {

	public static void main(String[] args) throws Exception 
	{
        System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\nvn project 1\\browsers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		
		WebElement role_exp=driver.findElement(By.xpath("//button[@type='button'][contains(.,'I am a Professional')]"));
		
		role_exp.click();
		
		Thread.sleep(3000);
		WebElement upload_cv=driver.findElement(By.name("uploadCV"));
		new Actions(driver).click(upload_cv).perform();
		
		String text="C:\\Users\\ACER - PC\\Desktop\\Resume.docx";
		StringSelection stext=new StringSelection(text);
		
		Clipboard comp_clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		comp_clipboard.setContents(stext, stext);
		
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
