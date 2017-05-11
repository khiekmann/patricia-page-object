package operatingsystem;

import org.junit.jupiter.api.Test;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class GivenOperatingSystems
{
	private OperatingSystem localOperatingSystem = new Windows64();

	private String n = System.getProperty("file.separator");
	private String win64Gecko = "geckodriver-latest-win64" + n + "geckodriver.exe";
	private String linux32Gecko = "geckodriver-latest-linux32" + n + "geckodriver";
	private String linux64Gecko = "geckodriver-latest-linux64" + n + "geckodriver";
	private String macGecko = "geckodriver-latest-macos" + n + "geckodriver";

	@Test
	void whenOperatingSystemLocalExpectExpectedLocalOperatingSystem() throws Exception
	{
		expect(OperatingSystem.local()).toBeEqualTo(localOperatingSystem).otherwiseComplain();
	}

	@Test
	void whenOperatingSystemsThenCorrectGeckoPaths() throws Exception
	{
		expect(OperatingSystem.geckoOf(new Windows64())).toBeEqualTo(win64Gecko).otherwiseComplain();
		expect(OperatingSystem.geckoOf(new Linux32())).toBeEqualTo(linux32Gecko).otherwiseComplain();
		expect(OperatingSystem.geckoOf(new Linux64())).toBeEqualTo(linux64Gecko).otherwiseComplain();
		expect(OperatingSystem.geckoOf(new Mac())).toBeEqualTo(macGecko).otherwiseComplain();
	}
}