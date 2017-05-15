package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class Linux64 extends OS
{
	public Linux64()
	{
		Parameter parameter = new Parameter();
		parameter.put(ParameterKey.linux, true);
		parameter.put(ParameterKey.arch64, true);
		parameter.put(ParameterKey.geckoPath, "linux64");
		parameter.put(ParameterKey.operatingSystems, OSKey.linux64);
		parameter(parameter);
	}
}
