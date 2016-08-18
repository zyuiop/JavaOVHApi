package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Details about snapshot pricing
 */

public class SnapshotPrice { 

	private net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice;
	private java.lang.String region;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public SnapshotPrice() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getMonthlyPrice() { 
		return this.monthlyPrice;
	} 

	public void setMonthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
	} 

	public SnapshotPrice monthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public SnapshotPrice region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public SnapshotPrice price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
