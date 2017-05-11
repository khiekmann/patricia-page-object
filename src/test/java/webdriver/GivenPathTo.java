package webdriver;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
class GivenPathTo
{
	private String resource = "setMeToYourLocalPath";

	@Test
	void whenGettingPathToResourcesThenNotNull() {
		expect(PathTo.resources()).toNotBeNull().otherwiseComplain();
	}

	@Test
	void whenGettingPathToResourcesThenNotEmpty() {
		expect(PathTo.resources()).toNotBeEmpty().otherwiseComplain();
	}

	@Ignore("Set variable resource")
	@Test
	void whenGettingPathToResourcesThenEqualPathToResources() {
		//expect(PathTo.resources().toString()).toBeEqualTo(resource).otherwiseComplain();
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
		expect(PathTo.gecko().exists()).toBeTrue().otherwiseComplain();
	}

}