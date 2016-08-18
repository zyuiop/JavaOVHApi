package net.zyuiop.ovhapi.api.objects.pack.xdsl.migration;

/**
 * Option of Offer
 */

public class OfferOption { 

	private java.lang.String name;
	private long quantity;

	public OfferOption() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public OfferOption name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(long quantity) { 
		this.quantity = quantity;
	} 

	public OfferOption quantity(long quantity) { 
		this.quantity = quantity;
		return this;
	} 

}
