package Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pom.FacebookSignUpPage;



public class FbSignupTest {
	
	static{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		FacebookSignUpPage fbsp=new FacebookSignUpPage(driver);
		fbsp.firstName("sachin");
		Thread.sleep(1000);
		fbsp.surName("leo");
		Thread.sleep(1000);
		fbsp.emailPh("r.sachin006gmail.com");
		Thread.sleep(1000);
		fbsp.newPwd("sa12345");
		Thread.sleep(1000);
		//fbsp.day(2);
	//	fbsp.month(4);
		//fbsp.year(1997);
		//fbsp.gend("male");
		fbsp.submit();
		


	}

}
