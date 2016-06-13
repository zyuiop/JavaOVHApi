package net.zyuiop.ovhapi.api.objects.vps;

/**
 * Operation on a VPS Virtual Machine
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
