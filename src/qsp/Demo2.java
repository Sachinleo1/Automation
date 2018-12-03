package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=null;
		//1: Open browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		//2: Maximize browser
		driver.manage().window().maximize();
		
		//2: Enter url
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		//3: To nagivate to other page
		driver.navigate().to("https://facebook.com");
		Thread.sleep(1000);
		
		
		//4: to Nagivate to previous page
		driver.navigate().back();
		Thread.sleep(1000);
		
		//5: to nagivate to nextpage
		driver.navigate().forward();
		Thread.sleep(1000);
		 
		//6: to refresh current page
		driver.navigate().refresh();
		
		//7: to get title
		String s=driver.getTitle();
		System.out.println("Title :"+s);
		
		//8: To get current URL
		String url=driver.getCurrentUrl();
		System.out.println("Current url :"+url);
		
		Thread.sleep(1000);
		driver.close();
		}

	}


