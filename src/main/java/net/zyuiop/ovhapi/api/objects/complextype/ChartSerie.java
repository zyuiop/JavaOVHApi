package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * A value set tagged with its unit and serie name
 */

public interface ChartSerie<T> { 

	/**
	 * @return null
	 */
	java.lang.String getSerieName(); 

	/**
	 * @return null
	 */
	java.lang.String getUnit(); 

	/**
	 * @return null
	 */
	T[] getValues(); 

}
