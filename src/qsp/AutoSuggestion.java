package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/?semcmpid=sem_F1167BY7_Brand_adcenter&s_kwcid=AL!739!10!75797663949918!75797749219933&ef_id=WWyaOAAAAIRqyU8-:20181122051727:s");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='_2kpuIQ']"));
		
		int count=autosuggestion.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++){
			WebElement sugg=autosuggestion.get(i);
			String text=sugg.getText();
			System.out.println(text);
		
		}
		
		driver.quit();

	}

}
