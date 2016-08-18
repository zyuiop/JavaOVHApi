package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * A structure describing the Resource's new price
 */

public class ResourceNewPricesEntry { 

	private java.lang.String resourceType;
	private java.lang.String billingType;
	private boolean changed;
	private net.zyuiop.ovhapi.api.objects.order.Price oldPrice;
	private java.lang.String name;
	private net.zyuiop.ovhapi.api.objects.order.Price newPrice;

	public ResourceNewPricesEntry() {
	}

	public java.lang.String getResourceType() { 
		return this.resourceType;
	} 

	public void setResourceType(java.lang.String resourceType) { 
		this.resourceType = resourceType;
	} 

	public ResourceNewPricesEntry resourceType(java.lang.String resourceType) { 
		this.resourceType = resourceType;
		return this;
	} 

	public java.lang.String getBillingType() { 
		return this.billingType;
	} 

	public void setBillingType(java.lang.String billingType) { 
		this.billingType = billingType;
	} 

	public ResourceNewPricesEntry billingType(java.lang.String billingType) { 
		this.billingType = billingType;
		return this;
	} 

	public boolean getChanged() { 
		return this.changed;
	} 

	public void setChanged(boolean changed) { 
		this.changed = changed;
	} 

	public ResourceNewPricesEntry changed(boolean changed) { 
		this.changed = changed;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getOldPrice() { 
		return this.oldPrice;
	} 

	public void setOldPrice(net.zyuiop.ovhapi.api.objects.order.Price oldPrice) { 
		this.oldPrice = oldPrice;
	} 

	public ResourceNewPricesEntry oldPrice(net.zyuiop.ovhapi.api.objects.order.Price oldPrice) { 
		this.oldPrice = oldPrice;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public ResourceNewPricesEntry name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getNewPrice() { 
		return this.newPrice;
	} 

	public void setNewPrice(net.zyuiop.ovhapi.api.objects.order.Price newPrice) { 
		this.newPrice = newPrice;
	} 

	public ResourceNewPricesEntry newPrice(net.zyuiop.ovhapi.api.objects.order.Price newPrice) { 
		this.newPrice = newPrice;
		return this;
	} 

}
