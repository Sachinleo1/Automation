package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ActitimeLogin {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=null;
		//1: Open browser
		driver=new FirefoxDriver();
		
		//2: Maximize browser
		driver.manage().window().maximize();
		
		//2: Enter url
		driver.get("https://demo.actitime.com/login.do");
		
		//3: Enter UserName
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//4: Enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//5: click on login
		driver.findElement(By.xpath("//div[.='Login ']")).click();

}
}
