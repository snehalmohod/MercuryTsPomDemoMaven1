package mt.mstr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.config.Config;

public class Signonpage 

{
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_signon.gif']")
	WebElement objsignonimg;
	
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusernm;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpasswd;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objsubmit;
	
	
	
	
	public void loadSignOnpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void verifySignOnpage()
	{
		boolean flag=objsignonimg.isDisplayed();
		System.out.println("SignOn page is displayed: "+flag);
	}
	
	public void enterUsername(String usernm)
	{
		objusernm.sendKeys(usernm);
	}
	
	public void enterPassword(String passwd)
	{
		objpasswd.sendKeys(passwd);
	}
	
	public void clickonSubmit()
	{
		objsubmit.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
