package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public enum OSKey
{
	windows64 (new Windows64()),
	linux32 (new Linux32()),
	linux64 (new Linux64()),
	macos (new MacOs());

	private final OS system;

	OSKey(OS system)
	{
		this.system = system;
	}

	public OS get() {
		return system;
	}
}