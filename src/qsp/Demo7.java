package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sachin/Desktop/sample.html");
		
		//By using id
		driver.findElement(By.id("fp")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//By using name
		driver.findElement(By.name("forgot")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//By using className
		driver.findElement(By.className("pass")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//by using tagName
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//By using linkText
		driver.findElement(By.linkText("inbox(20)")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		//By using partialLinkText
		driver.findElement(By.partialLinkText("inbox")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.quit();
		
		

	}

}
