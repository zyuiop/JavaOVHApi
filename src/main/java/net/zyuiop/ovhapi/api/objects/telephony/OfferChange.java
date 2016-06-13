package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Offer change
 */

public interface OfferChange { 

	/**
	 * @return The current offer will be replace by this one on the next renew.
	 */
	java.lang.String getOffer(); 

}
