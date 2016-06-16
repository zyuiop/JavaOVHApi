package net.zyuiop.ovhapi.impl.objects.dedicatedcloud;

import net.zyuiop.ovhapi.api.objects.dedicatedcloud.ResourceNewPricesEntry;
/**
 * A structure describing the Resource's new price
 */

public class ResourceNewPricesEntryImpl implements ResourceNewPricesEntry { 

	private java.lang.String resourceType;
	private java.lang.String billingType;
	private boolean changed;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl oldPrice;
	private java.lang.String name;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl newPrice;

	public ResourceNewPricesEntryImpl() {
	}

	public java.lang.String getResourceType() { 
		return this.resourceType;
	} 

	public void setResourceType(java.lang.String resourceType) { 
		this.resourceType = resourceType;
	} 

	public ResourceNewPricesEntryImpl resourceType(java.lang.String resourceType) { 
		this.resourceType = resourceType;
		return this;
	} 

	public java.lang.String getBillingType() { 
		return this.billingType;
	} 

	public void setBillingType(java.lang.String billingType) { 
		this.billingType = billingType;
	} 

	public ResourceNewPricesEntryImpl billingType(java.lang.String billingType) { 
		this.billingType = billingType;
		return this;
	} 

	public boolean getChanged() { 
		return this.changed;
	} 

	public void setChanged(boolean changed) { 
		this.changed = changed;
	} 

	public ResourceNewPricesEntryImpl changed(boolean changed) { 
		this.changed = changed;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getOldPrice() { 
		return this.oldPrice;
	} 

	public void setOldPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl oldPrice) { 
		this.oldPrice = oldPrice;
	} 

	public ResourceNewPricesEntryImpl oldPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl oldPrice) { 
		this.oldPrice = oldPrice;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ResourceNewPricesEntryImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getNewPrice() { 
		return this.newPrice;
	} 

	public void setNewPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl newPrice) { 
		this.newPrice = newPrice;
	} 

	public ResourceNewPricesEntryImpl newPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl newPrice) { 
		this.newPrice = newPrice;
		return this;
	} 

}
