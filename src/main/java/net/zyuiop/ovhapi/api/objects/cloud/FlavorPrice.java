package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Details about flavor pricing
 */

public class FlavorPrice { 

	private net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice;
	private java.lang.String flavorId;
	private java.lang.String region;
	private net.zyuiop.ovhapi.api.objects.order.Price price;
	private java.lang.String flavorName;

	public FlavorPrice() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getMonthlyPrice() { 
		return this.monthlyPrice;
	} 

	public void setMonthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
	} 

	public FlavorPrice monthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
		return this;
	} 

	public java.lang.String getFlavorId() { 
		return this.flavorId;
	} 

	public void setFlavorId(java.lang.String flavorId) { 
		this.flavorId = flavorId;
	} 

	public FlavorPrice flavorId(java.lang.String flavorId) { 
		this.flavorId = flavorId;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public FlavorPrice region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public FlavorPrice price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

	public java.lang.String getFlavorName() { 
		return this.flavorName;
	} 

	public void setFlavorName(java.lang.String flavorName) { 
		this.flavorName = flavorName;
	} 

	public FlavorPrice flavorName(java.lang.String flavorName) { 
		this.flavorName = flavorName;
		return this;
	} 

}
