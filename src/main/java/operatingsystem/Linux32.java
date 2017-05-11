package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class Linux32 extends OperatingSystem
{
	@Override
	public String gecko()
	{
		return "linux32" + System.getProperty("file.separator") + "geckodriver";
	}
}
