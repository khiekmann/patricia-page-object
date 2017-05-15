package webdriver;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import de.fnordbedarf.debugger.Debugger;

import static de.fnordbedarf.debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 15.05.2017.
 */
class GivenWebDriver
{
	private BrowserKeys gecko = BrowserKeys.gecko;

	@Test
	void whenCreatingGeckoThenNotNull() {
		expect(CreateWebDriver.called(gecko)).toNotBeNull().otherwiseComplain();
	}

	@Test
	void whenCreatingGeckoThenBrowserTypeGecko() {
		expect(classOf(CreateWebDriver.called(gecko).getClass()).toBeEqualTo(Firefox.class).otherwiseComplain();
	}

	@Test
	void whenCreatingWithCapabilitiesThenExpectNotNull() {
		// arrange
		HashMap<CapabilityKeys, Object> capabilities = new HashMap();
		capabilities.put(CapabilityKeys.marionette, true);
		capabilities.put(CapabilityKeys.acceptInsecureCerts, true);
		capabilities.put(CapabilityKeys.acceptSllCerts, true);

		// act // assert
		expect(CreateWebDriver.called(gecko)
					.withCapabilities(capabilities)
				).toNotBeNull()
				.otherwiseComplain();
	}
}
