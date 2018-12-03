package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FBSignUpPage su= new FBSignUpPage(driver);
		su.enterFName("Sachin");
		su.enterLName("Leo");
		su.enterEmail("r.sachin006@gmail.com");
		su.enterMailConf("r.sachin006@gmail.com");
		su.enterPassW("123456");
		su.enterDay("08");
		su.enterMonth("04");
		su.enterYear("1996");
		su.sex();
		su.signUp();	

	}

}
