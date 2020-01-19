package mt.mstr.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.config.Config;
import mt.mstr.utility.LaunchApp;

public class Loginpage 
{
  
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusername;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objlogin;
	
	
	public void loadLoginpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterUsername(String username)
	{
		objusername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		objpassword.sendKeys(password);
	}
	
	public void clickonLogin()
	{
		objlogin.click();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException 
	{
		LaunchApp lc= new LaunchApp();
		lc.openBrowser("chrome");
		lc.enterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
		lc.maximizeBrowser();
		lc.waittillLOginPageLoaded(15);
		
		Loginpage lg= new Loginpage();
		lg.loadLoginpage();
		lg.enterUsername("Suvidyap1");
		lg.enterPassword("P@ssword1");
		lg.clickonLogin();

	}

}
