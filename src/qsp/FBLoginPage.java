package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {

	//declaration
	@FindBy(id ="email")
	private WebElement emailTb;
	
	@FindBy(id ="pass")
	private WebElement pw;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;
	
	//initialisation
	public FBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
    public void enterEmail(String em)
    {
    	emailTb.sendKeys(em);
    }
    public void enterPassword(String p)
    {
    	pw.sendKeys(p);
    }
    public void clickLogin()
    {
    	login.click();
    }

	}

