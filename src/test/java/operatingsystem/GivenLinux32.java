package operatingsystem;

import org.junit.jupiter.api.Test;

import static de.fnordbedarf.debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 11.05.2017.
 */
class GivenLinux32
{
	private OS system = new Linux32();

	@Test
	void whenCreatingThenNotNull() {
		expect(system).toBeNotNull().otherwiseComplain();
	}

	@Test
	void whenGettingParametersThenExpectParamaters() {
		expect(valueOf(ParameterKey.linux)).toBeTrue().otherwiseComplain();
		expect(valueOf(ParameterKey.macOs)).toBeNull().otherwiseComplain();
		expect(valueOf(ParameterKey.windows)).toBeNull().otherwiseComplain();
		expect(valueOf(ParameterKey.arch32)).toBeTrue().otherwiseComplain();
		expect(valueOf(ParameterKey.arch64)).toBeNull().otherwiseComplain();
	}

	private Object valueOf(ParameterKey key)
	{
		return system.parameter().valueOf(key);
	}
}
