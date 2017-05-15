package operatingsystem;

/*
 * Taken from org.apache.commons.lang
 */

import java.util.LinkedList;
import java.util.List;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
public abstract class OS
{
	private static final String n = System.getProperty("file.separator");
	private static final String geckoSubPathPrefix = "geckodriver-latest-";
	private static final String geckoDriver = "geckodriver";

	private Parameter parameter;
	private List<ParameterKey> equalParameterKeys = new LinkedList<>();

	public static OS local()
	{
		OS local = new YetUndefined();
		for (OSKey operatingSystemKey : OSKey.values()) {
			OS operatingSystem = operatingSystemKey.get();
			if (local.equals(operatingSystem)) {
				local = operatingSystemKey.get();
				break;
			}
		}
		return local;
	}

	public OS() {
		equalParameterKeys.add(ParameterKey.arch32);
		equalParameterKeys.add(ParameterKey.arch64);
		equalParameterKeys.add(ParameterKey.linux);
		equalParameterKeys.add(ParameterKey.macOs);
		equalParameterKeys.add(ParameterKey.windows);
	}

	@Override
	public String toString() {
		return this.getClass().getName();
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		boolean areEqual = false;
		if (other instanceof OS) {
			OS otherSystem = (OS) other;
			areEqual = parameter().equals(otherSystem.parameter(), equalParameterKeys);
		}
		return areEqual;
	}

	public String subPathToGecko()
	{
		String suffix = getGeckoPathSuffix();
		String fileEnding = getGeckoPathFileEnding();
		return geckoSubPathFrom(suffix, fileEnding);
	}

	private String getGeckoPathSuffix()
	{
		return parameter().valueOf(ParameterKey.geckoPath).toString();
	}

	private String getGeckoPathFileEnding()
	{
		Object fileEnding = parameter().valueOf(ParameterKey.geckoFileEnding);
		return (fileEnding == null) ?  ""  : fileEnding.toString();
	}

	private String geckoSubPathFrom(String suffix, String fileEnding)
	{
		return geckoSubPathPrefix + suffix + n + geckoDriver + fileEnding;
	}

	public void parameter(Parameter parameter) {
		this.parameter = parameter;
	}

	public Parameter parameter()
	{
		return parameter;
	}
}