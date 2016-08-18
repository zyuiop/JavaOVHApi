package net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove;

/**
 * Eligibility
 */

public class Eligibility { 

	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Portability keepCurrentPortability;
	private net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove.Offer[] offers;

	public Eligibility() {
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Portability getKeepCurrentPortability() { 
		return this.keepCurrentPortability;
	} 

	public void setKeepCurrentPortability(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Portability keepCurrentPortability) { 
		this.keepCurrentPortability = keepCurrentPortability;
	} 

	public Eligibility keepCurrentPortability(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Portability keepCurrentPortability) { 
		this.keepCurrentPortability = keepCurrentPortability;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove.Offer[] getOffers() { 
		return this.offers;
	} 

	public void setOffers(net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove.Offer[] offers) { 
		this.offers = offers;
	} 

	public Eligibility offers(net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove.Offer[] offers) { 
		this.offers = offers;
		return this;
	} 

}
