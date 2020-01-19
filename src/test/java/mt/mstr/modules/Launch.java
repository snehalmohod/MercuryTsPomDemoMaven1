package mt.mstr.modules;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstr.utility.LaunchApp;

import org.testng.annotations.Test;

public class Launch 

{

	@Parameters({"browser","urlnm","timeoutsec"})
	@Test
	public void executeLaunch(String browsernm,String url,int timeoutsecs) throws IOException
	{
		LaunchApp lc= new LaunchApp();
		lc.openBrowser(browsernm);
		lc.enterApplicationURL(url);
		lc.maximizeBrowser();
		lc.waittillLOginPageLoaded(timeoutsecs);
		
	}
	
	
	
	
	

}
