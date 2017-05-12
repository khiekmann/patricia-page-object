package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class YetUndefined extends OperatingSystem
{
	private static final String osname = "os.name";
	private static final String osarch = "os.arch";

	private final Parameter parameter;

	public YetUndefined()
	{
		String name = name();
		String arch = arch();
		parameter = new Parameter();
		put(ParameterKey.linux, name);
		put(ParameterKey.macOs, name);
		put(ParameterKey.windows, name);
		put(ParameterKey.arch32, arch);
		put(ParameterKey.arch64, arch);
		parameter(parameter);
	}

	private void put(ParameterKey parameters, String data)
	{
		Object value = data.contains(parameters.value());
		value = (value.equals(Boolean.FALSE)) ? null : value;
		parameter.put(parameters, value);
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