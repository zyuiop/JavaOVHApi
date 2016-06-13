package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * A value set tagged with its unit
 */

public interface UnitAndValues<T> { 

	/**
	 * @return null
	 */
	java.lang.String getUnit(); 

	/**
	 * @return null
	 */
	T[] getValues(); 

}
