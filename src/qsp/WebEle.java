package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebEle {
	
	static{
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");


	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement fn=driver.findElement(By.id("username"));
		
		//to get Attribute we have to pass which attri
		String attri=fn.getAttribute("type");
		System.out.println("attri[value]: "+attri);
		Thread.sleep(1000);
		
		//to s
		
		
		
	}

}
