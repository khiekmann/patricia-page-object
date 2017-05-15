package webdriver;

import java.util.HashMap;


/**
 * Created by HiekmaHe on 15.05.2017.
 */
abstract class Browser
{
	public abstract Object withCapabilities(HashMap<CapabilityKeys, Object> capabilities);

	public abstract Browser create();
}
