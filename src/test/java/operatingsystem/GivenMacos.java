package operatingsystem;

import org.junit.jupiter.api.Test;

import static de.fnordbedarf.debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 11.05.2017.
 */
class GivenMacos
{
	private OS system = new MacOs();

	@Test
	void whenCreatingThenNotNull() {
		expect(system).toBeNotNull().otherwiseComplain();
	}

	@Test
	void whenGettingParametersThenExpectParamaters() {
		expect(valueOf(ParameterKey.linux)).toBeNull().otherwiseComplain();
		expect(valueOf(ParameterKey.macOs)).toBeTrue().otherwiseComplain();
		expect(valueOf(ParameterKey.windows)).toBeNull().otherwiseComplain();
		expect(valueOf(ParameterKey.arch32)).toBeNull().otherwiseComplain();
		expect(valueOf(ParameterKey.arch64)).toBeNull().otherwiseComplain();
	}

	private Object valueOf(ParameterKey key)
	{
		return system.parameter().valueOf(key);
	}
}
