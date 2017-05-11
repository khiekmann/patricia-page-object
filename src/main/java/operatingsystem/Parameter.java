package operatingsystem;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by HiekmaHe on 11.05.2017.
 */
public class Parameter
{
	private final Map<ParameterKey, Object> parameters;

	public Parameter() {
		parameters = new HashMap();
	}

	public Object put(ParameterKey key, Object value) {
		return parameters.put(key, value);
	}

	public Object valueOf(ParameterKey key)
	{
		return parameters.get(key);
	}
}
