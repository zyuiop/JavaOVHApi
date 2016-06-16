package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.FlavorPrice;
/**
 * Details about flavor pricing
 */

public class FlavorPriceImpl implements FlavorPrice { 

	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl monthlyPrice;
	private java.lang.String flavorId;
	private java.lang.String region;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl price;
	private java.lang.String flavorName;

	public FlavorPriceImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getMonthlyPrice() { 
		return this.monthlyPrice;
	} 

	public void setMonthlyPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
	} 

	public FlavorPriceImpl monthlyPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
		return this;
	} 

	public java.lang.String getFlavorId() { 
		return this.flavorId;
	} 

	public void setFlavorId(java.lang.String flavorId) { 
		this.flavorId = flavorId;
	} 

	public FlavorPriceImpl flavorId(java.lang.String flavorId) { 
		this.flavorId = flavorId;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public FlavorPriceImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
	} 

	public FlavorPriceImpl price(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
		return this;
	} 

	public java.lang.String getFlavorName() { 
		return this.flavorName;
	} 

	public void setFlavorName(java.lang.String flavorName) { 
		this.flavorName = flavorName;
	} 

	public FlavorPriceImpl flavorName(java.lang.String flavorName) { 
		this.flavorName = flavorName;
		return this;
	} 

}
