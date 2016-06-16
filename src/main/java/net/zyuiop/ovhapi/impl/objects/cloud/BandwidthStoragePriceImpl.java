package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.BandwidthStoragePrice;
/**
 * Details about bandwidth storage pricing
 */

public class BandwidthStoragePriceImpl implements BandwidthStoragePrice { 

	private java.lang.String region;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl price;

	public BandwidthStoragePriceImpl() {
	}

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public BandwidthStoragePriceImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
	} 

	public BandwidthStoragePriceImpl price(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
		return this;
	} 

}
