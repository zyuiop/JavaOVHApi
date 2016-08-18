package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Details about bandwidth storage pricing
 */

public class BandwidthStoragePrice { 

	private java.lang.String region;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public BandwidthStoragePrice() {
	}

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public BandwidthStoragePrice region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public BandwidthStoragePrice price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
