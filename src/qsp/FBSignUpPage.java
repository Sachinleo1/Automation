package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FBSignUpPage {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement usr;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lname;
	
	@FindBy(xpath="//input[@id='u_0_o']")
	private WebElement mail;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	private WebElement mailcomf;
	
	@FindBy(xpath="//input[@id='u_0_v']")
	private WebElement pw;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement dayDob;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement monDob;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement yrDob;
	
	@FindBy(xpath="//input[@name='sex']")
	private WebElement radio;
	
	@FindBy(xpath="//button[@id='u_0_11']")
    private WebElement sign;
	
	//initialization
	public FBSignUpPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void enterFName(String fn){
		usr.sendKeys(fn);
	}
	public void enterLName(String ln){
		lname.sendKeys(ln);
	}
	public void enterEmail(String em){
		mail.sendKeys("r.sachin006@gmail.com");
	}
	public void enterPassW(String p){
	pw.sendKeys(p);
	}
	public void enterMailConf(String emconf){
	mailcomf.sendKeys(emconf);
	}
	public void enterDay(String day){
		Select sel=new Select(dayDob);
		sel.selectByValue(day);
	}
	public void enterMonth(String month)
	{
		Select sel=new Select(monDob);
		sel.selectByValue(month);
	}
	public void enterYear(String year)
	{
		Select sel=new Select(yrDob);
		sel.selectByValue(year);
	}
	public void sex(){
		radio.click();
	}
	public void signUp(){
		sign.click();
	}

}
