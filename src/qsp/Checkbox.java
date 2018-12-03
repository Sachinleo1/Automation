package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {
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
		driver.get("file:///C:/Users/SACHIN%20R/Desktop/Selenium%20html%20pages/checkbox.html");
		
		//3: select Checkbox
		
	 List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox'])"));
	 
	 //4: count the number of check box
	    int count = cb.size();
	    System.out.println(count);
	    
	 //Select checkBoxZ
	   WebElement ac=cb.get(1);
	  ac.click();
}
	
}
