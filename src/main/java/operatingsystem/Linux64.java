package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class Linux64 extends OperatingSystem
{
	@Override
	public String gecko()
	{
		return "linux64" + System.getProperty("file.separator") + "geckodriver";
	}
}
