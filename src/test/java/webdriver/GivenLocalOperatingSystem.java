package webdriver;

import org.junit.jupiter.api.Test;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
public class GivenLocalOperatingSystem
{
	private String localString = "Windows 10 10.0 amd64";

	@Test
	public void whenGettingLocalOperatingSystemThenEqualToLocal() {
		// arrange // act // assert
		expect(localString).toBeEqualTo(OperatingSystem.local().toString()).otherwiseComplain();
	}
}