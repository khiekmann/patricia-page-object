package webdriver;

import java.util.HashMap;
import java.io.File;

import org.openqa.selenium.firefox.FirefoxDriver;

import operatingsystem.OS;


/**
 * Created by HiekmaHe on 15.05.2017.
 */
public class Firefox extends Browser
{
	private static final String webdriverGeckoDriver = "webdriver.gecko.driver";

	public Firefox() {
		File pathToGecko = PathTo.geckoFor(OS.local());
		System.setProperty(webdriverGeckoDriver, pathToGecko.getAbsolutePath());
	}

	@Override
	public Object withCapabilities(HashMap<CapabilityKeys, Object> capabilities)
	{
		return new FirefoxDriver();
	}

	@Override
	public Browser create()
	{
		return new Firefox();
	}
}
