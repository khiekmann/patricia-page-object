package operatingsystem;

/*
 * Taken from org.apache.commons.lang
 */

/**
 * Created by HiekmaHe on 10.05.2017.
 */
public abstract class OperatingSystem
{
	private static final String NAME = "os.name";
	private static final String VERSION = "os.version";
	private static final String ARCH = "os.arch";

	private final String name;
	private final String version;
	private final String arch;

	public static OperatingSystem local() throws Exception
	{
		OperatingSystem local;
		if (isWindows() && is64()) { local = new Windows64(); }
		else if (isLinux() && is32()) { local = new Linux32(); }
		else if (isLinux() && is64()) { local = new Linux64(); }
		else if (isMac()) { local = new Mac();}
		else { throw new Exception(
				"win: " + isWindows() +
						" linux: " + isLinux() +
						" mac: " + isMac() +
						" 32: " + is32() +
						" 64: " + is64());
		}
		return local;
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

	private static boolean isLinux()
	{
		return name().startsWith("Linux");
	}

	private static boolean isMac() { return name().startsWith("Mac");}

	private static boolean isWindows()
	{
		return name().startsWith("Windows");
	}

	private static boolean is32()
	{
		return arch().contains("32");
	}

	private static boolean is64()
	{
		return arch().contains("64");
	}

	public OperatingSystem()
	{
		this.name = name();
		this.version = version();
		this.arch = arch();
	}

	@Override
	public String toString() {
		return name + " " + version + " " + arch;
	}

	public abstract String gecko();
}