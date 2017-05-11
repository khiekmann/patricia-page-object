package operatingsystem;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
class GivenOperatingSystem
{
	/* Enter your running system here */
	private static final String arch = "amd64";
	private static final String name = "Windows 10";
	private static final String version = "10.0";
	private static final String localString = name + " " + version + " " + arch;

	private static boolean exceptionCaught;

	@Before
	void before() {
		exceptionCaught = false;
	}

	@Test
	void whenGettingLocalOperatingSystemThenExpectNotNull() throws Exception
	{
		// arrange // act // assert
		expect(OperatingSystem.local()).toBeNotNull().otherwiseComplain();
	}

	@Test
	void whenGettingLocalOperatingSystemThenEqualToLocal() throws Exception
	{
		// arrange // act // assert
		expect(localString).toBeEqualTo(OperatingSystem.local().toString()).otherwiseComplain();
	}

	@Test
	void whenGettingArchThenNoException() {
		// arrange // act
		try {
			OperatingSystem.arch();
		} catch ( Exception e) {
			exceptionCaught = true;
		}

		// assert
		expect(exceptionCaught).toBeFalse().otherwiseComplain();
	}

	@Test
	void whenGettingArchThenArch() {
		// arrange // act // assert
		expect(arch).toBeEqualTo(OperatingSystem.arch()).otherwiseComplain();
	}

	@Test
	void whenGettingNameThenNoException() {
		// arrange // act
		try {
			OperatingSystem.name();
		} catch ( Exception e) {
			exceptionCaught = true;
		}

		// assert
		expect(exceptionCaught).toBeFalse().otherwiseComplain();
	}

	@Test
	void whenGettingNameThenName() {
		// arrange // act // assert
		expect(name).toBeEqualTo(OperatingSystem.name()).otherwiseComplain();
	}

	@Test
	void whenGettingVersionThenNoException() {
		// arrange // act
		try {
			OperatingSystem.version();
		} catch ( Exception e) {
			exceptionCaught = true;
		}

		// assert
		expect(exceptionCaught).toBeFalse().otherwiseComplain();
	}

	@Test
	void whenGettingVersionThenVersion() {
		// arrange // act // assert
		expect(version).toBeEqualTo(OperatingSystem.version());
	}
}