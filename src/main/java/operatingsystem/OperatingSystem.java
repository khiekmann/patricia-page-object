package operatingsystem;

/*
 * Taken from org.apache.commons.lang
 */

/**
 * Created by HiekmaHe on 10.05.2017.
 */
public abstract class OperatingSystem
{
	public static final String n = System.getProperty("file.separator");

	private static final String osname = "os.name";
	private static final String osversion = "os.version";
	private static final String osarch = "os.arch";

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
		return get(osname);
	}

	public static String version() {
		return get(osversion);
	}

	public static String arch() {
		return get(osarch);
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

	protected static String geckoPath(String osNameArch, String fileEnding)
	{
		return "geckodriver-latest-" + osNameArch + n + "geckodriver" + fileEnding;
	}

	protected static String geckoPath(String osNameArch)
	{
		return geckoPath(osNameArch, "");
	}

	public static String geckoOf(OperatingSystem operatingSystem)
	{
		return operatingSystem.gecko();
	}

	public OperatingSystem()
	{
		this.name = name();
		this.version = version();
		this.arch = arch();
	}

	public abstract String gecko();

	@Override
	public String toString() {
		return name + " " + version + " " + arch;
	}

	@Override
	public int hashCode() {
		return (name + version + arch).hashCode();
	}

	@Override
	public boolean equals(Object object) {
		boolean isEqual = false;
		if (object instanceof OperatingSystem) {
			isEqual = (object.hashCode() == this.hashCode());
		}
		return isEqual;
	}
}