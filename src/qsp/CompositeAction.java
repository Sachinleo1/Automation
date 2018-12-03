package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		
		Thread.sleep(5000);

		Actions act=new Actions(driver);
		act.sendKeys(Keys.CONTROL).click(link).build().perform();
		
		Thread.sleep(5000);
		driver.quit();


	}

}
