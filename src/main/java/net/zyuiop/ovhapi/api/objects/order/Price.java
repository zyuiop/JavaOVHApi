package net.zyuiop.ovhapi.api.objects.order;

/**
 * Price with it's currency and textual representation
 */

public interface Price { 

	/**
	 * @return null
	 */
	java.lang.String getCurrencyCode(); 

	/**
	 * @return null
	 */
	double getValue(); 

	/**
	 * @return null
	 */
	java.lang.String getText(); 

}
