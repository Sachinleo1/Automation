package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FacebookLoginPage {
	
	
	//Decleration
	@FindBy(id="email")
	private WebElement emailTb;
	
	@FindBy(id="pass")
	private WebElement pwdTb;
	
	@FindBy(id="u_0_2")
	private WebElement loginBt;
	
	
	//Initilization
	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	//Utilization
	public void enterEmailorPh(String em)
	{
		emailTb.sendKeys(em);
	}
	
	public void enterPwd(String pw)
	{
		pwdTb.sendKeys(pw);
	}
	
	public void ClickOnLogin()
	{
		loginBt.click();
	}
	

}
