package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSingle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/SACHIN R/Desktop/Selenium html pages/ListSingle.html");
		driver.manage().window().maximize();
		
		
		WebElement hotel=driver.findElement(By.id("maarya"));
		Select sel=new Select(hotel);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		driver.quit();

	}

}
