package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		

		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Sachin");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Leo");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("r.sachin006@gmail.com");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("sachin777");
		driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("r.sachin006@gmail.com");
		driver.findElement(By.cssSelector("input[id='u_0_a']")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		Select sel=new Select(day);
		sel.selectByVisibleText("02");
		
		WebElement month=driver.findElement(By.id("month"));
		Select sel1=new Select(month);
		sel1.selectByValue("04");
		
		WebElement year=driver.findElement(By.id("year"));
		Select sel2=new Select(year);
		sel2.selectByValue("1996");

		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
