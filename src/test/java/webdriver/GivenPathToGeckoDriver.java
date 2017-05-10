package webdriver;

import org.junit.jupiter.api.Test;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
public class GivenPathToGeckoDriver
{
	@Test
	public void whenGettingPathToGeckoDriverExpectNotNull() {
		// arrange
		String pathToGeckoDriver;

		// act
		pathToGeckoDriver = PathToDriver.gecko();

		// assert
		expect(pathToGeckoDriver).toNotBeNull().otherwiseComplain();
	}
}
