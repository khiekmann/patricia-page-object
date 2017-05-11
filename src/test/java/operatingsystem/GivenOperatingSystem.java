package operatingsystem;

import org.junit.jupiter.api.Test;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
class GivenOperatingSystem
{
	@Test
	void whenGettingLocalOperatingSystemThenExpectNotNull() throws Exception
	{
		// arrange // act // assert
		expect(OperatingSystem.local()).toBeNotNull().otherwiseComplain();
	}
}