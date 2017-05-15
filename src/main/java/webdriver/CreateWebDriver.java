package webdriver;

/**
 * Created by HiekmaHe on 15.05.2017.
 *
 */
class CreateWebDriver
{
	static Browser called(BrowserKeys key)
	{
		return key.create();
	}
}