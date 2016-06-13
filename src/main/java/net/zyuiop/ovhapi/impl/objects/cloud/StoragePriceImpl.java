package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.StoragePrice;
/**
 * Details about storage pricing
 */

public class StoragePriceImpl implements StoragePrice { 

	private net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice;
	private java.lang.String region;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public StoragePriceImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getMonthlyPrice() { 
		return this.monthlyPrice;
	} 

	public void setMonthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
	} 

	public StoragePriceImpl monthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public StoragePriceImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public StoragePriceImpl price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
