package net.zyuiop.ovhapi.api.objects.freefax;

/**
 * Return credit balance informations structure
 */

public interface BalanceInformations { 

	/**
	 * @return The number of equivalement remaining french faxs
	 */
	long getFaxs(); 

	/**
	 * @return Total balance available in points
	 */
	long getPoints(); 

}
