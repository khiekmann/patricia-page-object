package webdriver;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static debugger.Debugger.expect;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
public class GivenPathTo
{
	private String resource = "setMeToYourLocalPath";

	@Test
	public void whenGettingPathToResourcesThenNotNull() {
		expect(PathTo.resources()).toNotBeNull().otherwiseComplain();
	}

	@Test
	public void whenGettingPathToResourcesThenNotEmpty() {
		expect(PathTo.resources()).toNotBeEmpty().otherwiseComplain();
	}

	@Ignore("Set variable resource")
	@Test
	public void whenGettingPathToResourcesThenEqualPathToResources() {
		//expect(PathTo.resources().toString()).toBeEqualTo(resource).otherwiseComplain();
	}

	@Test
	public void whenGettingPathToResourcesThenExpectExistant() {
		expect(PathTo.resources().exists()).toBeTrue().otherwiseComplain();
	}
}