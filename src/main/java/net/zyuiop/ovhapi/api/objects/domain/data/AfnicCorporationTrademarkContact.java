package net.zyuiop.ovhapi.api.objects.domain.data;

/**
 * Representation of an Inpi additional information for a corporation
 */

public interface AfnicCorporationTrademarkContact { 

	/**
	 * @return Contact ID related to the Inpi additional information
	 */
	long getContactId(); 

	/**
	 * @return Owner of the trademark
	 */
	java.lang.String getInpiTrademarkOwner(); 

	/**
	 * @return Corporation Inpi additional information ID
	 */
	long getId(); 

	/**
	 * @return Number of the Inpi declaration
	 */
	java.lang.String getInpiNumber(); 

}
