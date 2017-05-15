package operatingsystem;

import java.util.HashMap;
import java.util.List;
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

	public Object falseOrValueOf(ParameterKey key)
	{
		Object value = this.valueOf(key);
		return (value == null) ? Boolean.FALSE : value;
	}

	public boolean equals(Parameter other, List<ParameterKey> keys)
	{
		boolean areEqual = true;
		for (ParameterKey key : keys) {
			if(key.hasDifferentValueIn(this, other)) {
				areEqual = false;
				break;
			}
		}
		return areEqual;
	}
}
