package net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferOption;
/**
 * Option of Offer
 */

public class OfferOptionImpl implements OfferOption { 

	private java.lang.String name;
	private long quantity;

	public OfferOptionImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public OfferOptionImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(long quantity) { 
		this.quantity = quantity;
	} 

	public OfferOptionImpl quantity(long quantity) { 
		this.quantity = quantity;
		return this;
	} 

}
