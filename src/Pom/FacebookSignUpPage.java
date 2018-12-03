package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpPage {
	
	//Deceleration
	@FindBy(id="u_0_j")
	private WebElement fn;
	
	@FindBy(id="u_0_l")
	private WebElement srn;
	
	@FindBy(id="u_0_o")
	private WebElement empn;
	
	@FindBy(id="u_0_v")
	private WebElement npwd;
/*	
	@FindBy(id="day")
	private WebElement date;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	*/
	@FindBy(id="u_0_6")
	private WebElement male;
	
	@FindBy(id="u_0_7")
	private WebElement female;
	
	@FindBy(id="u_0_11")
	private WebElement supBT;
	
	//Select dd= new Select(date);
	//Select mm= new Select(month);
	//Select yy= new Select(year);
	
	//Initialization
	public FacebookSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	//Utilization
	public void firstName(String fname)
	{
		fn.sendKeys(fname);
	}
	
	public void surName(String sname)
	{
		srn.sendKeys(sname);
	}
	
	public void emailPh(String email)
	{
		empn.sendKeys(email);
	}
	
	public void newPwd(String npass)
	{
		npwd.sendKeys(npass);
	}
	
	/*public void day(int day)
	{
		dd.selectByIndex(day);
	}
	public void month(int mon)
	{
		mm.selectByIndex(mon);
	}
	public void year(int yr)
	{
		yy.selectByIndex(yr);
	}*/
	
	public void gend(String gender)
	{
		if(gender.equals("male"))
		{
			male.click();
		}
		else
		{
			female.click();
		}
	}
	
	public void submit()
	{
		supBT.click();
	}
	

}
