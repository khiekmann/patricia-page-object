package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class Mac extends OperatingSystem
{
	@Override
	public String gecko()
	{
		return "macos" + System.getProperty("file.separator") + "geckodriver";
	}
}
