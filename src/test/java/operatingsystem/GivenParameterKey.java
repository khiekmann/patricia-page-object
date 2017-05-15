package operatingsystem;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static de.fnordbedarf.debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 13.05.2017.
 */
class GivenParameterKey
{

	private Parameter hasLinux;
	private Parameter hasLinuxAlso;
	private Parameter hasWindows;

	@Before
	void before() {
		hasLinux = new Parameter();
		hasLinux.put(ParameterKey.linux, true);
		hasLinuxAlso = new Parameter();
		hasLinuxAlso.put(ParameterKey.linux, true);
		hasWindows = new Parameter();
		hasWindows.put(ParameterKey.windows, true);
	}

	@Test
	void whenEqualValuesThenExpectTrue() {
		expect(hasLinux).toBeEqualTo(hasLinuxAlso).otherwiseComplain();
	}

	@Test
	void whenDifferentValuesThenExpectFalse() {
		expect(hasLinux).toBeEqualTo(hasLinuxAlso).otherwiseComplain();
	}
}