package mt.mstr.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstr.pages.FlightFinderPage;
import mt.mstr.pages.Loginpage;
import mt.mstr.pages.Signonpage;
import mt.mstr.utility.CloseBrowser;

import org.testng.annotations.Test;

public class Login {
  
  @Parameters({"usernm","passwd"})
  @Test(priority=1)
  public void executeLoginwithValidds(String username,String password) 
  {
	  
	  Loginpage lg= new Loginpage();
	  lg.loadLoginpage();
	  lg.enterUsername(username);
	  lg.enterPassword(password);
	  lg.clickonLogin();
	  
	  FlightFinderPage ff= new FlightFinderPage();
	  ff.loadFlightFinderpage();
	  ff.verifyFlightFinderimg();
	  ff.clickonSignoff();
	  
	  /*CloseBrowser cb= new CloseBrowser();
	  cb.closeBrowser();*/
  }
  
  @Parameters({"invalidusernm","invalidpasswd"})
  @Test(priority=3)
  public void executeLoginwithInvalidds(String username,String password)
  {
	  Loginpage lg= new Loginpage();
	  lg.loadLoginpage();
	  lg.enterUsername(username);
	  lg.enterPassword(password);
	  lg.clickonLogin();	
	  
	  /*CloseBrowser cb= new CloseBrowser();
	  cb.closeBrowser();*/
	  
	  
  }
  
  @Parameters({"invalidusernm","invalidpasswd"})
  @Test(priority=2)
  public void executeLoginwithInvalidds1(String username,String password)
  {
	  Signonpage sp= new Signonpage();
	  sp.loadSignOnpage();
	  sp.enterUsername(username);
	  sp.enterPassword(password);
	  sp.clickonSubmit();
	  sp.verifySignOnpage();
	  CloseBrowser cb= new CloseBrowser();
	  cb.closeBrowser();
  }
  
  
  
  
  
  
  
}
