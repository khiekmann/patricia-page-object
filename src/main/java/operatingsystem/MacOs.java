package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class MacOs extends OperatingSystem
{
	public MacOs()
	{
		Parameter parameter = new Parameter();
		parameter.put(ParameterKey.macOs, true);
		parameter.put(ParameterKey.operatingSystems, OperatingSystemKey.macos);
		parameter.put(ParameterKey.geckoPath, "macos");
		parameter(parameter);
	}
}
