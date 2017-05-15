package testerinteractionneeded;

import java.io.File;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import operatingsystem.*;
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
	private static final File windows64Path = new File("set me");
	private static final File linux32Path = new File("set me");
	private static final File linux64Path = new File("set me");
	private static final File macOsPath = new File("set me");


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
	public void whenThisYetUndefinedThenEqualLocalSystem() {
		OS yetUndefined = new YetUndefined();
		expect(yetUndefined).toBeEqualTo(thisLocalSystem).otherwiseComplain();
	}

	@Disabled("Set path")
	@Test
	void whenWindows64ThenWindows64Path() {
		expect(PathTo.geckoFor(new Windows64()))
				.toBeEqualTo(windows64Path)
				.otherwiseComplain();
	}

	@Disabled("Set path")
	@Test
	void whenLinux32ThenLinx32Path() {
		expect(PathTo.geckoFor(new Linux32()))
				.toBeEqualTo(linux32Path)
				.otherwiseComplain();
	}

	@Disabled("Set path")
	@Test
	void whenLinux64ThenLinux64Path() {
		expect(PathTo.geckoFor(new Linux64()))
				.toBeEqualTo(linux64Path)
				.otherwiseComplain();
	}

	@Disabled("Set path")
	@Test
	void whenMacOsThenMacOsPath() {
		expect(PathTo.geckoFor(
				new MacOs()))
				.toBeEqualTo(macOsPath)
				.otherwiseComplain();
	}
}