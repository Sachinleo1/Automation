package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiBuildNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String xp="//div[@class='topMenuButton']/..//div[@class='popup_menu_button popup_menu_button_support']";
		driver.findElement(By.xpath(xp)).click();
//		
//		Alert a=driver.switchTo().alert();
//		a.accept();
		
		driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
		WebElement span = driver.findElement(By.xpath("//span[.='(build 40469)']"));
		String text=span.getText();
		System.out.println(text);

	}

}
