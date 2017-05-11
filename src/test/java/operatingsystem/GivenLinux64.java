package operatingsystem;

import org.junit.jupiter.api.Test;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class GivenLinux64
{
	private OperatingSystem system = new Linux64();

	@Test
	void whenCreatingThenNotNull() {
		expect(system).toBeNotNull().otherwiseComplain();
	}

	@Test
	void whenGettingParametersThenExpectParamaters() {
		expect(valueOf(ParameterKey.linux)).toBeTrue().otherwiseComplain();
		expect(valueOf(ParameterKey.macOs)).toBeNull().otherwiseComplain();
		expect(valueOf(ParameterKey.windows)).toBeNull().otherwiseComplain();
		expect(valueOf(ParameterKey.arch32)).toBeNull().otherwiseComplain();
		expect(valueOf(ParameterKey.arch64)).toBeTrue().otherwiseComplain();
	}

	private Object valueOf(ParameterKey key)
	{
		return system.parameter().valueOf(key);
	}
}
