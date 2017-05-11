package testerinteractionneeded;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import operatingsystem.OperatingSystem;
import webdriver.PathTo;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class GivenTestInteractionNeeded
{
	private String resource = "setMeToYourLocalPath";
	private static final String localGecko = "Set your local gecko sub path here.";
	private static final String localString = "operatingsystem.Windows64";

	@Disabled("Set variable resource")
	@Test
	void givenPathToWhenGettingPathToResourcesThenEqualPathToResources() {
		expect(PathTo.resources().toString()).toBeEqualTo(resource).otherwiseComplain();
	}

	@Disabled("Set your local gecko sub path first")
	@Test
	void givenOperatingSystemsWhenLinuxExpectGeckoLinuxString() throws Exception
	{
		expect(OperatingSystem.local().subPathToGecko()).toBeEqualTo(localGecko).otherwiseComplain();
	}

	@Test
	void whenGettingLocalOperatingSystemThenEqualToLocal() throws Exception
	{
		// arrange // act // assert
		expect(localString).toBeEqualTo(OperatingSystem.local().toString()).otherwiseComplain();
	}
}
