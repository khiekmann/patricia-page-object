package testerinteractionneeded;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import operatingsystem.OS;
import operatingsystem.Windows64;
import operatingsystem.YetUndefined;
import webdriver.PathTo;

import static de.fnordbedarf.debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 11.05.2017.
 */
class GivenTestInteractionNeeded
{
	private static final String resource = "setMeToYourLocalPath";
	private static final String localGecko = "Set your local gecko sub path here.";
	private static final String localString = "operatingsystem.Windows64";
	private static final OS thisLocalSystem = new Windows64();

	@Disabled("Set variable resource")
	@Test
	void givenPathToWhenGettingPathToResourcesThenEqualPathToResources() {
		expect(PathTo.resources().toString()).toBeEqualTo(resource).otherwiseComplain();
	}

	@Disabled("Set your local gecko sub path first")
	@Test
	void givenOperatingSystemsWhenLinuxExpectGeckoLinuxString() throws Exception
	{
		expect(OS.local().subPathToGecko()).toBeEqualTo(localGecko).otherwiseComplain();
	}

	@Test
	void whenGettingLocalOperatingSystemThenEqualToLocal() throws Exception
	{
		// arrange // act // assert
		expect(localString).toBeEqualTo(OS.local().toString()).otherwiseComplain();
	}

	@Test
	public void test() {
		OS yetUndefined = new YetUndefined();
		expect(yetUndefined).toBeEqualTo(thisLocalSystem).otherwiseComplain();
	}
}