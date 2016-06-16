package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.StoragePrice;
/**
 * Details about storage pricing
 */

public class StoragePriceImpl implements StoragePrice { 

	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl monthlyPrice;
	private java.lang.String region;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl price;

	public StoragePriceImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getMonthlyPrice() { 
		return this.monthlyPrice;
	} 

	public void setMonthlyPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
	} 

	public StoragePriceImpl monthlyPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl monthlyPrice) { 
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

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
	} 

	public StoragePriceImpl price(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
		return this;
	} 

}
