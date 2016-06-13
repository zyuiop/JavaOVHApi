package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.OfferChange;
/**
 * Offer change
 */

public class OfferChangeImpl implements OfferChange { 

	private java.lang.String offer;

	public OfferChangeImpl() {
	}

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public OfferChangeImpl offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

}
