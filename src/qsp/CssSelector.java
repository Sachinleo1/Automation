package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {
	
		public static void main(String[] args) throws InterruptedException{
			WebDriver driver=null;
			//1: Open browser
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//driver=new ChromeDriver();
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			
			//2: Maximize browser
			driver.manage().window().maximize();
			
			//2: Enter url
			driver.get("https://www.facebook.com/");
			
			//3: Enter Email or Phone
			driver.findElement(By.cssSelector("input[id='email']")).sendKeys("r.sachin006@gmail.com");
			Thread.sleep(1000);
			
			//4: Enter password
			driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("12345");
			Thread.sleep(1000);
			
			//5: Enter FirstName
			driver.findElement(By.cssSelector("input[id='u_0_j']")).sendKeys("Sachin");
			Thread.sleep(1000);
			
			//6: Enter SurName
			driver.findElement(By.cssSelector("input[id='u_0_l']")).sendKeys("R");
			Thread.sleep(1000);
			
			///7: Enter MobileNumber or Email
			driver.findElement(By.cssSelector("input[id='u_0_o']")).sendKeys("9738530978");
			Thread.sleep(1000);
			
			//8: Enter NewPassword
			driver.findElement(By.cssSelector("input[id='u_0_v']")).sendKeys("54321");
			Thread.sleep(1000);
			
			//9: Enter DOB
			
			//DAY
		   driver.findElement(By.cssSelector("select[id='day']")).sendKeys("8");
			Thread.sleep(1000);
			//Month
			driver.findElement(By.cssSelector("select[id='month']")).sendKeys("Apr");
			Thread.sleep(1000);
			//YEAR
			driver.findElement(By.cssSelector("select[id='year']")).sendKeys("1996");
			Thread.sleep(1000);
			
			//10: Select Gender
		/*	WebDriver d1= driver.findElement(By.cssSelector("select[id='u_0_a']"));
			d1.selectByIndex(4);
			Thread.sleep(1000);*/
		}
	}



