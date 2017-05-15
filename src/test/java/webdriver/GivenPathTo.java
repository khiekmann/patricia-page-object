package webdriver;

import org.junit.jupiter.api.Test;

import operatingsystem.OS;

import static de.fnordbedarf.debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
class GivenPathTo
{
	@Test
	void whenGettingPathToResourcesThenNotNull() {
		expect(PathTo.resources()).toNotBeNull().otherwiseComplain();
	}

	@Test
	void whenGettingPathToResourcesThenNotEmpty() {
		expect(PathTo.resources()).toNotBeEmpty().otherwiseComplain();
	}

	@Test
	void whenGettingPathToResourcesThenExpectExistant() {
		expect(PathTo.resources().exists()).toBeTrue().otherwiseComplain();
	}
	
	@Test
	void whenGettingPathToSeleniumThenExpectExistant() {
		expect(PathTo.selenium().exists()).toBeTrue().otherwiseComplain();
	}

	@Test
	void whenGettingPathToGeckoThenExpectExistant() throws Exception {
		expect(PathTo.geckoFor(OS.local()).exists()).toBeTrue().otherwiseComplain();
	}
}