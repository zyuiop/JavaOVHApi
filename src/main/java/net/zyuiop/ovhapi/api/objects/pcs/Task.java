package net.zyuiop.ovhapi.api.objects.pcs;

/**
 * Operation on a Public Cloud Storage element
 */

public interface Task { 

	/**
	 * @return null
	 */
	long getProgress(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return null
	 */
	java.lang.String getType(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

}
