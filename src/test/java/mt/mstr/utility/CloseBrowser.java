package mt.mstr.utility;

import mt.mstr.config.Config;

public class CloseBrowser
{
	public void closeBrowser()
	{
		Config.driver.close();
	}

}
