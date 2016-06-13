package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Possible option for TCP
 */

public interface FirewallOptionTCP { 

	/**
	 * @return TCP fragments
	 */
	boolean getFragments(); 

	/**
	 * @return TCP option
	 */
	java.lang.String getOption(); 

}
