package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to enter url
		driver.get("http://www.google.co.in/");
		Thread.sleep(1000);
		
		//to enter next url
		driver.navigate().to("http://www.facebook.co.in");
		Thread.sleep(1000);
		//to navigate back
		driver.navigate().back();
		Thread.sleep(1000);
		//to navigate forward
		driver.navigate().forward();
		Thread.sleep(1000);
		//to refresh the page
		driver.navigate().refresh();
		
		//to maximize
		driver.manage().window().maximize();
		
		//get url
		String url=driver.getCurrentUrl();
		System.out.println("URL: "+url);
		//get title
		String title=driver.getTitle();
		System.out.println("Title: "+title);
		//get pagesrc
		//String pageSrc=driver.getPageSource();
		//System.out.println(pageSrc);
		Thread.sleep(1000);
		driver.quit();
		
		
		

	}

}
