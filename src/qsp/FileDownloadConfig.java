package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		FirefoxProfile profile=new FirefoxProfile();
		String key="browser.helperApps.neverAsk.saveToDisk";
		String value="application/zip";
		profile.setPreference(key, value);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://docs.seleniumhq.org/download/");
		String xp="//td[.='Java']/..//a[.='Download']";
		driver.findElement(By.xpath(xp)).click();
		


		

	}

}
