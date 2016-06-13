package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * A numeric value tagged with its unit
 */

public interface UnitAndValue<T> { 

	/**
	 * @return null
	 */
	java.lang.String getUnit(); 

	/**
	 * @return null
	 */
	T getValue(); 

}
