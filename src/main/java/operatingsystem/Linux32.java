package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class Linux32 extends OS
{
	public Linux32()
	{
		Parameter parameter = new Parameter();
		parameter.put(ParameterKey.linux, true);
		parameter.put(ParameterKey.arch32, true);
		parameter.put(ParameterKey.operatingSystems, OSKey.linux32 );
		parameter.put(ParameterKey.geckoPath, "linux32");
		parameter(parameter);
	}
}