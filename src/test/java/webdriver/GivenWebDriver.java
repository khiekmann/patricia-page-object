package webdriver;

import org.junit.jupiter.api.Test;

import static de.fnordbedarf.debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 15.05.2017.
 */
class GivenWebDriver
{
	@Test
	void whenCreatingThenExpectNotNull() {
		expect(WebDriver.create()).toNotBeNull().otherwiseComplain();
	}
}
