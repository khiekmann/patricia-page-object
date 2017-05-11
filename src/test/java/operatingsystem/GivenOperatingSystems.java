package operatingsystem;

import org.junit.jupiter.api.Test;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class GivenOperatingSystems
{
	private OperatingSystemKey localOperatingSystem = OperatingSystemKey.windows64;

	private String n = System.getProperty("file.separator");
	private String win64Gecko = "geckodriver-latest-win64" + n + "geckodriver.exe";
	private String linux32Gecko = "geckodriver-latest-linux32" + n + "geckodriver";
	private String linux64Gecko = "geckodriver-latest-linux64" + n + "geckodriver";
	private String macosGecko = "geckodriver-latest-macos" + n + "geckodriver";

	@Test
	void whenOperatingSystemLocalExpectExpectedLocalOperatingSystem() throws Exception
	{
		expect(OperatingSystem.local()).toBeEqualTo(localOperatingSystem.get()).otherwiseComplain();
	}

	@Test
	void whenOperatingSystemsThenCorrectGeckoPaths() throws Exception
	{
		expect(new Windows64().subPathToGecko()).toBeEqualTo(win64Gecko).otherwiseComplain();
		expect(new Linux32().subPathToGecko()).toBeEqualTo(linux32Gecko).otherwiseComplain();
		expect(new Linux64().subPathToGecko()).toBeEqualTo(linux64Gecko).otherwiseComplain();
		expect(new MacOs().subPathToGecko()).toBeEqualTo(macosGecko).otherwiseComplain();
	}
}