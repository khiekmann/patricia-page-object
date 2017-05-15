package operatingsystem;

import org.junit.jupiter.api.Test;

import static de.fnordbedarf.debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
class GivenOSKey
{
	@Test
	void whenSameThenEqual() {
		expect(new Windows64()).toBeEqualTo(new Windows64()).otherwiseComplain();
		expect(new Linux32()).toBeEqualTo(new Linux32()).otherwiseComplain();
		expect(new Linux64()).toBeEqualTo(new Linux64()).otherwiseComplain();
		expect(new MacOs()).toBeEqualTo(new MacOs()).otherwiseComplain();
	}

	@Test
	void whenSameThenEqualHashCode() {
		expect(new Windows64().hashCode()).toBeEqualTo(new Windows64().hashCode()).otherwiseComplain();
		expect(new Linux32().hashCode()).toBeEqualTo(new Linux32().hashCode()).otherwiseComplain();
		expect(new Linux64().hashCode()).toBeEqualTo(new Linux64().hashCode()).otherwiseComplain();
		expect(new MacOs().hashCode()).toBeEqualTo(new MacOs().hashCode()).otherwiseComplain();
	}

	@Test
	void whenGettingLocalOperatingSystemThenExpectNotNull()
	{
		// arrange // act // assert
		expect(OS.local()).toBeNotNull().otherwiseComplain();
	}

	@Test
	void whenOtherOperatingSystemEqualThenSameHashCode()
	{
		expect(OS.local()).toBeEqualTo(OS.local()).otherwiseComplain();
		expect(OS.local().hashCode()).toBeEqualTo(OS.local().hashCode()).otherwiseComplain();
	}

	@Test
	void whenOtherOperatingSystemNotEqualsThenNotSameHashCode() {
		expect(new Windows64().hashCode()).toBeNotEqualTo(new Linux32().hashCode()).otherwiseComplain();
		expect(new Windows64().hashCode()).toBeNotEqualTo(new Linux64().hashCode()).otherwiseComplain();
		expect(new Windows64().hashCode()).toBeNotEqualTo(new MacOs().hashCode()).otherwiseComplain();
	}
}