package webdriver;

/**
 * Created by HiekmaHe on 15.05.2017.
 */
public enum CapabilityKeys
{
	geckoDriver ("webdriver.gecko.driver"),
	marionette (""),
	acceptInsecureCerts (""),
	acceptSllCerts ("");

	private final String value;

	CapabilityKeys(String value)
	{
		this.value = value;
	}
}
