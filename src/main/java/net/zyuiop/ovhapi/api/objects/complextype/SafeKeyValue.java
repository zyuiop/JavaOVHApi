package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * Key and value, with proper key strings
 */

public interface SafeKeyValue<T> { 

	/**
	 * @return null
	 */
	T getValue(); 

	/**
	 * @return null
	 */
	java.lang.String getKey(); 

}
