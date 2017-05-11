package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class Windows64 extends OperatingSystem
{
	public String gecko()
	{
			return geckoPath("win64", ".exe");
	}
}
