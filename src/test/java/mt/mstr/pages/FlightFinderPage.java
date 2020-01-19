package mt.mstr.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.config.Config;
import mt.mstr.utility.CloseBrowser;
import mt.mstr.utility.LaunchApp;

public class FlightFinderPage
{
  @FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
  WebElement objFlightFinderimg;
	
  @FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
  WebElement objsignoff;
  
  
  public void loadFlightFinderpage()
  {
	  PageFactory.initElements(Config.driver, this);
  }
  
  
  public void verifyFlightFinderimg()
  {
	  boolean flag=objFlightFinderimg.isDisplayed();
	  System.out.println("Flight Finder image is displayed "+flag);
  }
  
  
  public void clickonSignoff()
  {
	  objsignoff.click();
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
		
		FlightFinderPage ff = new FlightFinderPage();
		ff.loadFlightFinderpage();
		ff.verifyFlightFinderimg();
		ff.clickonSignoff();
		
		CloseBrowser cb=new CloseBrowser();
		cb.closeBrowser();
		

	}

}
