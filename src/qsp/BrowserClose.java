package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserClose {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=null;
		//1: Open browser
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		
		//2: Maximize browser
		driver.manage().window().maximize();
		
		//2: Enter url
		driver.get("file:///C:/Users/SACHIN%20R/Desktop/sample.html");
		
		/*//3: By usig id
		driver.findElement(By.id("fp")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//4: By Using name
		driver.findElement(By.name("forgot")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//5: By ClassName 
		driver.findElement(By.className("pass")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//6: By using tagName
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//7: By using linkText()
		driver.findElement(By.linkText("Forgot Password??")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//8: By using partialLinkText
		driver.findElement(By.partialLinkText("Inbox")).click();
		Thread.sleep(2000);
		driver.navigate().back();*/
		
		//9: By cssSelector
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sachin");
		Thread.sleep(2000);
		
		
		//driver.quit();
}
}