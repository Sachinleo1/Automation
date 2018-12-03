package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		
		Actions act=new Actions(driver);
		act.contextClick(link).perform();
		
		Thread.sleep(1000);
		
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_W);
		ro.keyRelease(KeyEvent.VK_W);
		
		Thread.sleep(5000);
		driver.quit();

		
		

	}

}
