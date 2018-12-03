package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/SACHIN R/Desktop/Selenium html pages/page1.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fn")).sendKeys("Sachin");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("mn")).sendKeys("Leo");
		
		driver .switchTo().parentFrame();
		
		driver.findElement(By.id("ln")).sendKeys("R");

	}

}
