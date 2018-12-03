package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBrick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://home.redbrickhealth.com/");
		driver.manage().window().maximize();

		WebElement link = driver.findElement(By.xpath("//a[.='Solutions']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(link).perform();
	
		String xp="//li[@id='menu-item-8464']/..//a[contains(@href,'https://home.redbrickhealth.com/solutions/')]";
		List<WebElement> menus = driver.findElements(By.xpath(xp));
		int count = menus.size()-1;
		System.out.println(count);
		
		for(int i=1;i<count+1;i++){
			WebElement menu=menus.get(i);
			String text=menu.getText();
			System.out.println(text);
		}
		driver.close();

	}

}
