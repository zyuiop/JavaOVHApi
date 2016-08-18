package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Offer change
 */

public class OfferChange { 

	private java.lang.String offer;

	public OfferChange() {
	}

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public OfferChange offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

}
