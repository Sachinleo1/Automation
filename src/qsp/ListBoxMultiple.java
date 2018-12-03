package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxMultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/SACHIN R/Desktop/Selenium html pages/ListMultiple.html");
		driver.manage().window().maximize();
		
		
		WebElement hotel = driver.findElement(By.id("maarya"));
		
		Select sel=new Select(hotel);
		//isMultiple
		if(sel.isMultiple()){
			System.out.println("it is multi select list");
		}
		else{
			System.out.println("it is single select list");
		}
		//select option
		sel.selectByIndex(1);
		sel.selectByValue("p");
		sel.selectByVisibleText("Fish");
		//deselect option
		Thread.sleep(1000);
		sel.deselectByIndex(1);
		sel.deselectAll();
		
		//getOptions
		java.util.List<WebElement> options = sel.getOptions();
		
		int count=options.size();
		System.out.println("Total options: "+count);
		
		for(WebElement opt:options){
			String text=opt.getText();
			System.out.println(text);
			}
		
		//select all options
		for(int i=0;i<count;i++){
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		driver.quit();

	}

}
