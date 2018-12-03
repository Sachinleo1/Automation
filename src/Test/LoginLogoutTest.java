package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pom.FacebookLoginPage;

public class LoginLogoutTest {
	
	static{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		FacebookLoginPage fblg=new FacebookLoginPage(driver);
		fblg.enterEmailorPh("12345678");
		fblg.enterPwd("354678");
		fblg.ClickOnLogin();


	}

}
