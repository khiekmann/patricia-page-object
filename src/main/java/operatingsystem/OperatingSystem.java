package operatingsystem;

/*
 * Taken from org.apache.commons.lang
 */

import java.util.LinkedList;
import java.util.List;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
public abstract class OperatingSystem
{
	private static final String n = System.getProperty("file.separator");
	private static final String geckoSubPathPrefix = "geckodriver-latest-";
	private static final String geckoDriver = "geckodriver";

	private Parameter parameter;
	private List<ParameterKey> equalParameterKeys = new LinkedList<>();

	public static OperatingSystem local()
	{
		OperatingSystem local = new YetUndefined();
		for (OperatingSystemKey operatingSystemKey : OperatingSystemKey.values()) {
			OperatingSystem operatingSystem = operatingSystemKey.get();
			if (local.equals(operatingSystem)) {
				local = operatingSystemKey.get();
				break;
			}
		}
		return local;
	}

	public OperatingSystem() {
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
		if (other instanceof OperatingSystem) {
			OperatingSystem otherSystem = (OperatingSystem) other;
			areEqual = areEquals(otherSystem.parameter());
		}
		return areEqual;
	}

	private boolean areEquals(Parameter otherParameter) {
		boolean areEqual = true;
		for (ParameterKey key : equalParameterKeys) {
			if(thisHasDifferentValueFor(key, otherParameter)) {
				areEqual = false;
				break;
			}
		}
		return areEqual;
	}

	private boolean thisHasDifferentValueFor(ParameterKey key, Parameter thanOther)
	{
		Object thisValue = parameter().valueOf(key);
		thisValue = (thisValue == null) ? Boolean.FALSE : thisValue;
		Object otherValue = thanOther.valueOf(key);
		otherValue = (otherValue == null) ? Boolean.FALSE : otherValue;
		boolean isEqual = ( ! thisValue.equals(otherValue));
		return isEqual;
	}

	public String subPathToGecko()
	{
		String suffix = parameter().valueOf(ParameterKey.geckoPath).toString();
		Object fileEnding = parameter().valueOf(ParameterKey.geckoFileEnding);
		String fileEndingString = (fileEnding == null) ?  ""  : fileEnding.toString();
		return geckoSubPathFrom(suffix, fileEndingString);
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