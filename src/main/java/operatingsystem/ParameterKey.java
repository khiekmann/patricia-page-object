package operatingsystem;

/**
 * Created by HiekmaHe on 11.05.2017.
 */
public enum ParameterKey
{
	windows ("Windows"),
	linux ("Linux"),
	macOs ("Macos"),
	arch32 ("32"),
	arch64 ("64"),
	geckoPath ("not set"),
	geckoFileEnding ("not set"),
	operatingSystems ("not set");

	private final String value;

	ParameterKey(String value)
	{
		this.value = value;
	}

	public CharSequence value()
	{
		return value;
	}
}