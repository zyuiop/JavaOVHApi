package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * History of your boost requests
 */

public interface BoostHistory { 

	/**
	 * @return Account who requested the change
	 */
	java.lang.String getAccountId(); 

	/**
	 * @return Offer when the change was made
	 */
	java.lang.String getOffer(); 

	/**
	 * @return The date when the change has been requested
	 */
	java.util.Date getDate(); 

	/**
	 * @return Boost offer used
	 */
	java.lang.String getBoostOffer(); 

}
