package webdriver;

import org.junit.jupiter.api.Test;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
public class GivenOperatingSystem
{
	/* Enter your running system here */
	private String arch = "amd64";
	private String name = "Windows 10";
	private String version = "10.0";

	@Test
	public void whenGettingArchThenNoException() {
		// arrange
		boolean failed = false;

		// act
		try {
			OperatingSystem.arch();
		} catch ( Exception e) {
			failed = true;
		}

		// assert
		expect(failed).toBeFalse().otherwiseComplain();
	}

	@Test
	public void whenGettingArchThenArch() {
		// arrange // act // assert
		expect(arch).toBeEqualTo(OperatingSystem.arch()).otherwiseComplain();
	}

	@Test
	public void whenGettingNameThenNoException() {
		// arrange
		boolean failed = false;

		// act
		try {
			OperatingSystem.name();
		} catch ( Exception e) {
			failed = true;
		}

		// assert
		expect(failed).toBeFalse().otherwiseComplain();
	}

	@Test
	public void whenGettingNameThenName() {
		// arrange // act // assert
		expect(name).toBeEqualTo(OperatingSystem.name()).otherwiseComplain();
	}

	@Test
	public void whenGettingVersionThenNoException() {
		// arrange
		boolean failed = false;

		// act
		try {
			OperatingSystem.version();
		} catch ( Exception e) {
			failed = true;
		}

		// assert
		expect(failed).toBeFalse().otherwiseComplain();
	}

	@Test
	public void whenGettingVersionThenVersion() {
		// arrange // act // assert
		expect(version).toBeEqualTo(OperatingSystem.version());
	}
}
