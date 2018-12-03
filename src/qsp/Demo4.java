package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the browser: ");
		String browser=sc.nextLine();
		WebDriver driver= null;
		
		if(browser.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();//upcasting
		}
		else if(browser.equalsIgnoreCase("gc")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();//upcasting
		}
	
		
		Thread.sleep(2000);
		driver.quit();
		sc.close();

	}

}
