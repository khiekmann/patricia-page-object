package operatingsystem;

import org.junit.jupiter.api.Test;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class GivenWindows64
{
	private OperatingSystem system = new Windows64();

	@Test
	void whenCreatingThenNotNull() {
		expect(system).toBeNotNull().otherwiseComplain();
	}

	@Test
	void whenGettingParametersThenWindows64() {
		expect(valueOf(ParameterKey.linux)).toBeNull().otherwiseComplain();
		expect(valueOf(ParameterKey.macOs)).toBeNull().otherwiseComplain();
		expect(valueOf(ParameterKey.windows)).toBeTrue().otherwiseComplain();
		expect(valueOf(ParameterKey.arch32)).toBeNull().otherwiseComplain();
		expect(valueOf(ParameterKey.arch64)).toBeTrue().otherwiseComplain();
	}

	private Object valueOf(ParameterKey key)
	{
		return system.parameter().valueOf(key);
	}
}
