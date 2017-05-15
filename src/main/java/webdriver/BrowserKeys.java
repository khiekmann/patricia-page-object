package webdriver;

/**
 * Created by HiekmaHe on 15.05.2017.
 */
public enum BrowserKeys
{
	gecko (new Firefox());

	private final Browser browser;

	BrowserKeys(Browser browser)
	{
		this.browser = browser;
	}

	public Browser create()
	{
		return this.browser.create();
	}
}
