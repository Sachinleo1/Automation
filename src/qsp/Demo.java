package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {
	
public static void main(String args[]) throws InterruptedException
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter browser");
	String browser=sc.nextLine();
	
	
//String key="";
//String value="";
	
	WebDriver driver=null;
	if(browser.equals("ch"))
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	//Thread.sleep(1000);
	//driver.close();
	}
	else if(browser.equals("ie"))
	{
     System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
     driver=new InternetExplorerDriver();
     //Thread.sleep(1000);
 	//driver.close();
	}
	Thread.sleep(3000);
	driver.close();
	
	sc.close();
 }
}
