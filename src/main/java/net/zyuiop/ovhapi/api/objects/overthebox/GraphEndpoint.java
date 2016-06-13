package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * Parameters required to query metrics from OpenTSDB
 */

public interface GraphEndpoint { 

	/**
	 * @return A read-only token
	 */
	java.lang.String getReadToken(); 

	/**
	 * @return The OpenTSDB host
	 */
	java.lang.String getHost(); 

}
