package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class Windows64 extends OperatingSystem
{

	@Override
	public String gecko()
	{
		return "win64" + System.getProperty("file.separator") + "geckodriver.exe";
	}
}
