package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public enum OperatingSystemKey
{
	windows64 (new Windows64()),
	linux32 (new Linux32()),
	linux64 (new Linux64()),
	macos (new MacOs());

	private final OperatingSystem operatingSystem;

	OperatingSystemKey(OperatingSystem operatingSystem)
	{
		this.operatingSystem = operatingSystem;
	}
	public OperatingSystem get() {
		return operatingSystem;
	}
}