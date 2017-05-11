package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class LocalOperatingSystem
{
	private static final String osname = "os.name";
	private static final String osarch = "os.arch";

	public static OperatingSystem create() throws Exception
	{
		OperatingSystem local = new YetUndefined(name(), arch());
		for (OperatingSystemKey operatingSystemKey : OperatingSystemKey.values()) {
			OperatingSystem operatingSystem = operatingSystemKey.get();
			if (local.equals(operatingSystem)) {
				local = operatingSystemKey.get();
				break;
			}
		}
		return local;
	}

	private static String name() {
		return get(osname);
	}

	private static String arch() {
		return get(osarch);
	}

	private static String get(String property) throws SecurityException
	{
		return System.getProperty(property);
	}
}
