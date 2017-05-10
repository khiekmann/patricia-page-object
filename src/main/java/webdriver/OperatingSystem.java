package webdriver;

/*
 * Taken from org.apache.commons.lang
 */

/**
 * Created by HiekmaHe on 10.05.2017.
 */
public class OperatingSystem
{
	private static final String NAME = "os.name";
	private static final String VERSION = "os.version";
	private static final String ARCH = "os.arch";
	private final String name;
	private final String version;
	private final String arch;

	public OperatingSystem(String name, String version, String arch)
	{
		this.name = name;
		this.version = version;
		this.arch = arch;
	}

	public static String name() {
		return get(NAME);
	}

	public static String version() {
		return get(VERSION);
	}

	public static String arch() {
		return get(ARCH);
	}

	private static String get(String property) throws SecurityException
	{
		return System.getProperty(property);
	}

	public static OperatingSystem local()
	{
		return new OperatingSystem(name(), version(), arch());
	}

	@Override
	public String toString() {
		return name + " " + version + " " + arch;
	}
}