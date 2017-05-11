package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class Windows64 extends OperatingSystem
{
	public Windows64()
	{
		Parameter parameter = new Parameter();
		parameter.put(ParameterKey.windows, true);
		parameter.put(ParameterKey.arch64, true);
		parameter.put(ParameterKey.operatingSystems, OperatingSystemKey.windows64);
		parameter.put(ParameterKey.geckoPath, "win64");
		parameter.put(ParameterKey.geckoFileEnding, ".exe");
		parameter(parameter);
	}
}
